class Solution {
    public int longestSubarray(int[] nums) {
        int n=0;
        for(int i =0;i<nums.length;i++){
            n=Math.max(n,nums[i]);
        }
        int count=0;
        int ans=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                count=count+1;
            }
            else{
                count=0;
            }
             ans=Math.max(count,ans);
        }
        
        return ans;
    }
}