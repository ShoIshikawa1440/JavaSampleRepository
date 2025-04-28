package question08;

public class Question08_02 {

	public static void main(String[] args) {
		
		int[] score = { 88, 62, 54, 76, 45 };
		
		int sum = 0;
		for(int i : score) {
			sum += i;
		}
		
		System.out.println("全員のテストの合計は" + sum + "点です。");

	}

}
