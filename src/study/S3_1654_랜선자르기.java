package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S3_1654_랜선자르기 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		int arr[] = new int[K];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < K; i++) {
			arr[i] = Integer.parseInt(bf.readLine());
			min = Math.min(arr[i], min);
		}
		L: for (int i = min; i > 0; i--) {
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				count += arr[j] / i;
			}
			System.out.println(i+":"+count);
			if (count >= N) {
				System.out.println(i);
				break L;
			}
		}
	}
}
