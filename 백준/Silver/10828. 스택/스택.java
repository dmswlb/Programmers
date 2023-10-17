import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import java.io.IOException;

public class Main { 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Integer> stack = new Stack<>();		
		
		int n = Integer.parseInt(br.readLine());
		int a = 0;		
		
		for(int i = 0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());			
			String s = st.nextToken();
			
			switch (s) {
			case "push": 
				stack.push(Integer.parseInt(st.nextToken()));
				break;
			case "pop": 
				if(stack.empty()) a=-1;
				else {
					a=stack.peek(); 
					stack.pop();
				}
				System.out.println(a);
				break;
			case "size": 
				a= stack.size();
				System.out.println(a);
				break;
			case "empty": 
				if(stack.empty()) a=1;
				else a=0;
				System.out.println(a);
				break;
			case "top": 
				if(stack.empty()) a=-1;
				else a=stack.peek();
				System.out.println(a);
				break;			
			}			
		}			
		br.close();	     
	}
}