package com.coding.arraysStings;

public class RotateMatrix
{
    public static void rotateMatrix(int[][] matrix)
    {
        int row = matrix.length;
        // Tranpose the matrix first
        for (int i = 0; i < row; i++)
        {
            for (int j = i; j < row; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        
        // Print the matrix
        for (int m = 0; m < row; m++)
        {
            for (int n = 0; n < matrix[0].length; n++)
            {
                System.out.print(matrix[m][n] + "  ");
            }
            System.out.println();
        }
        
        // Rotate the matrix
        for (int i = 0; i < row; i++)
        {
            for (int j = 0; j < row / 2; j++)
            {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][row - 1 - j];
                matrix[i][row - 1 - j] = temp;
            }
        }
        
        System.out.println(" ---- The rorated matrix ---------------");
        // Print the matrix
        for (int m = 0; m < row; m++)
        {
            for (int n = 0; n < matrix[0].length; n++)
            {
                System.out.print(matrix[m][n] + "  ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {

        int[][] matrix = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        rotateMatrix(matrix);
    }
    
}
