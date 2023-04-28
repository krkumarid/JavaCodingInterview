package com.coding.stringManiputations;

public class AddWithoutPlusSymbol
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println(sum);
    }

    private static int add(int i, int j)
    {
        if (j == 0)
        {
            return i;
        }
        int sum = i ^ j;
        int carry = (i & j) << 1;
        return add(sum, carry);
    }
    
}
