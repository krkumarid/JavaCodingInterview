package com.coding.arraysStings;

public class javaTestInterview
{
    public static void main(String[] args)
    {
        String s = "1A2B10C5D";
        int count = 0;
        String r = "";
        String ans = "";

        /*
         * for (int i = 0; i < s.length(); i++) { if (s.charAt(i) >= 48 && s.charAt(i)
         * <= 57) { r = r + s.charAt(i); // System.out.println(r); } else { count =
         * Integer.valueOf(r); for (int j = 0; j <= count - 1; j++) { ans = ans +
         * s.charAt(i); // System.out.println(ans); } r = ""; } }
         * System.out.println(ans);
         */
        
        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57)
            {

                r += s.charAt(i);
                
            } else
            {
                count = Integer.valueOf(r);
                for (int j = 0; j < count; j++)
                {
                    ans += s.charAt(i);
                }
                r = "";
            }
            
        }
        System.out.println(ans);
        
    }
}
