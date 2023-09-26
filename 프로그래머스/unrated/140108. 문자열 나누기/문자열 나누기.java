class Solution {
    public int solution(String s) {
        int answer = 0;
        char x = s.charAt(0);
        int[] cnt = {1, 0};
        for(int i=1; i<s.length(); i++){
            if(cnt[0]!=cnt[1]){
                if(s.charAt(i)==x) cnt[0]++;
                else cnt[1]++;                
            }
            else{
                answer++;
                x = s.charAt(i);
                cnt[0] =1;
                cnt[1] =0;
            }
        }
        answer++;
        return answer;
    }
}