class Solution {
    public int solution(int n) {
        int cnt = Integer.bitCount(n);
        int cnt2 =0;        
        
        while(true) {
            n++;
            cnt2 = Integer.bitCount(n);
            
            if(cnt==cnt2) return n;
        }
    }
}