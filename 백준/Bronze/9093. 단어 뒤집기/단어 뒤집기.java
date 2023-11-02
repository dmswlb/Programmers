import java.util.Scanner;
import java.util.Stack;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n =Integer.parseInt(sc.nextLine());

		for (int a = 0; a < n; a++) {
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder();

			Stack<Character> stack = new Stack<Character>();
			String[] sep = str.split(" ");

			for (int i = 0; i < sep.length; i++) {
				for (int j = 0; j < sep[i].length(); j++) {
					stack.add(sep[i].charAt(j));
				}

				for (int j = 0; j < sep[i].length(); j++) {
					sb.append(stack.peek());
					stack.pop();
				}
				sb.append(" ");
			}
			sb.delete(sb.length() - 1, sb.length());
			System.out.println(sb.toString());
		}
	}
}