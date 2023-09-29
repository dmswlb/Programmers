import java.util.Stack;
class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer> s = new Stack<>();
        for(int i=0; i<moves.length; i++){
            //스택에 값이 2개 이상 있는 경우 맨뒤의 값과 뒤에서 두번째 값 비교
            if(s.size()>1 && s.elementAt(s.size()-1)==s.elementAt(s.size()-2)){
                s.pop();
                s.pop();
                answer+=2;
            }
            //board의 moves[i]의 행에 들어있는 값이 0이 아닌 경우 바구니로 이동
            for(int j=0; j<board.length; j++){
                if(board[j][moves[i]-1] !=0){
                    s.add(board[j][moves[i]-1]);
                    board[j][moves[i]-1]=0;
                    break;
                }
            }
        }
        return answer;
    }
}