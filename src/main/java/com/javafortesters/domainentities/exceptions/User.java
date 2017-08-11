package com.javafortesters.domainentities.exceptions;

import com.javafortesters.customexceptions.InvalidPassword;
import com.javafortesters.domainobject.TestAppEnv;

public class User {

    public String username;
    public String password;
    public TestAppEnv env;


    public User(){
        this("username", "password", false);
    }

    public User(String username, String password) throws InvalidPassword {
        this.username = username;
        setPassword(password);

        env = new TestAppEnv();
    }

    private User(String username, String password, boolean b) {
        this.username = username;
        try{
            setPassword(password);
        }catch (InvalidPassword e){
            throw new IllegalArgumentException("Default password incorrect", e);
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) throws InvalidPassword {
        if (password.length() < 7) {
            throw new InvalidPassword();
        }
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return env.getUrl();
    }

    public String getPermission(){
        return "Normal";
    }
}

