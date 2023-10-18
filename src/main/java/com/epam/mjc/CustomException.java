package com.epam.mjc;

public class CustomException extends IllegalArgumentException{
    CustomException(String message) {

        super(message);
    }
}
