package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2_18111_마인크래프트 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());

		int arr[][] = new int[N][M];
		int maxH = 0;
		int minH = 0;
		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(bf.readLine());
			for (int m = 0; m < M; m++) {
				arr[n][m] = Integer.parseInt(st.nextToken());
				maxH = Math.max(maxH, arr[n][m]);
				minH = Math.min(minH, arr[n][m]);
			}
		}

		int minTime = Integer.MAX_VALUE; // 정답
		int floor = -1; // 정답

		for (int i = maxH; i >= minH; i--) {
			int time = 0;
			int inven = B; // 인벤토리를 매번 바꿔서 모자라면 해당X
			for (int j = 0; j < N; j++) {
				for (int j2 = 0; j2 < M; j2++) {
					int temp = arr[j][j2] - i;
					if (temp > 0) { // 제거
						time += Math.abs(temp) * 2; // 제거는 2초
						inven += Math.abs(temp);
					} else if (arr[j][j2] - i < 0) { // 추가
						time += Math.abs(temp);
						inven -= Math.abs(temp);
					}
				}
			}
			if (inven >= 0) { // 남아있으면 최소시간 비교
				if (minTime > time) {
					minTime = time;
					floor = i;
				}
			}
		}
		System.out.println(minTime + " " + floor);
	}
}
