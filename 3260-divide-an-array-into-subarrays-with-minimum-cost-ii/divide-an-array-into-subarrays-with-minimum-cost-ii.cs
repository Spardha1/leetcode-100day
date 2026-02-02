using System;
using System.Collections.Generic;

public class Solution
{
    public long MinimumCost(int[] nums, int k, int dist)
    {
        int n = nums.Length;

        // Edge case: if k == 1, only the first subarray exists; cost is nums[0]
        if (k == 1) return nums[0];

        // kMinimum holds the (k-1) smallest (value, index) in the current window
        // remaining holds the rest of the window
        var kMinimum = new SortedSet<(int val, int idx)>(Comparer<(int val, int idx)>.Create((a, b) =>
        {
            int cmp = a.val.CompareTo(b.val);
            if (cmp != 0) return cmp;
            return a.idx.CompareTo(b.idx);
        }));

        var remaining = new SortedSet<(int val, int idx)>(Comparer<(int val, int idx)>.Create((a, b) =>
        {
            int cmp = a.val.CompareTo(b.val);
            if (cmp != 0) return cmp;
            return a.idx.CompareTo(b.idx);
        }));

        long sum = 0; // sum of values in kMinimum (size <= k - 1)

        int i = 1;

        // Build the first window: indices [1 .. dist]
        // Loop condition from Java: while (i < n && i - dist < 1)  <=> i <= dist
        while (i < n && i - dist < 1)
        {
            var cur = (nums[i], i);
            kMinimum.Add(cur);
            sum += nums[i];

            // Keep only (k-1) elements in kMinimum
            if (kMinimum.Count > k - 1)
            {
                var largest = PopLast(kMinimum);
                sum -= largest.val;
                remaining.Add(largest);
            }
            i++;
        }

        long result = long.MaxValue;

        // Sliding window: at each i, window is effectively [i - dist .. i] before we evict (i - dist)
        while (i < n)
        {
            var cur = (nums[i], i);
            kMinimum.Add(cur);
            sum += nums[i];

            if (kMinimum.Count > k - 1)
            {
                var largest = PopLast(kMinimum);
                sum -= largest.val;
                remaining.Add(largest);
            }

            // Update minimum sum of (k-1) chosen starts
            result = Math.Min(result, sum);

            // Remove expired index (i - dist)
            int remIdx = i - dist;
            var toRemove = (nums[remIdx], remIdx);

            if (kMinimum.Remove(toRemove))
            {
                // We removed from the chosen set; fix sum and promote smallest from remaining
                sum -= nums[remIdx];

                if (remaining.Count > 0)
                {
                    var promote = PopFirst(remaining);
                    kMinimum.Add(promote);
                    sum += promote.val;
                }
            }
            else
            {
                // It was in 'remaining'
                remaining.Remove(toRemove);
            }

            i++;
        }

        // If result was never updated (possible if dist >= n-1), compute it from current state
        if (result == long.MaxValue)
        {
            result = sum; // current sum already holds the best for the final built window
        }

        return nums[0] + result;
    }

    // Helpers to get-and-remove smallest/largest from a SortedSet
    private static (int val, int idx) PopFirst(SortedSet<(int val, int idx)> set)
    {
        var x = set.Min;
        set.Remove(x);
        return x;
    }

    private static (int val, int idx) PopLast(SortedSet<(int val, int idx)> set)
    {
        var x = set.Max;
        set.Remove(x);
        return x;
    }
}