import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> st = new Stack<>();
		st.push(s.charAt(0));
		for(int i=1; i<s.length(); i++) {
			if(st.empty() || st.peek()!=s.charAt(i)) st.push(s.charAt(i));
			else if(st.peek()==s.charAt(i)) {
				st.pop();
			}	
		}
		if(st.empty()) return 1;
		else return 0;
    }
}