import java.util.*;
class Solution {
    public int solution(int[] nums) {
        //set은 중복 불가
		Set<Integer> set = new HashSet<>();
		
		for(int data: nums) {
			set.add(data);
		}
	
		if(set.size() > nums.length/2) {
			return nums.length/2;
		}
		else {
			return set.size();
		}
    }
}