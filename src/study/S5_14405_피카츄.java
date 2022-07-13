package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S5_14405_피카츄 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		boolean isRight = true;

		String str = bf.readLine();
		int idx = 0;

		
		while (idx < str.length()) {
			if (str.charAt(idx) == 'p') {
				if (idx+1 < str.length() && str.charAt(idx + 1) == 'i') {
					idx += 2;
				} else {
					isRight = false;
					break;
				}
			} else if (str.charAt(idx) == 'k') {
				if (idx+1 < str.length() &&str.charAt(idx + 1) == 'a') {
					idx += 2;
				} else {
					isRight = false;
					break;
				}
			} else if (str.charAt(idx) == 'c') {
				if (idx+1 < str.length() &&str.charAt(idx + 1) == 'h') {
					if (idx+2 < str.length() &&str.charAt(idx + 2) == 'u') {
						idx += 3;
					} else {
						isRight = false;
						break;
					}
				} else {
					isRight = false;
					break;
				}
			} else {
				isRight = false;
				break;
			}

		}
		
		if(isRight) {
			System.out.println("YES");
		}else System.out.println("NO");

	}

}
