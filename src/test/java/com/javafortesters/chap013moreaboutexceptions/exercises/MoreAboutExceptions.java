package com.javafortesters.chap013moreaboutexceptions.exercises;

import com.javafortesters.customexceptions.InvalidPassword;
import com.javafortesters.domainentities.exceptions.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class MoreAboutExceptions {

    @Test
    public void createAnInvalidPasswordException(){
        try {
            User joey = new User("Joey", "short");
            fail("An exception should be thrown");
        }
        catch (InvalidPassword invalidPassword){
            assertTrue("The exception was thrown", true);
        }
    }

    @Test
    public void checkInvalidPasswordExceptionInSetPasswordMethod(){
        User joey = new User();
        try{
            joey.setPassword("small");
            fail("An exception should be thrown");
        }
        catch (InvalidPassword invalidPassword){
            assertTrue("The exception was thrown", true);
        }
    }

    @Test
    public void checkInvalidPasswordExceptionIsNotThrownInDefaultConstructor(){
            User joey = new User();
    }

    @Test
    public void errorMessage(){
        try {
            User joey = new User("Joey", "short");
            fail("An exception should be thrown");
        }
        catch (InvalidPassword invalidPassword){
            assertTrue("The exception was thrown", true);
            assertEquals("Password must be > 6 chars", invalidPassword.getMessage());
        }
    }
}
