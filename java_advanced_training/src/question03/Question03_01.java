package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 入力された文字列を変数に代入
		String str = reader.readLine();
		
		// 入力された文字列をコンソールに出力
		System.out.println("サイズが" + str + "の靴を購入します");

	}
	
}
