class Solution {
    public int longestStrChain(String[] words) {
        // Sort the array in increasing order of word length
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        // Create a map to store the longest chain ending at each word
        Map<String, Integer> dp = new HashMap<>();
        int maxChainLength = 1;
        
        // Iterate through each word in the array
        for (String word : words) {
            // Initialize the longest chain for the current word as 1
            int longestChain = 1;
            // Generate all possible predecessor words of the current word
            for (int i = 0; i < word.length(); i++) {
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                String predecessor = sb.toString();
                // If the predecessor word is in the map, update the longest chain for the current word
                if (dp.containsKey(predecessor)) {
                    longestChain = Math.max(longestChain, dp.get(predecessor) + 1);
                }
            }
            // Update the map with the longest chain ending at the current word
            dp.put(word, longestChain);
            // Update the maximum chain length seen so far
            maxChainLength = Math.max(maxChainLength, longestChain);
        }
        
        return maxChainLength;
    }
}