package org.suai.lab3.exceptions;

public class BadMatrixSizesException extends MatrixException {
    public BadMatrixSizesException(String message) {
        super("BadSize: " + message);
    }
}