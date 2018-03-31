package BubbleSort;

public class BubbleSort {
	public static void main(String[] args) {
        // 冒泡排序
		//flag的作用：当数组是排好的如{1，2，3，4，5}，第一个循环完毕，flag=false，就可以直接中断i=1之后的循环
		//类似的{2，1，3，4，5}时，i=0循环调整2，1的位置后，i=1时，flag又变成false，中断i=2之后的循环
        int[] numbers = {5,4,3,2,1 };
        boolean flag = true;
        for (int i = 0; i < numbers.length - 1 && flag; i++) {
            flag = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j + 1] < numbers[j]) {
                    int t = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = t;
                    flag = true;
                }
            }
        }
        for (int number : numbers) {
            System.out.printf("%3d", number);
        }
    }
}
