class Solution {
    public String solution(String s) {
        String[] words = s.split(" ");
        int cnt =0;
        StringBuilder sb = new StringBuilder();
        
        for(String data: words) {
            words[cnt++] = data.toLowerCase();
        }
        
        for(int i=0; i<words.length; i++) {
            String[] w = words[i].split("");
            w[0] = w[0].toUpperCase();
            
            sb.append(String.join("", w));
            if(i<words.length-1) sb.append(" ");
        }
        
        if(sb.length() < s.length()) {
            for(int i=0; i<s.length()-sb.length(); i++) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}