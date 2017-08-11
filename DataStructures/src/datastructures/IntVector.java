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
        int valueInsert = 11;
        int index = 2;
        
        IntVector intVector = new IntVector();
        intVector.insertEnd(valueInsert);
        System.out.println("This is the following array when insertEnd method is called with the value " + valueInsert + " inserted");
        for(int i = 0; i < intVector.newArray.length; i++)
        {
            System.out.print(intVector.newArray[i] + " ");
        }
        System.out.println("");
        System.out.println("This is the following size of the array");
        System.out.println(intVector.size());
        System.out.println("This is the value at at a particular index " + index);
        System.out.println(intVector.getIndex(index));
    }

    private int[] array;
    private int[] newArray;
    
    public IntVector()
    {
        array = new int[] {1, 2, 77};
    }
    
    // Add a new entry to end of array
    public void insertEnd(int a)
    {
        newArray = new int[array.length * 2];
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            newArray[i] = array[i];
            count++;
        }
        newArray[count] = a;
    }
    
    // Get value at an index
    public int getIndex(int index)
    {
        int value = 0;
        
        for(int i = 0; i < array.length; i++)
        {
            if(i == index)
            {
                value = array[index];
            }
        }
        
        return value;
    }
    
    // Set value at an index
    public void setIndex(int index, int value)
    {
        
    }
    
    // return size
    public int size()
    {
        int count = 0;
        
        for(int i : newArray)
        {
            count++;
        }
        
        return count;
    }
}