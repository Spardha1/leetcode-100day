class Solution {
   /* public int kthGrammar(int n, int k) {
        return kth(n,k);
    }
    public int kth(int n,int k){
         int len = (int)Math.pow(2,n-1);
        int mid = len/2;
        if(n==1){
            return 0;
        }
        if(mid>k){
           return kth(n-1,k);
        }
        else
         return 1-kth(n,k-mid);
    }*/
    public int kthGrammar(int N,int K){
    if (N == 1 && K == 1) {
            return 0;
        }
        int mid = (int) Math.pow(2, N - 1) / 2;

        if (K <= mid) {
            return kthGrammar(N - 1, K);
        }

        return 1 - kthGrammar(N - 1, K - mid); 
    }
}