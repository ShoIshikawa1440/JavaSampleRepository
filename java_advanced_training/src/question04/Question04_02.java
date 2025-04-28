package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_02 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int price = Integer.parseInt(reader.readLine());
		price += Integer.parseInt(reader.readLine());
		price += Integer.parseInt(reader.readLine());
		
		System.out.println("合計" + (int) (price * 0.7) + "円");
		System.out.println("平均" + (int) (price / 3) + "円");

	}

}
