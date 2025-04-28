package lesson06;

public class Sample0606 {

	public static void main(String[] args) {
		
		double dnum1 = 170.0;
		double dnum2 = 65.0;
		
		System.out.println("身長は" + dnum1 + "cmです。");
		System.out.println("体重は" + dnum2 + "kgです。");
		
		// このままだと代入付加
		//int inum1 = dnum1;
		// int inum2 = dnum2;
		
		// 型変換を行う
		int inum1 = (int) dnum1;
		int inum2 = (int) dnum2;
		
		System.out.println("身長は" + inum1 + "cmです。");
		System.out.println("体重は" + inum2 + "kgです。");

	 }

}
