package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S3_1003_피보나치함수 { // 피보나치 함수

	static int number[][] = new int[41][2];

	public static void main(String[] args) throws IOException {
		StringBuilder sb = new StringBuilder();
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		fibo(40);
		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(bf.readLine());
			sb.append(number[N][0]).append(" ").append(number[N][1] + "\n");

		} // for
		System.out.println(sb);

	}

	public static void fibo(int N) {

		for (int i = 0; i <= N; i++) {
			if (i == 0) {
				number[i][0] = 1;
				number[i][1] = 0;
			} else if (i == 1) {
				number[i][0] = 0;
				number[i][1] = 1;
			} else {
				number[i][0] = number[i - 1][1];
				number[i][1] = number[i - 1][0] + number[i - 1][1];
			}
		}

	}

}
