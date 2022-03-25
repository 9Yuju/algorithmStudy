package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class S2_1927_최소힙 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());// 연산의 개수

		PriorityQueue<Integer> queue = new PriorityQueue<>();

		for (int n = 0; n < N; n++) {
			int x = Integer.parseInt(bf.readLine());
			if (x == 0) {
				int y;
				if (queue.isEmpty()) {
					y = 0;
				} else
					y = queue.poll();

				System.out.println(y);
			} else {
				queue.add(x);
			}
		}

	}

}
