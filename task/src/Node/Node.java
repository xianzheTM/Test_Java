package Node;

public class Node {
	private int n;
	private Node next;//����һ����Ϊnext��Nodeʵ�������ִ�����������ʵ���Ǵ���һ�����ã�������ָ��
					  //int[] array = new int[]{1,2};�ȴ���һ�����ã��ٽ��������ӵ��ڶ����½���������ڴ�ռ�
					  //Node.next��ʾ��Node�������и�Node���͵�Next����
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
