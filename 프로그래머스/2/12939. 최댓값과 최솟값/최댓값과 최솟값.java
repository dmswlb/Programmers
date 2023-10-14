import java.util.*;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        int[] arr1 = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            arr1[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(arr1);
        sb.append(arr1[0]);
        sb.append(" ");
        sb.append(arr1[arr.length-1]);
        
        return sb.toString();
    }
}