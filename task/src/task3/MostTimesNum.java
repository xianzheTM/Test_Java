package task3;

public class MostTimesNum {
	public static int Count(int[] array, int n) {
		/**
		 * @author YL
		 * @version 1.0
		 * @parameter 接受一个数组和数组长度
		 * @return 出现最多的数字
		 * ！！未实现出现同样多的数字返回较小的，目前返回的是大的
		 */
		int most = array[0];
		int count1 = 0;
		int count2 = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (array[i] == array[j]) {
					count1++;
				}
				if (count1 > count2) {
					count2 = count1;
					most = array[i];
				}
			}
		}
		return most;
	}
}
