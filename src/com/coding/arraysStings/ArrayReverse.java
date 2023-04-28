package com.coding.arraysStings;

public class ArrayReverse
{
    /*
     * Prgram to Reverse the Array.
     */
    public static void main(String[] args)
    {
        
        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        
        // we will use two 'pointers'. One pointer will start from the beginning
        // another one from the back and we will swap their values
        int nLength = array.length - 1;
        int temp;
        int j = nLength;
        // our loop will go till half of our input array
        // 'i' is a pointer that will start from the beginning
        // for (int i = 0; i < nLength; i++)
        // {
        //
        // temp = array[i];
        // array[i] = array[j];
        // array[j] = temp;
        // j--;
        // }
        // for (int n : array)
        // {
        // System.out.print(n);
        // }
        for (int m = 0; m < nLength / 2; m++)
        {
            int tmp = array[m];
            array[m] = array[j - m];
            array[j - m] = tmp;
        }
        for (int n : array)
        {
            System.out.print(n);
        }
    }
    
}
