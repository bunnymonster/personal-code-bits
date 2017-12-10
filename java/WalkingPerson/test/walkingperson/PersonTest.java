/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package walkingperson;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author weber_000
 */
public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getX method, of class Person.
     */
    @Test
    public void testGetXDefault() {
        System.out.println("Testing getX");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of setX method, of class Person.
     */
    @Test
    public void testSetXDefault() {
        System.out.println("Testing setX");
        int x = 0;
        Person instance = new Person();
        int expResult = 1;
        instance.setX(1);
        int result = instance.getX();
        assertEquals(expResult, result);
    }

    /**
     * Test of getY method, of class Person.
     */
    @Test
    public void testGetYDefault() {
        System.out.println("Testing getY");
        Person instance = new Person();
        int expResult = 0;
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of setY method, of class Person.
     */
    @Test
    public void testSetYDefault() {
        System.out.println("Testing setY");
        int y = 0;
        Person instance = new Person();
        int expResult = 1;
        instance.setY(1);
        int result = instance.getY();
        assertEquals(expResult, result);
    }

    /**
     * Test of parsePath method, of class Person.
     */
    @Test
    public void testParsePathForward() {
        System.out.println("Testing parsePathForward");
        String path = "FFFF";
        Person instance = new Person();
        String expResult = "4,0";
        instance.parsePath(path);
        String result = instance.getX()+","+instance.getY();
        assertEquals(expResult,result);
    }
    
    @Test
    public void testParsePathBackward() {
        System.out.println("Testing parsePathBackward");
        String path = "BBBB";
        Person instance = new Person();
        String expResult = "-4,0";
        instance.parsePath(path);
        String result = instance.getX()+","+instance.getY();
        assertEquals(expResult,result);
    }
    
    @Test
    public void testParsePathWithLeftTurn() {
        System.out.println("Testing parsePathLeftTurn");
        String path = "FFLFF";
        Person instance = new Person();
        String expResult = "2,2";
        instance.parsePath(path);
        String result = instance.getX()+","+instance.getY();
        assertEquals(expResult,result);
    }
    
    @Test
    public void testParsePathWithRightTurn() {
        System.out.println("Testing parsePathRightTurn");
        String path = "FFRFF";
        Person instance = new Person();
        String expResult = "2,-2";
        instance.parsePath(path);
        String result = instance.getX()+","+instance.getY();
        assertEquals(expResult,result);
    }

    /**
     * Test of clearPath method, of class Person.
     */
    @Test
    public void testClearPath() {
        System.out.println(" Testing clearPath");
        Person instance = new Person();
        String expResult = "0,0";
        instance.setX(1);
        instance.setY(1);
        instance.clearPath();
        String result = instance.getX()+","+instance.getY();
        assertEquals(expResult,result);
    }
    
}
