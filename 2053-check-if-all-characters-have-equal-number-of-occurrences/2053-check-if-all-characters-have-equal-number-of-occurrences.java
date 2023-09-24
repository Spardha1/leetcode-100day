class Solution {
    public boolean areOccurrencesEqual(String s) {
         HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char ch : s.toCharArray())
        {
            map.put(ch, map.getOrDefault(ch, 0)+1);
        }

        int firstFreq = map.get(s.charAt(0));
        for(char key : map.keySet())
        {
            if(map.get(key) != firstFreq)
                return false;
        }
        return true;
    }
}