package org.suai.lab3.exceptions;

public class MatrixException extends RuntimeException {
    public MatrixException(String message) {
        super("MatrixException: " + message);
    }
}