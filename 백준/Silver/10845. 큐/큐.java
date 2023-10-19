import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> q = new ArrayList<>();

		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int a = -1;
			switch (s) {
			case "push":
				q.add(Integer.parseInt(st.nextToken()));
				break;
			case "pop":
				if (!q.isEmpty()) {
					a = q.get(0);
					q.remove(0);
				}
				System.out.println(a);
				break;
			case "size":
				System.out.println(q.size());
				break;
			case "empty":
				if (q.isEmpty())
					a = 1;
				else
					a = 0;
				System.out.println(a);
				break;
			case "front":
				if (!q.isEmpty())
					a = q.get(0);
				System.out.println(a);
				break;
			case "back":
				if (!q.isEmpty())
					a = q.get(q.size() - 1);
				System.out.println(a);
				break;
			default:
				break;
			}
		}
		br.close();
	}
}
