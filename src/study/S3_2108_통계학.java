package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class S3_2108_통계학 {
	static int arr[];
	static int sum;
	static int N;

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine()); // 수의 개수
		arr = new int[N];
		sum = 0;
		for (int n = 0; n < N; n++) {
			arr[n] = Integer.parseInt(bf.readLine());
			sum += arr[n];
		}
		Arrays.sort(arr);
		avg(); // 산술평균
		middle(); // 중앙값
		many(); // 최빈값
		range(); // 범위
	}

	public static void avg() {
		double result = (double)sum / (double)N;
		System.out.println((int)Math.round(result));
	}

	public static void middle() {
		double temp = (double) N / 2 - (0.5);
		System.out.println(arr[(int)temp]);
	}

	public static void many() {
		boolean flag = false;
		int max_count = 0;
		int index = 20000;

		for (int i = 0; i < arr.length; i++) {
			int count = 1;
			int next = 0;
			int x = arr[i];
			for (int j = i + 1; j < arr.length; j++) {
				if (x != arr[j]) {
					break;
				}
				count++;
				next++;
			}

			if (max_count < count) {
				max_count = count;
				index = x;
				flag = true;
			} else if (max_count == count && flag == true) {
				index = x;
				flag = false;
			}
			i+=next;
		} // i for
		System.out.println(index);
	}

	public static void range() {
		System.out.println(arr[N - 1] - arr[0]);
	}

}
