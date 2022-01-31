package algorithmStudy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class a17413 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		StringTokenizer st = new StringTokenizer(str); // 공백으로 구분하려고쓰는
		// System.out.println(str);
		String s = "";

		ArrayList<String> list = new ArrayList<String>();

		if (str.contains(">")) {
			// 괄호 포함
			int index = 0, index2 = 0;

			while ((index2 - index) == 1) {// 괄호사이에 단어가없다면
				index = str.indexOf(">", index2);
				index2 = str.indexOf("<", index);
			}

			s = s.substring(index + 1, index2 - 1); // 괄호밖의 단어
			StringBuffer sb = new StringBuffer(s);
			s = String.valueOf(sb.reverse());
			list.add(s);

			// index2와 lastIndexOf가 같으면 마지막 괄호인걸 알수있다.

			
			
			
			
			
			
			
			
		} else {
			// 괄호 미포함
			while (st.hasMoreTokens()) {
				StringBuffer sb = new StringBuffer(String.valueOf(st.nextToken())); // 리버스쉽게하려고쓰는
				s = String.valueOf(sb.reverse());
				list.add(s); // 공백으로 각각 리스트에 넣기
			}
			for (String string : list) {
				System.out.print(string + " ");
			}
			System.out.println();

		} // if
	}
}
