package com.pb.zelenaja.hm8;

public class WrongLoginException extends Throwable {

    public WrongLoginException() {

    }

    public WrongLoginException(String message) {
        super(message);
    }
}
