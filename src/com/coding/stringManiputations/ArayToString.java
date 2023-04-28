package com.coding.stringManiputations;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArayToString
{

    public static void main(String[] args)
    {
        String str;
        String[] strArray = { "My", "Name", "is", "Rajeevkumar" };
        str = convertArrayToString(strArray);
        System.out.println("Array to String using toString() :-" + str);
        
        str = convertArrayToStringStringBulderAppend(strArray);
        System.out.println("Array to String using StringBulilderAppend() :- " + str);

        str = convertArrayToStringJoinMethod(strArray);
        System.out.println("Array to String using Strign.Join() :- " + str);

        str = convertArrayToStringUsingCollectorsJoining(strArray);
        System.out.println(" Array to String using Collectors.joining()" + str);
    }
    
    public static String convertArrayToString(String[] stringArray)
    {
        return Arrays.toString(stringArray);
    }

    public static String convertArrayToStringStringBulderAppend(String[] stringArray)
    {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < stringArray.length; i++)
        {
            sb.append(stringArray[i]);
        }
        return sb.toString();
    }
    
    public static String convertArrayToStringJoinMethod(String[] stringArray)
    {
        
        String str = String.join(" ", stringArray);
        return str;
    }
    
    public static String convertArrayToStringUsingCollectorsJoining(String[] stringArray)
    {
        String str = Arrays.stream(stringArray).collect(Collectors.joining());
        return str;
    }
}
