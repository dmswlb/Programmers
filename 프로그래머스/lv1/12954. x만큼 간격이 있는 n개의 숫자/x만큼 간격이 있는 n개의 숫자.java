class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long plus=x;
        long l= x;
        for(int i=0; i<n; i++){
            answer[i] = l;
            l+=plus;
        }
        return answer;
    }
}