package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class a1259 {

	public static void main(String[] args) throws IOException {
	
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			String str = bf.readLine();
			if (str.equals("0")) break;
			
			
			//charAt 사용
			boolean is = true;
			for (int i = 0; i < str.length(); i++) {
				if(str.charAt(i)!=str.charAt(str.length()-1-i)) {
					is = false;
				}
			}
			
			if (is) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
			
			
/*			//StringBuffer사용
 			String reverse = "";
			StringBuffer sf = new StringBuffer(str);
			String reverse = String.valueOf(sf.reverse()); // sf.reverse는 StringBuffer라서

			if (str.equals(reverse)) {
				sb.append("yes").append("\n");
			}else {
				sb.append("no").append("\n");
			}
*/
		}

		System.out.println(sb);
			
			
			
			
			
			
			
// 내가 맨첨으로 푼거
//		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//		ArrayList<String> index = new ArrayList<String>();
//		while (true) {
//			String num = bf.readLine();
//			if (num.equals("0"))
//				break;
//			String[] arr = num.split("");
//
//			switch (arr.length) {
//			case 1:
//				index.add("yes");
//				break;
//			case 2:
//				if (arr[0].equals(arr[1])) {
//					index.add("yes");
//				}else index.add("no");
//				break;
//			case 3:
//				if (arr[0].equals(arr[2])) {
//					index.add("yes");
//				}else index.add("no");
//				break;
//			case 4:
//				if (arr[0].equals(arr[3]) && arr[1].equals(arr[2])) {
//					index.add("yes");
//				}else index.add("no");
//				break;
//			case 5:
//				if (arr[0].equals(arr[4]) && arr[1].equals(arr[3])) {
//					index.add("yes");
//				}else index.add("no");
//				break;
//			default:
//				index.add("no");
//				break;
//			}// switch
//
//		} // while
//		for (String str : index) {
//			System.out.println(str);
//		}

	}

}
