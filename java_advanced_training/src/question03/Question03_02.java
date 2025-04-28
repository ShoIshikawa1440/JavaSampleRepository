package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_02 {

public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 3回入力 入力値を変数の値に足して代入
		String str = reader.readLine();
		str = str + reader.readLine();
		str = str + reader.readLine();
		
		// 入力された文字列をコンソールに出力
		System.out.println(str);
	}

}
