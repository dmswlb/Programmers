class Solution {
    public int solution(int n) {
        int answer = 1;
        int start = 1;
        int sum = 0;
        int cnt= start;
        boolean flag = true;
        
        while(flag){
            sum+=cnt;
            cnt++;
            if(sum==n){
                answer++;
                sum=0;
                start++;
                cnt=start;
            }
            else if(sum>n) {
                sum=0;
                start++;
                cnt=start;
            }
            if(start >n/2) flag = false;
        }
        if(n==1) answer=1;
        return answer;
    }
}