package com.coding.stringManiputations;

public class ReverseWordsInString
{
    
    public static void main(String[] args)
    {
        String str = "Apple Kiwi Banana Pinapple";

        System.out.println(reverseWordsWithoutStringBuilder(str));
        
    }
    
    public static String reverseWordsWithoutStringBuilder(String str)
    {
        String[] words = str.split("\\s");
        String revWords = "";
        for (int i = words.length - 1; i >= 0; i--)
        {
            revWords += words[i];
            revWords += " ";
        }
        return revWords;
    }
    
    public static String revereWords(String str)
    {
        StringBuilder sb = new StringBuilder();
        String[] words = str.split(" ");
        int nLength = words.length - 1;
        for (int i = nLength; i >= 0; i--)
        {
            sb.append(words[i] + " ");
            
        }
        return sb.toString();
    }
}
