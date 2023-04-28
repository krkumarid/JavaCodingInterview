package com.coding.arraysStings;

public class ZeroMatrix
{
    public static void setZeros(int[][] matrix)
    {
        // Create two boolean array to find the 0's in the given matrix
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];

        // Set the row and col matrix with 0's position
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[0].length; j++)
            {
                if (matrix[i][j] == 0)
                {
                    row[i] = true;
                    column[j] = true;
                }
            }
        }

        // Nullify rows
        for (int m = 0; m < row.length; m++)
        {
            if (row[m] == true)
            {
                nullifyRow(matrix, m);
            }
        }
        // Nullify Colums
        for (int n = 0; n < column.length; n++)
        {
            if (column[n] == true)
            {
                nullifyColumn(matrix, n);
            }
        }
        
        // Print the matrix
        for (int m = 0; m < matrix.length; m++)
        {
            for (int n = 0; n < matrix[0].length; n++)
            {
                System.out.print(matrix[m][n] + "  ");
            }
            System.out.println();
        }
    }
    
    private static void nullifyRow(int[][] matrix, int row)
    {
        for (int col = 0; col < matrix[0].length; col++)
        {
            matrix[row][col] = 0;
        }

    }
    
    private static void nullifyColumn(int[][] matrix, int col)
    {
        
        for (int row = 0; row < matrix[0].length; row++)
        {
            matrix[row][col] = 0;
        }
    }
    
    public static void main(String[] args)
    {
        int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        setZeros(matrix);

    }

}
