package com.pb.zelenaja.hm8;

public class WrongPasswordException extends Throwable {

    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
