package task3;

public class MostTimesNum {
	public static int Count(int[] array, int n) {
		/**
		 * @author YL
		 * @version 1.0
		 * @parameter ����һ����������鳤��
		 * @return ������������
		 * ����δʵ�ֳ���ͬ��������ַ��ؽ�С�ģ�Ŀǰ���ص��Ǵ��
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
