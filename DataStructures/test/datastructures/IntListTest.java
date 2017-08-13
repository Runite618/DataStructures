/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matth
 */
public class IntListTest {
    
    public IntListTest() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    
    @Test
    public void testInsertBackMethod() {
        IntList intList = new IntList();

        for (int i = 0; i < 100; i++) {
            intList.insertBack(i);
        }
        
        assertEquals(intList.size(), 100);
    }
    
    @Test
    public void testRemoveBackMethod() {
        IntList intList = new IntList();

        for (int i = 0; i < 100; i++) {
            intList.insertBack(i);
        }
        
        for(int i = 0; i < 50; i++) {
            intList.removeBack();
        }
        
        assertEquals(intList.size(), 50);
    }
}
