package com.nelioalves.cursomc.exceptions;

public class ObjectNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -2115953166800036063L;

    public ObjectNotFoundException(String msg) {
        super(msg);
    }

    public ObjectNotFoundException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
