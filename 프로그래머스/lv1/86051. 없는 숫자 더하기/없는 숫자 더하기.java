class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] arr= new int[10];
        for(int i=0; i<10; i++){
            for(int j=0; j<numbers.length; j++){
                if(i==numbers[j]) arr[i] = -1;
            }
        }
        for(int i=0; i<10; i++) {
            if(arr[i]!=-1) answer+=i;
        }
        return answer;
    }
}