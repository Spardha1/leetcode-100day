//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class GFG {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		while(testcases-- > 0){
		    
		    String line1 = br.readLine();
		    String []element = line1.trim().split(" ");
		    int n = Integer.parseInt(element[0]);
		    int target = Integer.parseInt(element[1]);
		    
		    int arr[] = new int[n];
		    
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split(" ");
		    
		    for(int index = 0;index < n; index++){
		        arr[index] = Integer.parseInt(elements[index]);
		    }
		    
		    Solution obj = new Solution();
		    
		    System.out.println(obj.findClosest(arr, n, target));
		        
		}
		
	}
}


// } Driver Code Ends


//User function Template for Java

class Solution{
    
    public static int findClosest(int arr[], int n, int target) 
    { 
        // Complete the function
         int ar = arr[0];
        int   max = Math.abs(arr[0]-target);
       for(int i = 1;i<n;i++)
       {
            if(max >=(Math.abs(arr[i]-target)))
            {
                 max = Math.abs(arr[i]-target);
                  ar = arr[i];
             }
        }
             return ar;
    } 
}

