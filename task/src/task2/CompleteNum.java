package task2;

public class CompleteNum {
	static int test(int number) {
		int temp = 0;
		for (int i = 1; i < number; ++i) {
			if (number % i == 0) {
				temp = temp + i;
			}
		}
		if (temp == number) {
			return 1;
		}
		return 0;
	}
}
