class Solution {
    public String solution(String[] s) {
        String answer="";
		for(int i=0; i<s.length; i++) {
			if(s[i].length()==3 && s[i].equals("Kim")) {
				answer= "김서방은 " + String.valueOf(i)+ "에 있다";
                break;
			}
		}
		return answer;
    }
}