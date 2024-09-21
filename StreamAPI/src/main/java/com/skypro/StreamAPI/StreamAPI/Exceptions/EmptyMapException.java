package com.skypro.StreamAPI.StreamAPI.Exceptions;

public class EmptyMapException extends RuntimeException {
    public EmptyMapException(Exception e) {
        super(e);
    }

    public EmptyMapException(String e) {
        System.out.println(e);
    }
}
