class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int[] max = new int[sizes.length];
        int[] min = new int[sizes.length];
        int m1 = 0;
        int m2 = 0;
        for(int i=0; i<sizes.length; i++){
            max[i] = Math.max(sizes[i][0], sizes[i][1]);
            min[i] = Math.min(sizes[i][0], sizes[i][1]);
            if(m1 < max[i]) m1 = max[i];
            if(m2 < min[i]) m2 = min[i];
        }
        
        return m1*m2;
    }
}