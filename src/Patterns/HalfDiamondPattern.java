package Patterns;

public class HalfDiamondPattern
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        // Upper pattern
        int n = 5;
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        // Lower pattern
        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
