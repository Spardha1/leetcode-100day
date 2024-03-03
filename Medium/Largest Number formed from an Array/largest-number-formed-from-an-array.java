//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(n, arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(int n, String[] arr) {
        // code here
        
          Arrays.sort(arr,new Comparator<String>(){
            @Override 
            public int compare(String x, String y){
                String xy = x+y;  // concatenating the current string with the next string
                String yx = y+x;  // concatenating the next string with the current string
                return yx.compareTo(xy);  // comparing the two concatenated strings in descending order
            }
        });
        
        String ans = "";
        for(int i=0; i<n; i++)
            ans += arr[i];  // concatenating all the strings in the sorted order
        
        return ans;  // returning the final result as a string
    }
}