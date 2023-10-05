class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        char[] c = s.toCharArray();
        
        for(char data: c){
            if(data ==' '){
                sb.append(' ');
                continue;
            }
            
            //대문자인 경우
            if((data < 91) ) {
                if(data+n >=91) sb.append((char)(data+n-26));
                else sb.append((char)(data+n));
            }
            //소문자인 경우
            else {
                if((data+n >=123)) sb.append((char)(data+n-26));		
				else sb.append((char)(data+n));
            } 
        }
        return sb.toString();
    }
}