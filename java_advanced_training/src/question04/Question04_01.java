package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question04_01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		
		int price =  (int) (Integer.parseInt(str) * 0.7);
		
		System.out.println("3割引きで" + price +"円です。");
		

	}

}
