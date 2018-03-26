package task2;

import java.util.Scanner;
import task2.CompleteNum;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		sc.close();
		if (CompleteNum.test(number) == 1) {
			System.out.println("yes");
		}
	}

}
