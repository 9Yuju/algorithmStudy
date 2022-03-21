package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_20361_일우는야바위꾼 {
	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		StringTokenizer st = new StringTokenizer(bf.readLine()); // 한줄을 받아와서 나눈다
		int N = Integer.parseInt(st.nextToken()); // 종이컵의수
		int X = Integer.parseInt(st.nextToken()); // 간식종이컵위치
		int K = Integer.parseInt(st.nextToken()); // 바꾸는횟수

		// 종이컵과같은 개수의 배열을 생성하고 간식종이컵에 1값을 넣는다
		int[] arr = new int[N + 1]; // 종이컵은 1부터 시작하고 배열은 0부터 시작해서 +1해준다
		arr[X] = 1;

		for (int k = 0; k < K; k++) { // 바꾸는 횟수동안
			StringTokenizer st1 = new StringTokenizer(bf.readLine());
			int A = Integer.parseInt(st1.nextToken()); // 바꾼 두 컵의 위치
			int B = Integer.parseInt(st1.nextToken());

			// 임시값을 이용하여 두 값을 서로 바꿔주기
			int temp = arr[A];
			arr[A] = arr[B];
			arr[B] = temp;
		} // k for

		// 모두 바꾼 후 간식이 들어있는 종이컵 찾기
		int index = 0; // 간식이 들어있는 종이컵의 위치값
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == 1) {
				index = i;
			}
		}

		sb.append(index + "\n");

		System.out.println(sb);

	}
}