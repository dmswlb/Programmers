import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        int len = 0;                  //자릿 수
        int s=1;

        while(true){
            if(n/s>0){
                len++;
                s*=10;
            }
            else break;
        }
        
        int[] arr = new int[len];       //각 자리의 값을 저장하는 배열
        for(int i=0; i<len; i++){
            arr[i] = n%10;
            n = (n-arr[i])/10;
            answer += arr[i]; 
        }
        return answer;
    }
}