import java.util.Arrays;
class Solution {
    public String solution(int[] numbers, String hand) {
        StringBuilder sb = new StringBuilder();
		int[] fr = new int[] { 3, 2 };
		int[] fl = new int[] { 3, 0 };
		int cnt=0;
		for (int num : numbers) {

			int lenl = 0;
			int lenr = 0;
			switch (num) {
			case 1: {
				sb.append('L');
				fl[0] = 0;
				fl[1] = 0;
				break;
			}
			case 2: {
				lenl = fl[0] + Math.abs(1 - fl[1]);
				lenr = fr[0] + Math.abs(1 - fr[1]);
				if (lenl < lenr) {
					sb.append('L');
					fl[0] = 0;
					fl[1] = 1;
				} else if (lenl > lenr) {
					sb.append('R');
					fr[0] = 0;
					fr[1] = 1;
				} else {
					if (hand.equals("right")) {
						sb.append('R');
						fr[0] = 0;
						fr[1] = 1;
					} else if(hand.equals("left")) {
						sb.append('L');
						fl[0] = 0;
						fl[1] = 1;
					}
				}
				break;
			}
			case 3: {
				sb.append('R');
				fr[0] = 0;
				fr[1] = 2;
				break;
			}
			case 4: {
				sb.append('L');
				fl[0] = 1;
				fl[1] = 0;
				break;
			}
			case 5: {
				lenl = Math.abs(1 - fl[0]) + Math.abs(1 - fl[1]);
				lenr = Math.abs(1 - fr[0]) + Math.abs(1 - fr[1]);
				if (lenl < lenr) {
					sb.append('L');
					fl[0] = 1;
					fl[1] = 1;
				} else if (lenl > lenr) {
					sb.append('R');
					fr[0] = 1;
					fr[1] = 1;
				} else {
					if (hand.equals("left")) {
						sb.append('L');
						fl[0] = 1;
						fl[1] = 1;
					} else if (hand.equals("right")){
						sb.append('R');
						fr[0] = 1;
						fr[1] = 1;
					}
				}
				break;
			}
			case 6: {
				sb.append('R');
				fr[0] = 1;
				fr[1] = 2;
				break;
			}
			case 7: {
				sb.append('L');
				fl[0] = 2;
				fl[1] = 0;
				break;
			}
			case 8: {
				lenl = Math.abs(2 - fl[0]) + Math.abs(1 - fl[1]);
				lenr = Math.abs(2 - fr[0]) + Math.abs(1 - fr[1]);
				if (lenl < lenr) {
					sb.append('L');
					fl[0] = 2;
					fl[1] = 1;
				} else if (lenl > lenr) {
					sb.append('R');
					fr[0] = 2;
					fr[1] = 1;
				} else {
					if (hand.equals("left")) {
						sb.append('L');
						fl[0] = 2;
						fl[1] = 1;
					} else if (hand.equals("right")){
						sb.append('R');
						fr[0] = 2;
						fr[1] = 1;
					}
				}

				break;
			}
			case 9: {
				sb.append('R');
				fr[0] = 2;
				fr[1] = 2;
				break;
			}
			case 0: {
				lenl = Math.abs(3 - fl[0]) + Math.abs(1 - fl[1]);
				lenr = Math.abs(3 - fr[0]) + Math.abs(1 - fr[1]);
				if (lenl < lenr) {
					sb.append('L');
					fl[0] = 3;
					fl[1] = 1;
				} else if (lenl > lenr) {
					sb.append('R');
					fr[0] = 3;
					fr[1] = 1;
				} else {
					if (hand.equals("left")) {
						sb.append('L');
						fl[0] = 3;
						fl[1] = 1;
					} else if (hand.equals("right")){
						sb.append('R');
						fr[0] = 3;
						fr[1] = 1;
					}
				}
				break;
			}
			}
		}
		return sb.toString();
    }
}