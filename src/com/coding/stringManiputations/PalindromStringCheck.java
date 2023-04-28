package com.coding.stringManiputations;

public class PalindromStringCheck
{

    public static void main(String[] args)
    {
        String str = "malayalam";
        
        /*
         * String temp = " "; StringBuilder sb = new StringBuilder(); int nLength =
         * str.length() - 1; int m = nLength; for (int i = nLength; i >= 0; i--) { temp
         * += str.charAt(i); sb.append(str.charAt(i)); } if
         * (str.equalsIgnoreCase(temp.trim())) {
         * System.out.println("The given String is a Palindrom "); } else {
         * System.out.println("The given String is not a Palindrom "); } if
         * (str.equalsIgnoreCase(sb.toString())) {
         * System.out.println("StringBuilder : The given String is a Palindrom "); }
         */
        if (CheckThePalindrom(str))
        {
            System.out.println(" Palindrome");
        } else
        {
            System.out.println(" Not a Palindrome");
        }
    }
    
    public static boolean CheckThePalindrom(String str)
    {
        int length = str.length() - 1;
        int m = length;
        for (int i = 0; i < length; i++)
        {
            if (str.charAt(i) != str.charAt(m))
            {
                return false;
            } else
            {
                m--;
            }
        }
        return true;

    }
}
