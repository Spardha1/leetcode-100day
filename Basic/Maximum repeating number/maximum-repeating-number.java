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
            int k = Integer.parseInt(inputLine[1]);
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().maxRepeating(arr, n, k);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


//User function Template for Java


class Solution {
    int maxRepeating(int[] arr, int N, int k) {
        // code here
        Arrays.sort(arr);
        int maxCnt = 0, cnt = 0, maxEle = 0;

        for(int i = 0; i < N-1; i++) {

            cnt++;
            if(arr[i] != arr[i+1]) {

                if(cnt > maxCnt) {
                    maxEle = arr[i];
                    maxCnt = cnt;
                }
                cnt = 0;
            }
        }

        if(cnt+1 > maxCnt) {
            maxEle = arr[N-1];
        }

        return maxEle;
    }
}