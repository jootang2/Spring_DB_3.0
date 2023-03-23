package com.inflearn.springtx.order;

public class NotEnoughMoneyException extends Exception{

    public NotEnoughMoneyException(String message) {
        super(message);
    }
}
