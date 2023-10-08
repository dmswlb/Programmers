import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
		int[] answer =new int[commands.length];
		int cnt=0;
		for(int i = 0; i<commands.length; i++) {			
			int[] s = new int[commands[i][1]-commands[i][0]+1];
			for(int j=commands[i][0]-1; j<=commands[i][1]-1; j++) {
				s[cnt++]=array[j];				
			}		
			Arrays.sort(s);			
			answer[i] = s[commands[i][2]-1];
			cnt=0;
		}
        return answer;
    }
}