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
        int valueInsert = 11;
        int getIndex = 0;
        int setIndex = 0;
        int value = 100;
        
        IntVector intVector = new IntVector();
        System.out.println("This the array:");
        intVector.printArray();
        System.out.println("");
        System.out.println("This is the following array when insertEnd method is called with the value " + valueInsert + " inserted");
        intVector.insertEnd(valueInsert);
        intVector.printArray();
        System.out.println("");
        System.out.println("This is the following size of the array");
        System.out.println(intVector.size());
        System.out.println("This is the value at at a particular index " + getIndex);
        System.out.println(intVector.getIndex(getIndex));
//        System.out.println("This is the array when set index " + setIndex + " with value " + value);
//        intVector.setIndex(setIndex, value);
        intVector.printArray();
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
        array = new int[array.length * 2];
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(i == index)
            {
                array[i] = value;
            }
            else
            {
                array[i] = array[i];
            }
        }
    }
    
    // return size
    public int size()
    {
        return size;
    }
}