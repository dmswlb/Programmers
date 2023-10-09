class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++) {
		int sum =0;
		for(int j=0; j<photo[i].length; j++) {
			for(int a=0; a<name.length; a++) {
				if(name[a].equals(photo[i][j])) {
						sum+=yearning[a];
						break;
					}
				}
			}
			answer[i] = sum;
		}
        return answer;
    }
}