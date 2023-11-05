//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            String s;
            s = sc.next();
           
            Solution ob = new Solution();
            
            System.out.println(ob.modify(s));    
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    String modify (String s)
    {
        // your code here
         String vol="";
        for(int i=0;i<s.length();i++){
            char v=s.charAt(i);
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
                vol+=v;
            }
        }
        
        StringBuilder sb=new StringBuilder(vol);
        StringBuilder sb2=new StringBuilder(s);
        sb.reverse();
        
      int m=0;
      for(int i=0;i<s.length();i++){
            char v=s.charAt(i);
            if(v=='a'||v=='e'||v=='i'||v=='o'||v=='u'){
                sb2.setCharAt(i,sb.charAt(m));
                m++;
            }
        }
      
        return sb2.toString();
    }
}