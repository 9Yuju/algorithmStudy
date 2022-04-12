package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_5525_IOIOI {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		int M = Integer.parseInt(bf.readLine()); // S의 길이
		String text[] = bf.readLine().split("");

		int count = 0;

		int IOIcount = 0;
		for (int i = 1; i < text.length - 1; i++) {
			if (text[i - 1].equals("I") && text[i].equals("O") && text[i + 1].equals("I")) {
				IOIcount++;
				if (IOIcount == N) {
					count++;
					IOIcount--;
				}
				i++;
			} else {
				IOIcount = 0;
			}
		}

		System.out.println(count);
	}
}
