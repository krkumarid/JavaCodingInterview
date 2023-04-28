package com.coding.stringManiputations;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatingCharactersInString
{

    public static void main(String[] args)
    {
        String str = "My name is Rajeevkumar";
        
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        
        for (int i = 0; i < str.length() - 1; i++)
        {
            char c = str.charAt(i);

            if (map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
                
            } else
            {
                map.put(c, 1);
            }
        }
        
        System.out.println(map);
    }

}
