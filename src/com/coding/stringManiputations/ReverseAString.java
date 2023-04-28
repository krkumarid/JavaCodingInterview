package com.coding.stringManiputations;

public class ReverseAString
{

    public static void main(String[] args)
    {
        String strOrg = "Rajeevkumar123";
        System.out.println(reverseString(strOrg));
        int nLength = strOrg.length() - 1;
        String rev = " ";
        for (int i = nLength; i >= 0; i--)
        {
            rev += strOrg.charAt(i);
        }
        System.out.println(rev);
    }
    
    public static String reverseString(String strOrg)
    {
        StringBuilder sb = new StringBuilder();
        int nLength = strOrg.length() - 1;
        for (int i = nLength; i >= 0; i--)
        {
            sb.append(String.valueOf(strOrg.charAt(i)));
        }
        return sb.toString();
    }

}
