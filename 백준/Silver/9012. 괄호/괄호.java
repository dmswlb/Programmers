import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		Stack<Character> stack = new Stack<>();

		for (int index = 0; index < n; index++) {
			stack.removeAll(stack);
			String str = sc.nextLine();
			String answer = "NO";
			// 입력 길이가 홀수면 VPS가 될 수 없음
			if (str.length() % 2 == 1) {
				answer = "NO";
			} 
			else {
				for (int i = 0; i < str.length(); i++) {
					// stack에 들어있는 값이 ')'밖에 없으면 VPS가 될 수 없음
					if (str.charAt(i) == '(') {
						stack.push(str.charAt(i));
					} 
					else {
						if (stack.size() == 0) {							
							answer = "NO";
							stack.push(str.charAt(i));
							break;
						}						
						else {
							if(stack.peek()==str.charAt(i)) stack.push(str.charAt(i));
							else stack.pop();
						}
					}
				}
				if(stack.size()==0) answer ="YES";
			}
			System.out.println(answer);
		}
	}
}