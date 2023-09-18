class Solution {
    public long solution(long n) {
        long answer = 0;
		double cal = Math.sqrt(n);
		if(cal - (int)cal/1 ==0) {
			answer =(long) ((cal+1) *(cal+1));
		}
		else answer=-1;
        return answer;
    }
}