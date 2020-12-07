package com.gasparbarancelli.vendas.converter;

import com.gasparbarancelli.vendas.dto.VendaItemPersistDto;
import com.gasparbarancelli.vendas.dto.VendaPersistDto;
import com.gasparbarancelli.vendas.model.Venda;
import com.gasparbarancelli.vendas.model.VendaItem;
import com.gasparbarancelli.vendas.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class VendaPersistDtoConverter {

    private final ProdutoRepository produtoRepository;

    public VendaPersistDtoConverter(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public Venda toVenda(VendaPersistDto dto) {
        Set<VendaItem> vendaItemList = new HashSet(dto.getItens().size());
        for (VendaItemPersistDto itemDto : dto.getItens()) {
            var optionalProduto = produtoRepository.findById(itemDto.getProduto());
            if (optionalProduto.isPresent()) {
                var produto = optionalProduto.get();
                var vendaItem = new VendaItem(produto, itemDto.getQuantidade(), itemDto.getValor());
                vendaItemList.add(vendaItem);
            }

        }

        return new Venda(vendaItemList, BigDecimal.ZERO, dto.getEmail());
    }

}
