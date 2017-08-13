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
public class IntVectorTest {
    
    public IntVectorTest() {
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
    public void testInsertEndMethod() {
        int value = 11;
        IntVector intVector = new IntVector();
        
        intVector.insertEnd(value);
        
        assertEquals(value, intVector.getIndex(0));
    }
    
    @Test
    public void testSizeMethod() {
        IntVector intVector = new IntVector();
        int firstValue = 3;
        int secondValue = 5;
        
        intVector.insertEnd(firstValue);
        intVector.insertEnd(secondValue);
        
        assertEquals(intVector.size(), 2);
    }
    
    @Test
    public void testGetIndexMethod() {
        IntVector intVector = new IntVector();
        int getIndex = 1;
        int firstValue = 4;
        int secondValue = 7;
        
        intVector.insertEnd(firstValue);
        intVector.insertEnd(secondValue);
        
        assertEquals(intVector.getIndex(getIndex), 7);
    }
    
    @Test
    public void testSetIndexMethod() {
        IntVector intVector = new IntVector();
        int setIndex = 0;
        int firstValue = 3;
        int secondValue = 10;
        
        intVector.insertEnd(firstValue);
        intVector.insertEnd(secondValue);
        intVector.setIndex(0, 11);
        
        assertEquals(intVector.getIndex(0), 11);
    }
}
