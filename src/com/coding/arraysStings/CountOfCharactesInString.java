package com.coding.arraysStings;

import java.util.HashMap;
import java.util.Map;

public class CountOfCharactesInString
{
    // test --> t=2,e=1,s=1
    public static void CharCount(String strWord)
    {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] arCh = strWord.toCharArray();
        for (char c : arCh)
        {
            // if (!String.valueOf(c).isBlank())// avoid the blank space
            {
                if (charMap.containsKey(c))
                {
                    charMap.put(c, charMap.get(c) + 1);
                } else
                {
                    charMap.put(c, 1);
                }
            }
        }
        System.out.println(strWord + ":" + charMap);
    }

    public static void main(String[] args)
    {
        CharCount("test");
        CharCount("t");
        CharCount("test auto raj");
        CharCount("  ");

    }

}
