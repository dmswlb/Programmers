import java.util.*;
class Solution {
    public int[] solution(int n, int[] stages) {
        int[] answer = new int[n];
        double[] sort = new double[n];
        int sum=0;
        int s=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<stages.length; j++){
                if(i+1 <=stages[j]) sum++;
                if(i+1 == stages[j]) s++;
            }
            if(sum==0) sort[i]=0;
            else sort[i] = (double)s/sum;
            sum=0;
            s=0;
        }
        
        double[] original = sort.clone();
        Arrays.sort(sort);
        
        for(int i=n-1; i>=0; i--){
            for(int j=0; j<n; j++){
                if(sort[i]==original[j]){
                    answer[n-i-1] = j+1;
                    original[j]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}