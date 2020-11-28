package com.gasparbarancelli.produto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gasparbarancelli.produto.model.*;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {


}
