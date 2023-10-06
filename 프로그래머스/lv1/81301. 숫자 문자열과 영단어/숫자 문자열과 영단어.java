import java.util.Arrays;

class Solution {
    public int solution(String s) {
            StringBuilder sb = new StringBuilder();
			String[] arr = s.split("");
			System.out.println(Arrays.toString(arr));
			System.out.println("len: " + arr.length);
			String a = "";
//			String[] num = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
//			String[] wordStrings = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
			int i=0;
			while(i<arr.length) {
				System.out.println("i번쨰"+arr[i]);
				System.out.println("sb:"+sb);
				// 0
				if (arr[i].equals("z")) {
					sb.append("0");
					System.out.println(i);
					i += 4;
				}
				// 1
				else if (arr[i].equals("o")) {
					sb.append("1");
					System.out.println(i);
					i += 3;
				} 
				else if (arr[i].equals("t") && arr[i + 1].equals("w")) {
					// 2

					sb.append("2");
					System.out.println(i);
					i += 3;
				}

				// 3
				else if (arr[i].equals("t") && arr[i + 1].equals("h")) {
					sb.append("3");
					System.out.println(i);
					i += 5;
				}

				// 4
				else if (arr[i].equals("f")) {
					if (arr[i + 1].equals("o")) {
						sb.append("4");
						System.out.println(i);
						i += 4;
					} else if (arr[i + 1].equals("i")) {
						sb.append("5");
						System.out.println(i);
						i += 4;
					}
				}

				else if (arr[i].equals("s")) {
					// 6
					if (arr[i + 1].equals("i")) {
						sb.append("6");
						System.out.println(i);
						i += 3;
					}
					// 7
					else if (arr[i + 1].equals("e")) {
						sb.append("7");
						System.out.println(i);
						i += 5;
					}
				}
				// 8
				else if (arr[i].equals("e")) {
					sb.append("8");
					System.out.println(sb);
					System.out.println(i);
					i += 5;
				}
				// 9
				else if (arr[i].equals("n")) {
					sb.append("9");
					System.out.println(i);
					i += 4;
				} else {
					sb.append(arr[i]);
					i++;
				}
				System.out.println("si: "+i);
            }
        return Integer.parseInt(sb.toString());
    }
}