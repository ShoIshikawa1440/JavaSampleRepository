package question07;

import java.util.Arrays;

public class Question07_03 {

	public static void main(String[] args) {
		
		int[] nums = {30, 53, 21, 70, 60};

		Arrays.sort(nums);
		System.out.println("ソートが完了しました");

		for (int value : nums) {
			System.out.print(value + " ");
		}

	}

}
