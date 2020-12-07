package com.gasparbarancelli.cupons.config;

import com.gasparbarancelli.cupons.exception.CupomNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionAdviceConfiguration {

    public String noResultExceptionHandler(CupomNotFoundException e) {
        return e.getMessage();
    }
}
