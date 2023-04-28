package com.coding.arraysStings;

public class UniqueCharInString
{
    public static boolean isUniqueChars(String str)
    {
        boolean[] char_set = new boolean[128]; // For loop cannot loop more than 128 chars
        for (int i = 0; i < str.length(); i++)
        {
            int val = str.charAt(i);
            if (char_set[val])
            {
                return false;
            }
            char_set[val] = true;
        }
        return true;

    }
    
    public static void main(String[] args)
    {
        String word = "Karthi";
        if (isUniqueChars(word))
        {
            System.out.println("The characters in the string are unique");
        } else
        {
            System.out.println(" The characters in the string are not unique");
        }
    }

}
