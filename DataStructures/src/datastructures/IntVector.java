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
        int getIndex = 2;
        int setIndex = 0;
        int value = 100;
        
        IntVector intVector = new IntVector();
        intVector.insertEnd(valueInsert);
        System.out.println("This is the vanilla array:");
        for(int i = 0; i < intVector.array.length; i++)
        {
            System.out.print(intVector.array[i] + " ");
        }
        System.out.println("");
        System.out.println("This is the following array when insertEnd method is called with the value " + valueInsert + " inserted");
        intVector.printNewArray(intVector);
        System.out.println("");
        System.out.println("This is the following size of the array");
        System.out.println(intVector.size());
        System.out.println("This is the value at at a particular index " + getIndex);
        System.out.println(intVector.getIndex(getIndex));
        System.out.println("This is the array when set index " + setIndex + " with value " + value);
        intVector.setIndex(setIndex, value);
        intVector.printNewArray(intVector);
    }
    
    public void printNewArray(IntVector intVector)
    {
        for(int i = 0; i < intVector.newArray.length; i++)
        {
            System.out.print(intVector.newArray[i] + " ");
        }
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
        newArray = new int[array.length * 2];
        int count = 0;
        for(int i = 0; i < array.length; i++)
        {
            if(i == index)
            {
                newArray[i] = value;
            }
            else
            {
                newArray[i] = array[i];
            }
        }
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