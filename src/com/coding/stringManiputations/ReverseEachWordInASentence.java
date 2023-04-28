package com.coding.stringManiputations;

/*
 * Program to reverse all the words in a sentence
 */
public class ReverseEachWordInASentence
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String sentence = "Hello How are you Rajeevkumar";
        String[] words = sentence.split(" ");
        
        for (int i = 0; i < words.length; i++)
        {
            String rev = "";
            String word = words[i];
            for (int j = word.length() - 1; j >= 0; j--)
            {
                rev = rev + word.charAt(j);
            }
            System.out.print(rev);
            System.out.print(" ");
        }
    }
    
}
