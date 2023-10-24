//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            
            Solution obj = new Solution();
            System.out.println(obj.firstIndex(a, n));
            
        }
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    
    public long firstIndex(long arr[], long n)
    {
        // Your code goes here
            long low=0,high=n-1;
            long ans=-1;
            while(low<=high){
                long mid=(low+high)/2;
                if(arr[(int)mid]==1){
                ans=mid;
                high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            return ans;
    }
}