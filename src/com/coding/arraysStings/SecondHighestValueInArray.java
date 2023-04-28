package com.coding.arraysStings;

import java.util.Arrays;

public class SecondHighestValueInArray
{
    public static void main(String[] args)
    {
        int[] array = { 10, 5, 8, 9, 6, 7, 1, 2, 11 };
        Arrays.sort(array);
        int length = array.length;
        System.out.println("Sorted Array :" + array[length - 2]);
        System.out.println("Second Highest :" + findSecondHighest(array));

    }

    private static int findSecondHighest(int[] array)
    {
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int i : array)
        {
            if (i > highest)
            {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest)
            {
                secondHighest = i;
            }
        }
        return secondHighest;
    }
}
