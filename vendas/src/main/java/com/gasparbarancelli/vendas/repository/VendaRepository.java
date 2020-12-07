package com.gasparbarancelli.vendas.repository;

import com.gasparbarancelli.vendas.model.Venda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendaRepository  extends JpaRepository<Venda, Long> {
}
