package demo;

public class App {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			if (num % 3 == 0 && num % 5 == 0) {
				System.out.println("fizzbuzz");
			} else if (num % 3 == 0) {
				System.out.println("fizz");
			} else if (num % 5 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(num);
			}
		}
	}

}
