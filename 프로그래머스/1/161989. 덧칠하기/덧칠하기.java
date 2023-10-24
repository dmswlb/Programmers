class Solution {
    public int solution(int n, int m, int[] section) {
       boolean[] b = new boolean[n];
		int len = section.length;
		int answer = 0;
		for (int data : section) {
			b[data-1] = true;
		}
		
		for (int i = 0; i < n; i++) {	
			if(i+m>n && b[i]) {
				answer++;
				break;
			}
			
			if(b[i]) {
				for(int j= 0; j<m; j++) {
					b[j+i] = false;
				}
				i+=m-1;
				answer++;
			}
		}
		return answer;
    }
}