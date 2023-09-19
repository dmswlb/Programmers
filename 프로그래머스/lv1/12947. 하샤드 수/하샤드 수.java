class Solution {
    public boolean solution(int x) {
        String s=String.valueOf(x);
        int sum=0;
        String[] arr=s.split("");
        for(int i=0; i<s.length(); i++){
            sum += Integer.parseInt(arr[i]);
        }
        return x%sum==0?true:false;
    }
}