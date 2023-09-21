import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String u="";
        String l="";
        char v;
        for(int i=0; i<s.length(); i++){
            v = s.charAt(i);
            if(Character.isUpperCase(v)==true) u+=v;
            else l+=v;
        }
        String uarr[] = u.split("");
        String larr[] = l.split("");
        Arrays.sort(uarr);
        Arrays.sort(larr);
        
        for(int i=larr.length-1; i>=0; i--){
            answer+=larr[i];
        }
        for(int i=uarr.length-1; i>=0; i--){
            answer+=uarr[i];
        }
        return answer;
    }
}