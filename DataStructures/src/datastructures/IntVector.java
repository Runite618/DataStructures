/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.lang.reflect.Array;

/**
 *
 * @author matth
 */
public class IntVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

    }

    private int[] array;
    
    public IntVector()
    {
        array = new int[] {1, 2, 3};
    }
    
    // Add a new entry to end of array
    public void insertEnd(int a)
    {
        int[] newArray = new int[array.length * 2];
        int count = 0;
        for(int i = 0; i < array.length - 1; i++)
        {
            newArray[i] = array[i];
            count++;
        }
        newArray[count] = a;
    }
    
    // Get value at an index
    public int getIndex(int index)
    {
        return 0;
    }
    
    // Set value at an index
    public void setIndex(int index, int value)
    {
        
    }
    
    // return size
    public int size()
    {
        int count = 0;
        
        for(int i : array)
        {
            count++;
        }
        
        return count;
    }
}