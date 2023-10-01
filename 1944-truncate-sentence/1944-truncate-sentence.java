class Solution {
    public String truncateSentence(String s, int k) {
       /* String arr[] = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < k; i++) {
            if(i < arr.length) {
                sb.append(arr[i]).append(" ");
            }
        }
        return sb.toString().trim();*/
        int count = 0 , i = 0;
        for(i=0; i<s.length(); i++){
            if(s.charAt(i)==' ') count++;
            if(count==k) break;
        }
        if(i==s.length()) return s;
        return s.substring(0,i);
    }
}