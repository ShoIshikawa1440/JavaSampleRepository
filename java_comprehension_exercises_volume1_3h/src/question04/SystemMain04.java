package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain04 {

	public static void main(String[] args) throws IOException {
		
		// (1)
		int[] ageGroup1 = new int[5];
		ageGroup1[0] = 22;
		ageGroup1[1] = 18;
		ageGroup1[2] = 24;
		ageGroup1[3] = 19;
		ageGroup1[4] = 20;
		
		// (2)
		System.out.println("配列 ageGroup1 で 3 番目の人の新しい年齢を入力してください");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int age = Integer.parseInt(str);
		
		ageGroup1[2] = age;
		
		System.out.println("「配列 ageGroup1 で 3 番目の人の年齢は" + ageGroup1[2] + "歳です。");
		
		// (3)
		int[] ageGroup2 = new int[6];
		ageGroup2[0] = 23;
		ageGroup2[1] = 33;
		ageGroup2[2] = 26;
		ageGroup2[3] = 21;
		ageGroup2[4] = 25;
		ageGroup2[5] = 22;
		
		System.out.println("配列 ageGroup2 で 4 番目の人の年齢は" + ageGroup2[3] + "歳です。");
		
		ageGroup2[3] = ageGroup1[3];
		
		System.out.println("配列 ageGroup2 で 4 番目の人の年齢は" + ageGroup2[3] + "歳です。");
		
		// (4)
		System.out.println("配列ageGroup1の要素数は" + ageGroup1.length + "人です。");
		System.out.println("配列ageGroup2の要素数は" + ageGroup2.length + "人です。");
		
	}

}
