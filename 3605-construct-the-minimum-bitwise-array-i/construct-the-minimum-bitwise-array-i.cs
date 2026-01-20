public class Solution {
    public int[] MinBitwiseArray(IList<int> nums) {
        int n = nums.Count;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            int num = nums[i];

            if (num == 2) {
                result[i] = -1;
                continue;
            }

            bool found = false;
            for (int j = 0; j < 32; j++) {
                if ((num & (1 << j)) > 0) {
                    continue; // j-th bit is set
                }

                int prev = j - 1;
                if (prev >= 0) {
                    int x = num ^ (1 << prev); // flip the previous bit
                    result[i] = x;
                    found = true;
                    break;
                }
            }

            if (!found) {
                result[i] = -1;
            }
        }

        return result;
    }
}
