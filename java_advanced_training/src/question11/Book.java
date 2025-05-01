package question11;

public class Book {
	
	private String title;
	private int price;
	
	Book() {
		title = "Javaプログラミング";
		price = 3250;
	}
	
	public void show() {
		System.out.println("本のタイトルは「" + title + "」です");
		System.out.println("価格は" + price + "円です");
	}

}
