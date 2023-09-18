class Solution {
    public int[] solution(long n) {
        int[] answer = {};
        int len=1;
        long s =n;
        while(true){
            if(s>10) len++;
            else break;
            
            s/=10;
        }
        answer = new int[len];
        for(int i=0; i<len; i++){
            answer[i] = (int)(n%10);
            n/=10;
        }
        return answer;
    }
}