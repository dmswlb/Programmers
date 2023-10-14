class Solution {
    public int solution(int number, int limit, int power) {
        int answer =1;
	int cnt=0;
		
	for(int i=2; i<=number; i++) {
		for(int j=1; j<=Math.sqrt(i); j++) {
			if(j*j==i) cnt++;
                	else if(i%j==0) cnt+=2;
		}
		if(cnt > limit) answer+=power;
            	else answer+=cnt;
		cnt=0;
	}		
        return answer;
    }
}
