package com.coding.interview;

public class PascalTriangle
{

    public static void main(String[] args)
    {
        PascalTriangle pt = new PascalTriangle();
        int n = 5;
        for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= n - i; j++)
            {
                System.out.print("*");
            }
            for (int k = 0; k <= i; k++)
            {
                int p = pt.Fact(i) / (pt.Fact(i - k) * pt.Fact(k));
                System.out.print(" " + p);
            }
            System.out.println(" ");
        }
    }

    public int Fact(int x)
    {
        if (x == 0 | x == 1)
        {
            return 1;
        } else
        {
            return x * Fact(x - 1);
        }
    }

}
