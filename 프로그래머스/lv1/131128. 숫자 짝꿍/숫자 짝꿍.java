import java.util.*;

class Solution {
    public String solution(String x, String y) {
        String answer = "";
        int[] xArr = new int[10];
        int[] yArr = new int[10];
        int[] xyArr = new int[10];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<x.length(); i++){
            xArr[(int)(x.charAt(i)-'0')]++;
        }
        for(int i=0; i<y.length(); i++){
            yArr[(int)(y.charAt(i)-'0')]++;
        }
        
        for(int i=0; i<xyArr.length; i++){
            if(xArr[i] <= yArr[i]) xyArr[i]=xArr[i];
            else xyArr[i] = yArr[i];
        }
        
        for(int i=xyArr.length-1; i>=0; i--){
            for(int j=0; j<xyArr[i]; j++){
                sb.append(Integer.toString(i));
            }
        }
        
        answer = sb.toString();
        if(answer.equals("")) answer="-1";
        else if(answer.charAt(0)=='0') answer="0";
        
        return answer;
    }
}