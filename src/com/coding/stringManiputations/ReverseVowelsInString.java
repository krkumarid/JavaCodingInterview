package com.coding.stringManiputations;

public class ReverseVowelsInString
{

    public static void main(String[] args)
    {
        String str = "welcometoscalar";
        reverseVowels(str);
    }
    
    private static void reverseVowels(String str)
    {
        char[] s = str.toCharArray();
        int i = 0;
        int j = str.length() - 1;

        while (i < j)
        {
            while (s[i] != 'a' && s[i] != 'e' && s[i] != 'i' && s[i] != 'o' && s[i] != 'u')
            {
                i++;
            }
            while (s[j] != 'a' && s[j] != 'e' && s[j] != 'i' && s[j] != 'o' && s[j] != 'u')
            {
                j--;
            }
            if (i >= j)
            {
                break;
            }
            char ch = s[i];
            s[i] = s[j];
            s[j] = ch;
            i++;
            j--;
        }
        for (char ch : s)
        {
            System.out.print(ch);
        }
    }

}
