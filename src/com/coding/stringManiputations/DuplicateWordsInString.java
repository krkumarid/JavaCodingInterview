package com.coding.stringManiputations;

public class DuplicateWordsInString
{
    public static void main(String[] args)
    {
        String provided = "This is the String ,which one is  need is to be tested for the duplicate word";
        
        String[] broken = provided.trim().split(" ");
        int count;
        for (int i = 0; i < broken.length; i++)
        {
            count = 1;
            for (int j = i + 1; j < broken.length; j++)
            {
                if (broken[i].equals(broken[j]))
                {
                    count++;
                    broken[j] = "1";
                    
                }
                
            }
            if (count > 1 && broken[i] != "1")
            {
                System.out.println(broken[i] + ":" + count);
            }
            
        }
    }
}
