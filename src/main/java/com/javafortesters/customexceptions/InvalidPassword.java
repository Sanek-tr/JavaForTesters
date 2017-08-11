package com.javafortesters.customexceptions;

public class InvalidPassword extends Exception {
    public InvalidPassword (){
        super("Password must be > 6 chars");
    }
}
