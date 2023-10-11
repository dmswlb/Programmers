import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer =0;
		int s=score.length; 	//총 개수
		int cnt=0;		
		int[] a= new int[m];
		Arrays.sort(score);
		
		for(int i=score.length-1; i>=0; i--) {					
			a[cnt] = score[i];
			cnt++;
			s--;
			if(cnt==m) {			
				answer = answer+ a[m-1]*m;
				cnt=0;	
				if(s<m) break;
			}			
		}

		return answer;
    }
}