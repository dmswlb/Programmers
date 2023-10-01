class Solution {
    public int solution(int[][] sizes) {
        int max = 0;
        int min = 0;
        int m1 = 0;
        int m2 = 0;
        for(int i=0; i<sizes.length; i++){
            max = Math.max(sizes[i][0], sizes[i][1]);
            min = Math.min(sizes[i][0], sizes[i][1]);
            if(m1 < max) m1 = max;
            if(m2 < min) m2 = min;
        }
        
        return m1*m2;
    }
}