package BubbleSort;

public class BubbleSort {
	public static void main(String[] args) {
        // ð������
		//flag�����ã����������źõ���{1��2��3��4��5}����һ��ѭ����ϣ�flag=false���Ϳ���ֱ���ж�i=1֮���ѭ��
		//���Ƶ�{2��1��3��4��5}ʱ��i=0ѭ������2��1��λ�ú�i=1ʱ��flag�ֱ��false���ж�i=2֮���ѭ��
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
