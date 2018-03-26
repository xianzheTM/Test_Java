package Node;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head, curr, N, p;
		// 初始化头节点
		head = curr = new Node();//将head和curr指向同一个对象，所以下面将curr的值设为1,head的值也为1
		curr.setN(1);
		// 新节点
		N = new Node();
		N.setN(2);
		// 新节点插入链表尾
		curr.setNext(N);
		curr = N;

		N = new Node();
		N.setN(3);
		curr.setNext(N);
		curr = N;

		N = new Node();
		N.setN(4);
		curr.setNext(N);
		curr = N;
		// ---------遍历链表----------------------
		curr = head;// key
		System.out.println("start");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();// key
		}
		// -----------------在2后面插入新节点---------------------
		N = new Node();
		N.setN(25);

		curr = head;
		while (curr != null)
			if (curr.getN() == 2) {
				p = curr.getNext();
				curr.setNext(N);
				N.setNext(p);
				break;// key
			} else
				curr = curr.getNext();
		// ---------遍历链表----------------------
		curr = head;
		System.out.println("insert");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}

		// -----------------删除25节点--------------------
		curr = head;
		while (curr != null) {
			if (curr.getNext().getN() == 25) {
				p = curr.getNext().getNext();
				curr.setNext(p);
				break;
			} else
				curr = curr.getNext();
		}
		// ---------遍历链表----------------------
		curr = head;
		System.out.println("delete");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}
		//---------添加头节点-----------------------
		N=new Node();
		N.setN(0);
		N.setNext(head);
		head =N;
		// ---------遍历链表----------------------
		curr = head;
		System.out.println("add first");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}
		//--------删除头节点---------------------
		head=head.getNext();
		curr = head;
		System.out.println("delete first");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}
	}

}
