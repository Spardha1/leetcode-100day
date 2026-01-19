class Solution {
    public int lengthOfLastWord(String s) {
       int count = 0;  
        int lastLength = 0; 

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c != ' ') {
               
                count++;
                lastLength = count; 
            } else {
                
                count = 0;
            }
        }

        return lastLength;
    }
}


