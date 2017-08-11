package com.javafortesters.domainentities;

import com.javafortesters.domainobject.TestAppEnv;

public class User {

    public String username;
    public String password;
    public TestAppEnv env;

    public User(){
        this("username", "password");
    }

    public User(String username, String password){
        this.username = username;
        this.password = password;

        env = new TestAppEnv();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUrl() {
        return env.getUrl();
    }

    public String getPermission() {
        return "Normal";
    }
}
