import java.util.*;
import java.util.stream.Collectors;
class Solution {
    public int solution(int[] people, int limit) {
        Arrays.sort(people);
        int r =0;
        int l = people.length-1;
	int answer =0;        
	while(r<=l){     
            if(people[r]+people[r+1] >limit){
                answer+=l-r+1;
                break;
            }
	    if(people[r]+people[l]<=limit) {r++;}  
            l--;
            answer++;
	    if(r==l) {
		answer++;
		break;
	   }             
	}
	return answer;
    }
}
