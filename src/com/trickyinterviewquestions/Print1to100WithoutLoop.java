package com.trickyinterviewquestions;

import java.util.stream.IntStream;

public class Print1to100WithoutLoop
{

    public static void main(String[] args)
    {
        int num = 1;
        // printNum(num);
        // Using Integer stream
        IntStream.range(1, 101).forEach(e -> System.out.println(e));
    }

    // Reccurssive method to print 1-100 without loop
    public static void printNum(int num)
    {
        if (num <= 100)
        {
            System.out.println(num);
            // num++;
            printNum(++num);
        }
    }
}
