class Solution {
    public String[] solution(int n, int[] a1, int[] a2) {
		int[][] s =new int[n][n];
		String[] a = new String[n];
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
//				arr[i][j] = a1[i]%2;
//				arr1[i][j] = a2[i]%2;				
//				if(a1[i]%2==1 || a2[i]%2==1) {
//					answer[i][j]=1;
//				}else {
//					answer[i][j]=0;
//				}				
				if(a1[i]%2==1 || a2[i]%2==1) {
					s[i][n-1-j] =1;
				}
				else {
					s[i][n-1-j]=0;
				}
				a1[i]/=2;
				a2[i]/=2;
			}
	}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(s[i][j]==1) sb.append("#");
				else if(s[i][j]==0) sb.append(" ");
			}
			a[i] = sb.toString();
			sb.delete(0, n);		
		}
        return a;
    }
}