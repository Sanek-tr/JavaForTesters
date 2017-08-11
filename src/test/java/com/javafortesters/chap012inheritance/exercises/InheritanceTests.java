package com.javafortesters.chap012inheritance.exercises;

import com.javafortesters.domainentities.ReadOnlyUser;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InheritanceTests {

    @Test
    public void createAUserThatIsComposedOfTestAppEnv(){
        User andrew = new User();
        String url = andrew.getUrl();

        assertEquals("http://192.123.0.3:67", url);
    }

    @Test
    public void createAReadOnlyUser(){
        User andrew = new ReadOnlyUser();
        assertEquals("ReadOnly", andrew.getPermission());
    }

}
