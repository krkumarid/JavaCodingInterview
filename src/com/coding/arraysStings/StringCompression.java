package com.coding.arraysStings;

import java.util.HashMap;
import java.util.Map;

public class StringCompression
{
    public static void compressString(String str)
    {
        HashMap<Character, Integer> cmpMap = new HashMap<Character, Integer>();
        char[] chArr = str.toCharArray();
        for (char c : chArr)
        {

            if (cmpMap.containsKey(c))
            {
                cmpMap.put(c, cmpMap.get(c) + 1);
            } else
            {
                cmpMap.put(c, 1);
            }
        }
        
        for (Map.Entry<Character, Integer> m : cmpMap.entrySet())
        {
            System.out.print(m.getKey().toString() + m.getValue());
        }
        System.out.println("\n ------ Using stream-----");
        cmpMap.forEach((t, u) -> System.out.print(t.toString() + u));
    }
    
    public static void main(String[] args)
    {
        String str = "aaabbcccdddd";// a3b2c3d4
        compressString(str);
    }
    
}
