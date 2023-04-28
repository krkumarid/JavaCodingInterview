package Patterns;

public class OneSidePattern
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub

        int n = 10;
        for (int i = 1; i <= n; i++)
        {
            for (int j = (n - 1); j >= i; j--)
            {
                System.out.print("\b");
            }
            for (int k = 1; k <= i; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    
}
