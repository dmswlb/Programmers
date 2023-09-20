import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer;
        int index=-1;
        int[] clone = arr.clone();
        Arrays.sort(clone);
        if(arr.length==1) answer= new int[] {-1};
        else{
            answer = new int[arr.length-1];
            for(int i=0; i<arr.length; i++){
                if(arr[i]==clone[0]) index=i;
            }
            for(int i=0; i<arr.length-1; i++){
                if(i< index) answer[i]=arr[i];
                else answer[i]=arr[i+1];
            }
        }
        return answer;
    }
}