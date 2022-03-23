package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class S1_2258_정육점 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken()); // 덩어리의 개수
		int M = Integer.parseInt(st.nextToken()); // 필요한 고기의 양

		int arr[][] = new int[N][2];

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(bf.readLine());
			arr[n][0] = Integer.parseInt(st.nextToken()); // 무게
			arr[n][1] = Integer.parseInt(st.nextToken()); // 가격
		}

		Arrays.sort(arr, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				if (o1[1] == o2[1]) {
					return o2[0] - o1[0];
				}
				return o1[1] - o2[1];

			}
		});

		int price = Integer.MAX_VALUE;
		int wSum = 0;
		int pSum = -1;
		boolean flag = false;
		for (int n = 0; n < N; n++) {
			wSum += arr[n][0];
			if (n > 0 && arr[n - 1][1] == arr[n][1]) {
				pSum += arr[n][1];
			} else {
				pSum = arr[n][1];
			}
			if (wSum >= M) {
				flag = true;
				price = Math.min(price, pSum);
			}
		}
		if (flag) {
			System.out.println(price);
		} else {
			System.out.println(-1);
		}
	}
}
