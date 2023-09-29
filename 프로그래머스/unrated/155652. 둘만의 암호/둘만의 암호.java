import java.util.*;
class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder answer = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        int cnt=0;
        char[] arr = skip.toCharArray();
        Arrays.sort(arr);
        
        for(int i=97; i<123; i++){
            if(arr[cnt]==(char)i){
                if(cnt < arr.length -1) cnt++;
                continue;
            }
            sb.append((char)i);
        }
        
        for(int i=0; i< s.length(); i++){
            for(int j=0; j<sb.length(); j++){
                if(s.charAt(i) == sb.charAt(j)){
                    if(j+index <sb.length()) answer.append(sb.charAt(j+index));
                    else answer.append(sb.charAt((j+index)%sb.length()));
                }
            }
        }      
        return answer.toString();
    }
}