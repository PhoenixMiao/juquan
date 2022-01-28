package com.phoenix.juquan.exception;

import lombok.Getter;
import com.phoenix.juquan.common.EnumExceptionType;

@Getter
public class RRException extends RuntimeException {

    private EnumExceptionType enumExceptionType;

    public RRException() {
    }

    public RRException(EnumExceptionType enumExceptionType) {
        this.enumExceptionType = enumExceptionType;
    }
}
