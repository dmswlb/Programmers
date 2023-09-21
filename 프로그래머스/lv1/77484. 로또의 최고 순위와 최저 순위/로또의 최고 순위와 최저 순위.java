import java.util.Arrays;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zeroCnt=0;          //변동 가능 개수
        int matchCnt=0;         //일치 개수
        
        //배열 정렬
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        //lottos에서 0개수 확인
        for(int i=0; i<lottos.length; i++){
            if(lottos[i]!=0) break;
            zeroCnt++;
        }
        //lottos와 win_nums 일치 개수 확인
        for(int i=zeroCnt; i<lottos.length; i++){
            for(int j=0; j<win_nums.length; j++){
                if(lottos[i]==win_nums[j]){
                    matchCnt++; break;
                }
            }
        }
        //맞은 개수에 따라 최고 등수와 최저 등수 저장
        if(zeroCnt+matchCnt==0) answer[0] = 6;
        else answer[0] = 7-(zeroCnt+matchCnt);
        if(matchCnt <=1) answer[1]=6;
        else answer[1] = 7-matchCnt;
        
        return answer;
    }
}