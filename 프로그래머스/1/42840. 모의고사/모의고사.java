import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> solution(int[] answer) {
		int[] s1 = new int[10000];
		int[] s2 = new int[10000];
		int[] s3 = new int[10000];
		int[] st1 = {1, 2, 3, 4, 5};
		int[] st2 = {2, 1, 2, 3, 2, 4, 2, 5};
		int[] st3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int[] a = new int[] {0, 0, 0};		//정답 개수 저장
		ArrayList<Integer> li = new ArrayList<Integer>();	
		int max=-1;
		
		for(int i=0; i<10000; i++) {
			s1[i] = st1[i%st1.length];
			s2[i] = st2[i%st2.length];
			s3[i] = st3[i%st3.length];
		}
		for(int i=0; i<answer.length; i++) {
			if(s1[i]==answer[i]) {
				a[0]++;
			}			
			if(s2[i] ==answer[i]) {
				a[1]++;
			}			
			if(s3[i]==answer[i]) {
				a[2]++;
			}
		}
		
		for(int i=0; i<3; i++) {
			if(max <a[i]) max=a[i];
		}
		
		for(int i=0; i<3; i++) {
			if(max==a[i]) {
				li.add(i+1);
			}
		}
		return li;	
    }
}