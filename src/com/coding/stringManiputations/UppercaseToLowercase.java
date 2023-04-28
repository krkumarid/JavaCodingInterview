package com.coding.stringManiputations;

public class UppercaseToLowercase
{
    
    public static void main(String[] args)
    {
        String str = "wElcomEtoScAleR";
        
        uppercaseToLowercase(str);

    }

    private static void uppercaseToLowercase(String str)
    {
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++)
        {
            char ch = s[i];
            if (ch >= 'A' && ch <= 'Z')
            {
                char ansCh = (char) (ch - 'A' + 'a');
                s[i] = ansCh;
            }
        }
        for (char ch : s)
        {
            System.out.print(ch);
        }
    }
    
}
