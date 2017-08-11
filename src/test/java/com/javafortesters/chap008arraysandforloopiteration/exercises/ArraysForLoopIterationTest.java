package com.javafortesters.chap008arraysandforloopiteration.exercises;

import com.javafortesters.domainentities.User;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysForLoopIterationTest {

    @Test
    public void createAnArrayOfUsers(){
        User[] users = {new User("Andrey", "apassword"),
                        new User("Peter", "ppassword"),
                        new User("John", "jpassword3")};

        assertEquals("Andrey", users[0].username);
        for(User user : users) {
            System.out.println(user.username);
        }
    }

    @Test
    public void createAnArrayOf100Users(){
        User[] users = new User[100];
        for (int i = 0; i < 100; i++){
            users[i] = new User("user" + (i + 1), "password" + (i + 1));
            assertEquals(users[i].getUsername(), "user" + (i + 1));
            assertEquals(users[i].getPassword(), "password" + (i + 1));
        }
    }

    @Test
    public void sortWorkdaysArrayAndAssertResult(){
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        Arrays.sort(workdays);

        assertEquals("Friday", workdays[0]);
        assertEquals("Monday", workdays[1]);
        assertEquals("Thursday", workdays[2]);
        assertEquals("Tuesday", workdays[3]);
        assertEquals("Wednesday", workdays[4]);

    }

    @Test
    public void sortWorkdaysArrayAndAssertResultTwo(){
        String[] workdays = {"monday", "Tuesday", "Wednesday", "thursday", "Friday"};
        Arrays.sort(workdays);

        assertEquals("Friday", workdays[0]);
        assertEquals("monday", workdays[3]);
        assertEquals("thursday", workdays[4]);
        assertEquals("Tuesday", workdays[1]);
        assertEquals("Wednesday", workdays[2]);

    }

    public void print2DIntArray(int [][]multi){
        for(int[] outer : multi){
            if(outer==null){
                System.out.print("null");
            }else{
                for(int inner : outer){
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

    @Test
    public void createATriangle(){
        int[][] ragged = new int[16][];
        for (int i = 0; i < ragged.length; i++){
            ragged[i] = new int[i+1];
            for (int j = 0; j <= i; j++){
                ragged[i][j] = j;
            }
        }

        print2DIntArray(ragged);


    }

}
