package DSA_Array;

import java.util.HashMap;

public class Array2Sum
{

    public static void main(String[] args)
    {
        int[] arr = { 11, 3, 7, 9, 14, 2 };
        int target = 17;
        int[] ans = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++)
        {
            int sNo = target - arr[i];
            if (map.containsKey(sNo))
            {
                ans[0] = map.get(sNo); // Returns the value of Key( sNo)
                ans[1] = i;
                break;
            } else
            {
                map.put(arr[i], i);
            }
        }

        System.out.println(ans[0] + "  " + ans[1]);
    }

}
