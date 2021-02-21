package com.digital.common.exception;

public class GlobalAPIServiceException extends RuntimeException {

    private static final long serialVersionUID = -1L;

    public GlobalAPIServiceException() {
        super();
    }

    public GlobalAPIServiceException(final String message) {
        super(message);
    }
}

