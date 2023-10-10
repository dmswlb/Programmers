import java.util.*;
class Solution {
    public String solution(int a, int b) {
        		//1월 1일이 금요일이기 때문
		String[] w= {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		//5월 24일은 화요일임
		int[] arr = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int sum=0;
		for(int i=0; i<a-1; i++) {
			sum += arr[i];
		}		
		sum+=b;		
		return w[sum%7];	
    }
}