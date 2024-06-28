package exercise02;

public class PerfectNumber {
	static boolean checkNum (int num) {
		int sum = 1; 
        int sqrt = (int) Math.sqrt(num);
        
        for (int i = 2; i <= sqrt; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) {
                    sum += num / i;
                }
            }
        }
        return num != 1 && sum == num;
	}
	
	public static void main(String[] args) {
		for (int i = 0; i <= 1000000; i++) {
			if (checkNum(i)) {
				System.out.println(i);
			}
		}
	}
}