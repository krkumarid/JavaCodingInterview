package DSA_Array;

public class SmallestNumber
{

    public static void main(String[] args)
    {
        /*
         * Given a positive number N , you need to find the smallest number s such that
         * the product of digits of s is equal to N
         */
        /*
         * Sample input N=1000 Out put = 5558 = 5x5x5x8
         */

        int n = 81000;
        int small = solution(n);
        System.out.println(small);
    }
    
    private static int solution(int n)
    {
        String ans = "";
        for (int div = 9; div >= 2; div--)
        {
            while (n % div == 0)
            {
                n = n / div;
                ans = div + ans;
                // System.out.println(ans);
            }
        }
        if (n != 1)
        {
            return -1;
        } else
        {
            return Integer.parseInt(ans);
        }
    }

}
