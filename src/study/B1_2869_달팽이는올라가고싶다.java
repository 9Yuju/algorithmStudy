package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1_2869_달팽이는올라가고싶다 { // 달팽이는 올라가고 싶다 
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(bf.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int V = Integer.parseInt(st.nextToken());

		int count = (V - B) / (A - B);
		if (((V - B) % (A - B)) != 0)
			count++;

		StringBuffer sb = new StringBuffer();
		sb.append(count);
		System.out.println(sb);

	}
}
