package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_2920_음계 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int[] arr = new int[8];
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int count = 0;
		for (int i = 0; i < 8; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if (i > 0 && Math.abs(arr[i] - arr[i - 1]) != 1) {
				System.out.println("mixed");
				break;
			} else {
				if (i > 0 && arr[i] - arr[i - 1] == 1) {
					count++;
				} else if (i > 0 && arr[i] - arr[i - 1] == -1) {
					count--;
				}
			}
		}
		if (count == 7) {
			System.out.println("ascending");
		} else if (count == -7) {
			System.out.println("descending");
		}
	}
}
