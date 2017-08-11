package com.javafortesters.chapp007selectiondecisions.examples;

import org.junit.Test;

import static com.javafortesters.selectiondecisions.Cats.catOrCats;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SelectionTest {

    @Test
    public void numberOfCats(){
        assertEquals("2 == cats", "cats", catOrCats(3));
    }

    @Test
    public void truthyIsTrue(){
        boolean truthy = true;
        if (truthy == true)
            assertTrue(truthy);
    }

    @Test
    public void truthyIsTrueTwoChecks(){
        boolean truthy = true;
        if (truthy == true) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void elseStatementCheck(){
        boolean truthy = true;
        if (truthy)
            assertTrue(truthy);
        else
            assertFalse(truthy);
    }

    @Test
    public void elseStatementCheckBraces(){
        boolean truthy = true;
        if (truthy) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
        else
            assertFalse(truthy);
    }

    @Test
    public void nestedIfElseHorror(){
        boolean truthy = false;
        boolean falsey = false;

        if (truthy){
            if (!falsey){
                if (truthy && !falsey){
                    if (falsey || truthy){
                        assertTrue(truthy);
                        assertFalse(falsey);
                    }
                }
            }else{
                assertTrue(truthy);
                assertTrue(falsey);
            }
        }else{
            if (!truthy) {
                if (falsey) {
                    assertTrue(falsey);
                    assertFalse(truthy);
                } else {
                    assertFalse(falsey);
                    assertFalse(truthy);
                }
            }
        }
    }

    @Test
    public void SwitchOnShortCode(){
        String shortCode = "uk";
        String country;
        switch (shortCode.toUpperCase()){
            case "UK":
                country = "United Kingdom";
                break;
            case "US":
            case "USA":
                country = "United States";
                break;
            case "FR":
                country = "France";
                break;
            case "SE":
                country = "Sweden";
                break;
            default:
                country = "Rest Of World";
        }

        assertEquals("United Kingdom", country);
    }

    @Test
    public void switchOnInt(){
        int inputNumber = 1;
        assertEquals("One", getNumberNoBreaks(inputNumber));
    }

    private String getNumber(int inputNumber) {
        String numberToReturn = "";
        if (inputNumber > 4){
            numberToReturn = "Too big";
        }else{
            switch(inputNumber){
                case 1:
                    numberToReturn = "One";
                    break;
                case 2:
                    numberToReturn = "Two";
                    break;
                case 3:
                    numberToReturn = "Three";
                    break;
                case 4:
                    numberToReturn = "Four";
                    break;
                default:
                    numberToReturn = "Too small";
            }
        }
        return numberToReturn;
    }

    private String getNumberNoBreaks(int inputNumber) {
        String numberToReturn = "";
        if (inputNumber > 4){
            numberToReturn = "Too big";
        }else{
            switch(inputNumber){
                case 1:
                    return  "One";
                case 2:
                    return  "Two";
                case 3:
                    return "Three";
                case 4:
                    return  "Four";
                default:
                    return  "Too small";
            }
        }
        return numberToReturn;
    }




}



