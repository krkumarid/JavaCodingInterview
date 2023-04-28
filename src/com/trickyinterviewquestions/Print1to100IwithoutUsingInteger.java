package com.trickyinterviewquestions;

public class Print1to100IwithoutUsingInteger
{
    /*
     * Print 1-100 without using integer numbers
     */
    public static void main(String[] args)
    {
        // Method 1 using character and strinf length value
        int one = 'A' / 'A';
        String s1 = "..........";
        for (int i = one; i <= (s1.length() * s1.length()); i++)
        {
            System.out.println(i);
        }
        
        // Method 2: using the ASCII value
        System.out.println(" Printing 1-100 using ASCII value");
        for (int j = one; j <= 'd'; j++)
        {
            System.out.println(j);
        }
    }
    
}
