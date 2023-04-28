package com.coding.stringManiputations;

import java.util.StringTokenizer;

public class CountWordsUsingStringTokenizer
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        String str = "Arise! Awake! and stop not until the goal is reached.";
        String[] arrWords = str.split(" ");
        System.out.println(arrWords.length);

        StringTokenizer strToken = new StringTokenizer(str);
        System.out.println(strToken.countTokens());
        
    }
    
}
