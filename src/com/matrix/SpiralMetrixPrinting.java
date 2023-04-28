package com.matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMetrixPrinting
{

    /*
     * public static void spiralPrint(int[][] array) { int top, bottom, left, right,
     * dir, i; top = 0; bottom = array.length - 1; left = 0; right = array[0].length
     * - 1; dir = 0; while (left <= right && top <= bottom) { // Printing first row
     * for (i = left; i <= right; i++) { System.out.print(array[top][i] + " "); }
     * top++; // printing last column for (i = top; i <= bottom; i++) {
     * System.out.print(array[i][bottom] + " "); } right--; if (right <= bottom) {
     * for (i = right; i >= bottom; i--) { System.out.print(array[bottom][i] + " ");
     * } bottom--; } if (left <= right) { for (i = bottom; i >= right; i--) {
     * System.out.print(array[left][i] + " "); } left++; } } }
     */

    public static void spiralMetrixUsingList(int[][] array)
    {
        List<Integer> arrList = new ArrayList<Integer>();
        int top, bottom, left, right, dir, i;
        top = 0;
        bottom = array.length - 1;
        left = 0;
        right = array[0].length - 1;

        dir = 0;
        while (top <= bottom && left <= right)
        {
            if (dir == 0)
            {
                for (i = left; i <= right; i++)
                {
                    arrList.add(array[top][i]);
                }
                top++;
            }

            else if (dir == 1)
            {
                for (i = top; i <= bottom; i++)
                {
                    arrList.add(array[i][right]);
                }
                right--;
            } else if (dir == 2)
            {
                for (i = right; i >= left; i--)
                {
                    arrList.add(array[bottom][i]);
                }
                bottom--;
            } else if (dir == 3)
            {
                for (i = bottom; i >= top; i--)
                {
                    arrList.add(array[i][left]);
                }
                left++;
            }
            dir = (dir + 1) % 4;
        }
        for (int n : arrList)
        {
            System.out.print(n + " ");
        }
    }

    public static void main(String[] args)
    {
        int arr[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
        // spiralPrint(arr);

        spiralMetrixUsingList(arr);

    }

}
