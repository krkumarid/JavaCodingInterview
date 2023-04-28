package com.coding.arraysStings;

import java.util.Arrays;

public class CheckStringPermutation
{
    public static String sort(String str)
    {
        char[] content = str.toCharArray();
        
        Arrays.sort(content);
        
        // return content.toString();
        return new String(content);
    }

    public static boolean permutation(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args)
    {
        String s = "god";
        String t = "dog";
        
        if (permutation(s, t))
        {
            System.out.println("  The strings are in permutation ");
        } else
        {
            System.out.println(" The strings are not in permutation");
        }
    }
    
}
