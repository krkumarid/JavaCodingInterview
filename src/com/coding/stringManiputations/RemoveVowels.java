package com.coding.stringManiputations;

public class RemoveVowels
{
    
    public static void main(String[] args)
    {
        String str = "My nAme is rajeev";
        removeVowels(str);
    }

    public static void removeVowels(String str)
    {
        for (int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O'
                    || ch == 'u' || ch == 'U')
            {
                continue;
            }
            System.out.print(ch);
        }
    }
}
