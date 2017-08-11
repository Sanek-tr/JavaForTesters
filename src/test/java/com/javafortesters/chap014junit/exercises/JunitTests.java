package com.javafortesters.chap014junit.exercises;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.*;

public class JunitTests {

    @Test
    public void createATestMethodWhichUsesAllOfTheAsserts(){
        assertEquals(6, 4+2);
        assertFalse(3 < 2);
        assertTrue(3 > 2);
        assertArrayEquals(new int[]{2, 3, 5}, new int[]{2, 3, 5});
        assertNotNull(3);
        assertNotSame(new User("Andrew", "password"), new User("Paul", "password"));
        assertNull(null);
        User andrew = new User("Andrew", "password");
        assertSame(andrew, andrew);
    }
}
