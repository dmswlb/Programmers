class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int stdCnt = 0;
        int[] std = new int[n];
        
        for(int l : lost) std[l-1] -=1;
        for(int r : reserve) std[r-1] +=1;
        
        for(int i=0; i<n-1; i++){
            if(std[i]+std[i+1]==0) {
                std[i]=0;
                std[i+1]=0;    
                i++;
            }
        }
        
        for(int s:std){
            if(s>=0) stdCnt++;
        }
        return stdCnt;
    }
}