package com.coding.arraysStings;

import java.util.HashMap;
import java.util.Map;

public class RepeatingCharacherWithCount
{

    public static void main(String[] args)
    {
        String str = "AAAABCCC";
        int count = 0;
        System.out.println("**** Count using Map ****");
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        char[] chArray = str.toCharArray();
        for (char c : chArray)
        {
            if (map.containsKey(c))
            {
                map.put(c, map.get(c) + 1);
            } else
            {
                map.put(c, 1);

            }
        }
        System.out.println(map);
        System.out.println("**** Count using withot map ****");
        for (int i = 0; i < chArray.length; i++)
        {
            if (chArray[i] == '0')
            {
                continue;
            }
            count = 1;
            for (int j = i + 1; j < chArray.length; j++)
            {
                if (chArray[i] == chArray[j])
                {
                    
                    count++;
                    chArray[j] = '0';
                }
                
            }
            System.out.print(count + "" + chArray[i]);
            
        }
    }

}
