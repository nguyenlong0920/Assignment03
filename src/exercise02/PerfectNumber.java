package exercise02;

public class PerfectNumber {
	static boolean checkNum (int num) {
		int sum = 0;
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				sum += i;
			}
		}
		return sum == num;
	}
	
	public static void main(String[] args) {
		// 0 is not a perfect number
		for (int i = 1; i <= 1000; i++) {
			if (checkNum(i)) {
				System.out.println(i);
			}
		}
	}
}