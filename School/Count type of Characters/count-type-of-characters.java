//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            String s = sc.next ();
    		int[] res = new Sol().count (s);
    		
    		for (int i = 0; i < 4; i++)
    		    System.out.println (res[i]);
        }
        
    }
}
// Contributed By: Pranay Bansal

// } Driver Code Ends


//User function Template for Java

class Sol
{
    int[] count (String s)
    {
        // your code here  
        int[] res = new int[4];
        
        int upper = 0, lower = 0, num = 0, symbol = 0;
        
        for(int i=0; i<s.length(); i++){
            
            char ch = s.charAt(i);
            
            if(ch >= 65 && ch <= 90) upper++;

            
            else if(ch>= 97 && ch <= 122) lower++;
            
            else if(ch>= 48 && ch <= 57) num++;
            
            else symbol++;            
        }
        res[0] = upper;
        res[1] = lower;
        res[2] = num;
        res[3] = symbol;
        
        return res;
    }
}