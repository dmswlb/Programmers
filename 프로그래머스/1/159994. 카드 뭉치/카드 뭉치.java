class Solution {
    public String solution(String[] card1, String[] card2, String[] goal) {
        int cnt1=0;
		int cnt2=0;
		for(String data:goal) {
			if(data.equals(card1[cnt1])) {
				if(cnt1==card1.length-1) {
					continue;
				}
				cnt1++;
			}
			else if(data.equals(card2[cnt2])) {
				
				if(cnt2==card2.length-1) {
					continue;
				}
				cnt2++;
			}
			else {
				return "No";
			}
		}		
		return "Yes";	
    }
}