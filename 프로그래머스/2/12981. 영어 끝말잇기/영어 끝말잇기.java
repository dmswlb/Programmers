import java.util.*;
class Solution {
    public int[] solution(int n, String[] words) {
        Stack<Character> st = new Stack<>();
		int man = 2;
		int turn =1;		
		int[] answer = {0, 0};
		st.push(words[0].charAt(words[0].length()-1));
		
		for(int i=1; i<words.length; i++) {		
			if(st.peek() == words[i].charAt(0)){
				st.pop();
				st.push(words[i].charAt(words[i].length()-1));
				
				for(int j=0; j<i; j++) {
					if(words[i].equals(words[j])) {
						return new int[] {man, turn};
					}
				}
				man = (man%n)+1;
				if(man==1) turn++;
			}
			else {
				answer[0] = man;
				answer[1] = turn;
				break;
			}
			
		}
		return answer;
    }
}