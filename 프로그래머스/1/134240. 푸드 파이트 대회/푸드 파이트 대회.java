class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i=1; i<food.length; i++){
            for(int j=0; j<food[i]/2; j++){
                sb.append(i);
                sb1.append(i);
            }
        }
        sb.append(0);
        sb1.reverse();
        sb.append(sb1);
        return sb.toString();
    }
}