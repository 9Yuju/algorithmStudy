package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class S2_1931_회의실배정 {
	static int count = 1; //맨 처음은 무조건 들어가니까 1을 주고 시작함.
	static int N;
	static Meeting[] meetings;

	static class Meeting implements Comparable<Meeting> {
		int start, end;

		public Meeting(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}

		@Override
		public int compareTo(Meeting o) {
			return this.end != o.end ? this.end - o.end : this.start - o.start;
		}

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(bf.readLine());// 회의수

		meetings = new Meeting[N];
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			meetings[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		// 회의 목록을 종료시간 기준으로 오름차순, 종료시간이 같다면 시작시간을 기준으로 오름차순 정렬
		Arrays.sort(meetings);
		getSchedule();
		System.out.println(count);

	}

	public static void getSchedule() {
		int x = 0; //바로 전에 선택된 회의
		for (int i = 1; i < N; i++) { //meetings[0]은 이미들어갔으니까 1부터 돌리기
			if (meetings[x].end <= meetings[i].start) {
				count++;
				x = i;
			}
		}

	}
}
