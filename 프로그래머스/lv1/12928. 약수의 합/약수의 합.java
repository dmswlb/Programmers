import java.util.HashSet;
import java.util.Set;
class Solution {
    public int solution(int n) {
        int answer = 0;
        Set<Integer> arr = new HashSet<>();
        for(int i=1; i<=n; i++){
            if(n%i==0) arr.add(i);
        }
        for(Integer data : arr) {answer+=data;}
        return answer;
    }
}