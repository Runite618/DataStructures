/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructures;

import java.util.Vector;

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
        IntVector intVector = new IntVector();
        int a = 1, b = 2, c = 3;
        intVector.insertEnd(a);
        intVector.insertEnd(b);
        intVector.insertEnd(c);
        intVector.getIndex(1);
        intVector.setIndex(2, 11);
        System.out.println(intVector.size());
        for(int i = 0; i < intVector.size(); i++)
        {
            System.out.printf("%d ", intVector.getIndex(i));
        }
    }

    private Vector vector;
    
    public IntVector()
    {
        vector = new Vector();
    }
    
    // Add a new entry to end of array
    public void insertEnd(int a)
    {
        vector.add(a);
    }
    
    // Get value at an index
    public int getIndex(int index)
    {
        return (int) vector.get(index);
    }
    
    // Set value at an index
    public void setIndex(int index, int value)
    {
        vector.set(index, value);
    }
    
    // return size
    public int size()
    {
        return vector.size();
    }
    
    public Vector getVector()
    {
        return vector;
    }
    
    public void setVector(Vector vector)
    {
        this.vector = vector;
    }
}