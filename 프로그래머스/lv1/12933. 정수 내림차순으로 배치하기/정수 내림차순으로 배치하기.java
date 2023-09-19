import java.util.Arrays;
import java.util.Collections;
class Solution {
    public long solution(long n) {
        long answer = 0;
       	String s= String.valueOf(n);
		String[] arrS = s.split("");
		int a=1;
		Arrays.sort(arrS, Collections.reverseOrder());
        for(int i=arrS.length-1; i>=0; i--) {
			answer+=(long)Integer.parseInt(arrS[i])*a;
			a*=10;
		}
        return answer;
    }
}