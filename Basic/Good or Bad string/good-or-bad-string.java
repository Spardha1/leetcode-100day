//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while (t-- > 0) {
            String S = read.readLine();

            Solution ob = new Solution();
            System.out.println(ob.isGoodorBad(S));
        }
    }
}

// } Driver Code Ends


// User function Template for Java



// User function Template for Java

class Solution {
    static int isGoodorBad(String S) {
        // code here
        int i,v=0,c=0;
        for(i=0;i<S.length();i++)
        {
            char m=S.charAt(i);
            if(m=='a'|| m=='e'|| m=='i'|| m=='o'|| m=='u')
            {
                v++;
                c=0;
                if(v>5)return 0;
            }
            else if(m=='?'|| m=='?')
            {
                v++;
                c++;
                if(v>5 || c>3)
                {
                    return 0;
                 }
            }
            else 
            {
                c++;
                v=0;
                if(c>3)return 0;
            }
        }
       
        return 1;
    }
};