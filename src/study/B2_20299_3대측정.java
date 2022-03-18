package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_20299_3대측정 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		StringBuilder sb = new StringBuilder();

		int N = Integer.parseInt(st.nextToken()); // 신청한 동아리수
		int K = Integer.parseInt(st.nextToken()); // 팀원3명의 합 가입조건
		int L = Integer.parseInt(st.nextToken()); // 최소 개인능력치
		int count = 0; // 가입이 가능한 동아리 수
		for (int i = 0; i < N; i++) { // 신청한 동아리수 만큼 돌리기
			// 들어오는 개인능력치를 입력받는다.
			StringTokenizer st1 = new StringTokenizer(bf.readLine());
			int x1 = Integer.parseInt(st1.nextToken());
			int x2 = Integer.parseInt(st1.nextToken());
			int x3 = Integer.parseInt(st1.nextToken());

			// 합이 S 이상
			if (x1 + x2 + x3 >= K) {
				// 개개인이 M 이상
				if (x1 >= L & x2 >= L & x3 >= L) {
					count++; // 가입이 가능한 동아리수를 출력한다.
					sb.append(x1 + " ").append(x2 + " ").append(x3 + " "); // count를 먼저 출력해야하기때문에 모아놓는다
				}
			}

		} // i for
		System.out.println(count);
		System.out.println(sb);

	}
}
