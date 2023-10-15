class Solution {
    public int[] solution(String s) {
        int len = s.length();
        int zcnt = 0;
        int cnt = 0;
        boolean flag = true;
        
        while(flag) {
            s = s.replaceAll("0", "");
            if(s.equals("1")) flag = false;
            
            zcnt += len-s.length();
            s = Integer.toBinaryString(s.length());
            len = s.length();
            cnt++;
        }
        return new int[] {cnt, zcnt};
    }
}