package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S2_20365_블로그2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine());
		char arr[] = bf.readLine().toCharArray();
		int bCnt = 0, rCnt = 0;
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			if(i==0) {
				if(arr[i]=='B') {
					bCnt++;
				}else {
					rCnt++;
				}
			}else {
				if(arr[i]==arr[i-1]) continue;
				if(arr[i]=='B') {
					bCnt++;
				}else {
					rCnt++;
				}
			}
		} 
		
		result = (bCnt >= rCnt) ? rCnt+1 : bCnt+1;
		
		System.out.println(result);
		
	}

}
