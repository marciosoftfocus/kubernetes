package com.gasparbarancelli.vendas.exception;

public class VendaNotFoundException extends RuntimeException{

    private Long id = 0L;

    public VendaNotFoundException() {

    }

    public VendaNotFoundException(Long id) {
        this.id = id;
    }

}
