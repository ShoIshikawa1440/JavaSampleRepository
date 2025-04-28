package lesson06;

public class Sample0603 {

	public static void main(String[] args) {
		
		int num1 = 1;
		int num2 = 0;
		
		// 後置インクリメントを使用
		num2 = num1++;
		
		System.out.println("num2の値は" + num2 + "です。");
		
		num1 = 1;
		num2 = 0;
		
		// 前置インクリメントを使用
		num2 = ++num1;
		
		System.out.println("num2の値は" + num2 + "です。");

	}

}
