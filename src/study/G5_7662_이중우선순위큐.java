package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class G5_7662_이중우선순위큐 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		for (int tc = 1; tc <= T; tc++) {
			Map<Integer, Integer> map = new HashMap<>();
			PriorityQueue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
			PriorityQueue<Integer> minQueue = new PriorityQueue<>();
			int N = Integer.parseInt(bf.readLine()); // 연산의 개수
			for (int n = 0; n < N; n++) {
				StringTokenizer st = new StringTokenizer(bf.readLine());
				String ch = st.nextToken();
				int temp = Integer.parseInt(st.nextToken());
				if (ch.equals("I")) {
					map.put(temp, map.getOrDefault(temp, 0) + 1); // 같은값이 몇개있는지 체크용 temp의 value값을++해주는중
					maxQueue.offer(temp);
					minQueue.offer(temp);
				} else {// D
						// 큐가 비어있다면
					if (map.size() == 0)
						continue;
					PriorityQueue<Integer> queue;
					if (temp == 1) {
						queue = maxQueue;
					} else { // D -1
						queue = minQueue;
					}
					
					func(queue,map);
				}

			}
			// 연산이 모두 끝나고 큐가 비어있다면
			if (map.size() == 0) {
				System.out.println("EMPTY");
			} else {
				int result = func(maxQueue,map);
				System.out.println(result +" "+ (map.size()>0 ? func(minQueue,map):result));
			}
		} // tc for
	}

	public static int func(PriorityQueue<Integer> queue, Map<Integer, Integer> map) {
		int result = 0;
		while (true) {
			result = queue.poll();
			int value = map.getOrDefault(result, 0);

			if (value == 0)
				continue;

			if (value == 1) {
				map.remove(result);
			} else {
				map.put(result, value - 1);//중복값이 여러개일경우 그중에 하나만 삭제
			}
			break;

		}
		return result;
	}
}
