package com.coding.arraysStings;

public class StringRotation
{
    public static boolean isRotation(String s1, String s2)
    {
        int length = s1.length();
        /* Check that s1 and s2 are eqal length and not empty */
        if (length == s2.length() && length > 0)
        {
            /* Concatenate s1 and s2 with new buffer */
            String s1s1 = s1 + s2;
            return isSubString(s1s1, s2);
        }
        return false;
    }

    public static boolean isSubString(String s1s1, String s2)
    {

        if (s1s1.contains(s2))
        {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args)
    {
        String s1 = "waterbottle";
        String s2 = "erbottlewat";
        
        if (isRotation(s1, s2))
        {
            System.out.println("The strings are  in rotation");
        } else
        {
            System.out.println(" The strings are not in rotation");
        }
    }
    
}
