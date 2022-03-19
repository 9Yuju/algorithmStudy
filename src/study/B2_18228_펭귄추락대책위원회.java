package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2_18228_펭귄추락대책위원회 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(bf.readLine()); //총 얼음 개수
		int [] arr = new int[N]; // 개수만큼 배열
		StringTokenizer st = new StringTokenizer(bf.readLine()); //배열입력
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(st.nextToken()); //하나씩 넣기
			//System.out.println(arr[i]); //확인
		}
		// -1인 인덱스 찾기
		int index = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==-1) {
				index = i;
			}
		}
		//최소값들 찾기
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for (int i = 0; i < index; i++) {
			if(arr[i]<min1) min1 = arr[i];
		}
		for (int i = index+1; i < arr.length; i++) {
			if(arr[i]<min2) min2 = arr[i];
		}
		System.out.println(min1+min2);
	}
}













