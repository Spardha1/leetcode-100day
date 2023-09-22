class Solution {
    public String restoreString(String s, int[] indices) {
        //Map<Character, Interger> hs = new Hashmap<Character, Integer>;
       /* StringBuilder sb = new StringBuilder();
        for(int i = 0;i<indices.length;i++){
            int a ;
            a = indices[i];
            sb.charAt(i)=s.charAt(a);

        }
        return sb.toString();*/
        /*char[] c = new char[s.length()];
        for(int i = 0;i<s.length();i++){
            c[indices[i]] = s.charAt(i);

        }
        return String.valueOf(c);*/
        Map<Integer, Character> map = new HashMap<Integer,Character>();
        for(int i = 0;i<s.length();i++){
            map.put(indices[i],s.charAt(i));
        }
        Arrays.sort(indices);
        String output="";
        for(int i=0;i<indices.length;i++){
            output+=map.get(indices[i]);
        }
        return output;
    }
}