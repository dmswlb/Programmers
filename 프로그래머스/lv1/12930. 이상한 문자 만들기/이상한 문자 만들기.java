class Solution {
    public String solution(String s) {
        String answer = "";
        String[] row = s.split(" ");
        String[][] arr = new String[row.length][];
        
        int cnt=0;
        for(String data:row){
            arr[cnt++] = data.split("");
        }
        
        for(int i=0; i<arr.length; i++){
            for(int j=1; j<arr[i].length; j++){                
                if(j%2!=0) arr[i][j] = arr[i][j].toLowerCase();
                else arr[i][j] = arr[i][j].toUpperCase();
            }
            arr[i][0] = arr[i][0].toUpperCase();
            row[i] = String.join("", arr[i]);
        }        
        answer = String.join(" ", row);
        
        if(s.length() > answer.length()){
            int len = s.length()-answer.length();
            for(int i=0; i<len; i++){
                answer += " ";
            }
        }
        return answer;
    }
}