package Patterns;

public class Pattern1234
{

    public static void main(String[] args)
    {
        /*
         *  1 2 3 4 
            5 6 7 
            8 9 
            10 
         */
        int n = 6;
        int count = 1;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j < n - i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }

    }

}
