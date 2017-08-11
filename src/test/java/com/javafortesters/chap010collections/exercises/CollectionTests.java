package com.javafortesters.chap010collections.exercises;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CollectionTests {

    @Test
    public void useAForLoopInsteadOfAWhileLoop(){
        String[] someDays = {"Tuesday", "Thursday", "Wednesday", "Monday", "Saturday", "Sunday", "Friday"};

        List<String> days = Arrays.asList(someDays);

        int i = 0;
        while (!days.get(i).equals("Sunday")){
            i++;
        }

        int j;
        for (j = 0; j < days.size(); j++){
            if (days.get(j).equals("Sunday")){
                break;
            }
        }

        assertEquals(5, j);
    }

    @Test
    public void createAndMsnipulateACollectionOfUsers(){
        Collection<User> users = new ArrayList();
        assertEquals(users.size(), 0);
        assertTrue(users.isEmpty());
        User terrance = new User("Terrance", "tpassword");
        User phillip = new User("Phillip", "ppassword");
        users.add(terrance);
        users.add(phillip);
        assertEquals(users.size(), 2);
        assertFalse(users.isEmpty());
        Collection<User> newUsers = new ArrayList<>();
        User itchy = new User("Itchy", "ipassword");
        User scratchy = new User("Scratchy", "spassword");
        newUsers.add(itchy);
        newUsers.add(scratchy);
        users.addAll(newUsers);
        assertEquals(4, users.size());
        assertTrue(users.containsAll(newUsers));
        newUsers.removeAll(users);
        assertEquals(newUsers.size(), 0);
        assertTrue(newUsers.isEmpty());
        users.clear();
        assertEquals(newUsers.size(), 0);
    }

    @Test
    public void createAndManipulateAListOfUsers(){
        List<User> users = new ArrayList<User>();
        assertEquals(0, users.size());
        assertTrue(users.isEmpty());

        User terrance = new User("Terrance", "tpassword");
        User phillip = new User("Phillip", "ppassword");

        users.add(terrance);
        assertEquals("Terrance", users.get(0).username);

        users.add(0, phillip);
        assertEquals("Phillip", users.get(0).username);

        assertEquals(1, users.indexOf(terrance));
        assertEquals(0, users.indexOf(phillip));

        users.remove(0);
        assertEquals(1, users.size());
        assertFalse(users.contains(phillip));
    }

    @Test
    public void createAndManipulateASetOfUsers(){
        Set<User> users = new HashSet<>();
        User user = new User ("Joey", "Tribbiany");
        users.add(user);
        users.add(user);
        assertEquals(1, users.size());
    }

    @Test
    public void createAndManipulateAMapOfUserObjects(){
        Map<String, User> users = new HashMap<>();
        User joey = new User ("Joey", "Tribbiany");
        User chandler = new User ("Chandler", "Bing");
        users.put("key1", joey);
        users.put("key1", chandler);
        assertEquals(1, users.size());
        assertEquals(chandler, users.get("key1"));
    }

}
