package com.coding.arraysStings;

public class MissingNumberInArray
{

    public static void main(String[] args)
    {
        int[] array = { 1, 2, 4, 5, 8, 9, 7, 10 };
        // List list = Arrays.asList(array);
        // Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for (int i = 1; i <= 10; i++)
        {
            if (!(checkForMiss(array, i)))
            {
                System.out.println("Missing number is:" + i);
                break;
            }

        }

    }
    
    private static boolean checkForMiss(int[] array, int i)
    {

        for (int j = 0; j < array.length; j++)
        {
            if (array[j] == i)

            {
                return true;
            } else
            {
                return false;
            }
        }
        return false;
    }

}
