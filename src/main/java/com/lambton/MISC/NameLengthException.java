package com.lambton.MISC;

//Created by Ramanpreet Singh and Nitin Jaswal
public class NameLengthException extends Exception {

    private String message;

    public NameLengthException(String message)
    {
        super(message);
        this.message = message;
    }
}

