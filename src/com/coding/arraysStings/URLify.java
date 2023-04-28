package com.coding.arraysStings;

/*
 * Replacing all the spaces with %20 is called URLify
 */
public class URLify
{

    public static void main(String[] args)
    {
        String str = "Mr John SMith    ";
        
        str = str.trim();
        str = str.replaceAll("\\s", "%20");
        System.out.println(str);
        
    }

}
