//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*; 

class GFG{
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-- > 0){
            String S = sc.nextLine();
            Solution ob = new Solution();
            List<String> ans = ob.splitString(S);
            for (String val: ans) 
                if(val == "")
                    System.out.println(-1); 
                else    
                    System.out.println(val); 
        }
    } 
} 


// } Driver Code Ends


//User function Template for Java

class Solution 
{ 
    static List<String> splitString(String S) 
    { 
        // code here 
        List<String> array = new ArrayList<>();
        String str1 = S.replaceAll("[^a-zA-Z]","");
        if(str1.equals(""))
        str1="-1";
        array.add(str1);
        String str2 = S.replaceAll("[^0-9]","");
        if(str2.equals(""))
        str2="-1";
        array.add(str2);
        String str3 = S.replaceAll("[a-zA-Z0-9]","");
        if(str3.equals(""))
        str3="-1";
        array.add(str3);
        
        return array;
    }
} 
