import java.util.Arrays;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] kk = new int[k];
		int[] answer = new int[score.length];
		int min=2001;
		
		for(int i=0; i<score.length; i++) {
			//명예의 전당이 꽉차지 않은 경우
			if(i<k) {
				kk[i] = score[i];
				if(kk[i]<min) min= Math.min(min, kk[i]);
			}
			//명예의 전당이 꽉찬 경우
			else {
				Arrays.sort(kk);
				if(score[i]>kk[0]) {
					kk[0] = score[i];
					min = Math.min(kk[0], kk[1]);
				}
			}
			answer[i] = min;
		}
        return answer;
    }
}