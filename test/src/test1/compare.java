package test1;

public class compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x1 = 100;
		int y1 = 100;
		Integer wx1 = x1;
		Integer wy1 = y1;
		System.out.println(x1 == y1);
		System.out.println(wx1 == wy1);
		int x2 = 200;
		int y2 = 200;
		Integer wx2 = x2;
		Integer wy2 = y2;
		System.out.println(x2 == wx2);
		System.out.println(y2 == wy2);
		int x3 = 300;
		int y3 = 300;
		Integer wx3 = x3;
		Integer wy3 = y3;
		System.out.println(wx3.equals(x3));
		System.out.println(wy3.equals(y3));
		int[] arr1 = { 1, 2, 3 };
		int[] arr2 = arr1;
		arr2[1] = 20;
		System.out.println(arr1[1]);
		float radius=88.2f;
		double area=2*3.14*radius*radius;
		System.out.println(area);
		System.out.println(-Integer.MAX_VALUE==Integer.MIN_VALUE);
	}

}
