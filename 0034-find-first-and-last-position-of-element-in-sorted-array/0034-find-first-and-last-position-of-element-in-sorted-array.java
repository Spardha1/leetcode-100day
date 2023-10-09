class Solution {
    public int[] searchRange(int[] nums, int target) {
        

        int[] result = new int[2];
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            if (nums[low] < target) {
                low++;
            } else if (nums[high] > target) {
                high--;
            } else if (nums[low] == target && nums[high] == target) {
                result[0] = low;
                result[1] = high;
                return result;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;

        
    }
}