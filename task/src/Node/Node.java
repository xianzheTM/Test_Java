package Node;

public class Node {
	private int n;
	private Node next;//创建一个名为next的Node实例，这种创建对象名称实际是创建一种引用，类似于指针
					  //int[] array = new int[]{1,2};先创建一个引用，再将引用连接到在堆上新建的数组的内存空间
					  //Node.next表示在Node对象中有个Node类型的Next对象
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
