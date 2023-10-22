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
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int x = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans[] = new Solve().getMoreAndLess(arr, n, x);
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}


// } Driver Code Ends


//User function Template for Java




//User function Template for Java




class Solve {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        int arri[] = new int[2];
        
            int count =0;
            int counti= 0;
            for(int i =0;i<n;i++){
                if(arr[i]<=x){
                    count++;
                }
                if(arr[i]>=x){
                    counti++;
                }
            }
            arri[0]=count;
            arri[1] = counti;
            return arri;
        // code here
    }
}