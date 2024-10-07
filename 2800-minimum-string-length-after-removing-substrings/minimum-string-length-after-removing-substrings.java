class Solution {
    public int minLength(String s) {

        // while(s.contains("AB")|| (s.contains("CD"))){
        //     if(s.contains("AB")){
        //         s= s.replace("AB","");
        //     }
        //     else if (s.contains("CD")){
        //         s=s.replace("CD","");
        //     }
        // }
        // return s.length();

        Stack<Character> st = new Stack<>();

        for(int i=0;i<s.length();i++){
            char currentCharacter = s.charAt(i);

            if(st.isEmpty()){
                st.push(s.charAt(i));
                continue;
               
            }

            if(currentCharacter=='B' && st.peek()=='A'){
                st.pop();
            }
            else if(currentCharacter == 'D' && st.peek()=='C'){
                st.pop();
            }
            else{
                st.push(currentCharacter);
            }


        }
        return st.size();
        
    }
}