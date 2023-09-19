class Solution {
    public int solution(int num) {
        int answer = 0;
        long v=num;
        if(num==1) answer=0;
        while(v!=1){
            if(v%2==0){
                v/=2;
            }
            else v=(v*3)+1;
            answer++;
            if(answer>=500){
                answer=-1;
                v=1;
            }
        }
        return answer;
    }
}