package com.qf.exercise.user.exception;


public class NotLoginException extends Exception {
    public NotLoginException() {
    }

    public NotLoginException(String string) {
        super(string);
    }
}
