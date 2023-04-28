package DSA_Array;

import java.util.Arrays;

public class Array3Sum
{
    
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
        int[] arr = { 7, -6, 3, 8, -1, 8, -11 };
        int target = 0;
        solution(arr, target, arr.length);
    }
    
    public static void solution(int[] a, int target, int n)
    {
        Arrays.sort(a); // sorting the array
        for (int i = 0; i < n; i++)
        {
            if (i == 0 || (a[i] != a[i - 1]))
            {
                int j = i + 1;
                int k = n - 1;
                int tar = target - a[i];
                while (j < k)
                {
                    if (a[j] + a[k] == tar)
                    {
                        System.out.println(a[i] + " " + a[j] + " " + a[k]);
                        // Ignoring duplicates
                        while (j < k && a[j] == a[j + 1])
                        {
                            j++;
                        }
                        while (j < k && a[k] == a[k - 1])
                        {
                            k--;
                        }
                        j++;
                        k--;
                    } else if (a[j] + a[k] < tar)
                    {
                        j++;
                    } else
                    {
                        k--;
                    }
                }
            }
        }
        
    }
}
