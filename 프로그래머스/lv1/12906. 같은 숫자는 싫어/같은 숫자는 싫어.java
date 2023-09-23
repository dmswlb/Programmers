import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]!=arr[i+1]) stack.add(arr[i+1]);
        }
        int[] answer = new int[stack.size()];
        int cnt=0;
        for(Integer data:stack){
            answer[cnt++] = data;
        }


        return answer;
    }
}