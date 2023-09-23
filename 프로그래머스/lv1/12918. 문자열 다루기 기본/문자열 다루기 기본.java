class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        char[] arr = s.toCharArray();
        if(s.length()==4 || s.length()==6){
            for(char data: arr){
                if(Character.isDigit(data)==false){
                    answer=false;
                }
            }
        }
        else answer=false;
        return answer;
    }
}