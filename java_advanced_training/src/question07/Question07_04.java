package question07;

public class Question07_04 {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			String txt = "";
			for (int j = 0; j < i; j++) {
				txt += "＊";
			}
			System.out.println(txt);
		}

	}

}
