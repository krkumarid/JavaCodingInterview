package com.coding.interview;

public class PrimeNumbersTriangle
{
    public static boolean isPrime(int number)
    {

        int nCount = 0;
        for (int i = 2; i <= number; i++)
        {
            if (number % i == 0)
            {
                nCount++;
            }
        }
        if (nCount == 1)
        {
            return true;
        } else
        {
            return false;
        }

    }

    public static void main(String[] args)
    {
        int nCounter = 2;
        int nRows = 4;
        for (int m = 1; m <= nRows; m++)
        {
            for (int n = 1; n <= m; n++)
            {
                while (!isPrime(nCounter))
                {
                    nCounter++;
                }
                System.out.print(nCounter + " ");
                nCounter++;
            }
            System.out.println();
        }
    }

}
