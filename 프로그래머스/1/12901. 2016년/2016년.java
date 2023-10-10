import java.util.*;
class Solution {
    public String solution(int a, int b) {
        		//1월 1일이 금요일이기 때문
		String[] w= {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED" };
		//5월 24일은 화요일임
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int sum=0;
		hm.put(1, 31);
		hm.put(2, 29);
		hm.put(3, 31);
		hm.put(4, 30);
		hm.put(5, 31);
		hm.put(6, 30);
		hm.put(7, 31);
		hm.put(8, 31);
		hm.put(9, 30);
		hm.put(10, 31);
		hm.put(11, 30);
		hm.put(12, 31);		
		
		for(int i=1; i<a; i++) {
			sum += hm.get(i);
		}		
		sum+=b;		
		return w[sum%7];	
    }
}