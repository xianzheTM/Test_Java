package task3;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] array=new int[N];
		for(int i=0;i<N;++i) {
			array[i]=sc.nextInt();
		}
		sc.close();
		System.out.println(MostTimesNum.Count(array,N));
	}

}
