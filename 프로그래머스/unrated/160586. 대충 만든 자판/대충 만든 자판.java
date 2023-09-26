import java.util.*;
class Solution {
    public int[] solution(String[] k, String[] t) {
        int[] answer = new int[t.length];
        Map<Character, Integer> hm = new HashMap<>();
        
        //값에 따른 최소 타자 횟수 저장
        for(String data: k){
            for(int i=0; i<data.length(); i++){
                if(hm.containsKey(data.charAt(i))){
                    if(hm.get(data.charAt(i))>i){
                        hm.put(data.charAt(i), i+1);
                    }
                    //else일 때는 변경 없음
                }
                else{
                    hm.put(data.charAt(i), i+1);
                }
            }
        }
        
        //target을 만들 수 있는 타자 횟수 세기
        int cnt=0;
        for(String a: t){
            for(int i=0; i<a.length(); i++){
                //target에 있는 값중 keymap에 없는 경우
                if(!hm.containsKey(a.charAt(i))){
                    answer[cnt]=-1;
                    break;
                }
                //target에 있는 값들이 모두 keymap에 있는 경우
                else answer[cnt]+=hm.get(a.charAt(i));
            }
            cnt++;
        }
        
        return answer;
    }
}