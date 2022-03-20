package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3_1085_직사각형에서탈출 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int arr[] = new int[6];
		arr[0] = 0;
		arr[1] = 0;
		for (int i = 2; i < 6; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int min = Math.min(Math.min(arr[3] - arr[1], arr[5] - arr[3]), Math.min(arr[2] - arr[0], arr[4] - arr[2]));
		System.out.println(min);
	}

}
