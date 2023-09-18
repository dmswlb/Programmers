class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String[] arr=s.split("");
        int cnty=0;
        int cntp=0;
        for(int i=0; i<arr.length; i++){
           	if(arr[i].equals("y")||arr[i].equals("Y")) cnty++;
		else if(arr[i].equals("p")||arr[i].equals("P")) cntp++;			
        }        
        if(cnty!=cntp) answer=false;
        return answer;
    }
}
