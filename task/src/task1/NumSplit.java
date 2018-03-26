package task1;

import java.util.Scanner;

public class NumSplit {

	public static void ScanSplit() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		int a = number / 100;
		int b = number % 100 / 10;
		int c = number % 100 % 10;
		System.out.printf("%d" + " " + "%d" + " " + "%d", a, b, c);
	}

}
