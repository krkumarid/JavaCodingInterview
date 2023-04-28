package com.coding.arraysStings;

import java.util.HashMap;
import java.util.Map;

public class CountOfEachElementInAnArray
{
    public static void getElementsCount(int arr[])
    {
        Map<Integer, Integer> eleMap = new HashMap<Integer, Integer>();
        for (int n : arr)
        {
            if (eleMap.containsKey(n))
            {
                eleMap.put(n, eleMap.get(n) + 1);

            } else
            {
                eleMap.put(n, 1);
            }
        }
        System.out.println(eleMap);
    }

    public static void main(String[] args)
    {
        int[] array = { 1, 1, 2, 3, 3, 4, 5, 5, 5, 5, 6, 8, 9, 9 };
        getElementsCount(array);
        int[] fr = new int[array.length];
        int visited = -1;

        for (int i = 0; i < array.length; i++)
        {
            int count = 1;
            for (int j = i + 1; j < array.length; j++)
            {
                if (array[i] == array[j])
                {
                    count++;
                    fr[j] = visited;
                }
            }
            if (fr[i] != visited)
            {
                fr[i] = count;
            }
        }
        for (int k = 0; k < fr.length; k++)
        {
            if (fr[k] != visited)
            {
                System.out.println(array[k] + ":" + fr[k]);
            }
        }

    }

}
