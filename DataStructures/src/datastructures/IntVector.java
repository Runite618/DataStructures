/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Arrays;

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
    
    public void printArray()
    {
        for(int i = 0; i < array.length; i++)
        {
            System.out.print(array[i] + " ");
        }
    }

    private int[] array;
    private int size;
    
    public IntVector()
    {
        int startingCapacity = 4;
        
        array = new int[startingCapacity];
    }
    
    // Add a new entry to end of array
    public void insertEnd(int a)
    {
        if(size == array.length)
        {
            array = Arrays.copyOf(array, array.length * 2);
        }
        array[size] = a;
        size++;
    }
    
    // Get value at an index
    public int getIndex(int index)
    {
        return array[index];
    }
    
    // Set value at an index
    public void setIndex(int index, int value)
    {
        array[index] = value;
    }
    
    // return size
    public int size()
    {
        return size;
    }
}