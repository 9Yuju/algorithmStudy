package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_2805_나무자르기 { //long써야하는 이유 : 입력값의 범위가 커서 sum같은 애들은 못받아옴

	static int N, M;
	static int arr[];
	static long high;

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());

		N = Integer.parseInt(st.nextToken()); // 나무의 수
		M = Integer.parseInt(st.nextToken()); // 가져가려고하는 최소 나무의 길이

		arr = new int[N];
		int arrMax = 0; // 배열 중 최대값
		StringTokenizer st1 = new StringTokenizer(bf.readLine());
		for (int n = 0; n < N; n++) {
			arr[n] = Integer.parseInt(st1.nextToken());
			if (arrMax < arr[n])
				arrMax = arr[n];
		}

		/*
		 * long x = 0;// 절단기 높이값 long high = 0; // 정답, 절단기에 설정할 수있는 높이의 최대값 while (true)
		 * { long sum = 0; // 가져갈 수 있는 나무의 합 if (x >= arrMax) break; for (int i = 0; i <
		 * N; i++) { if (arr[i] - x > 0) { sum += arr[i] - x; } } //
		 * System.out.println("x:" + x + " sum:" + sum); if (sum >= M) { high = x; } //
		 * System.out.println("high:" + high); x++; } System.out.println(high);
		 */

		search(0, arrMax); // 0부터 나무 최대높이까지 돌리기
		
		System.out.println(high);
	}

	// 높게 자를수록 합은 줄어든다 ~> 합이 M보다 많다면 mid를 더 높이기 ~> 범위를 올리기

	public static void search(int start, int end) {

		int mid = (start + end) / 2;
		// 기저조건 : 탐색을 다했으면 끝
		if (start > end) {
			return;
		}

		// mid보다 높은 나무들을 자른 값
		long sum = 0;
		for (int i = 0; i < N; i++) {
			if (arr[i] - mid > 0)
				sum += arr[i] - mid;
		}
		// 둘다 호출하지 않고 sum값으로 판별해서 절반만 호출
		if (sum >= M) {
			if (high < mid)
				high = mid;
			search(mid + 1, end);
		} else {
			search(start, mid-1);
		}

	}

}
