package Node;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node head, curr, N, p;
		// ��ʼ��ͷ�ڵ�
		head = curr = new Node();//��head��currָ��ͬһ�������������潫curr��ֵ��Ϊ1,head��ֵҲΪ1
		curr.setN(1);
		// �½ڵ�
		N = new Node();
		N.setN(2);
		// �½ڵ��������β
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
		// ---------��������----------------------
		curr = head;// key
		System.out.println("start");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();// key
		}
		// -----------------��2��������½ڵ�---------------------
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
		// ---------��������----------------------
		curr = head;
		System.out.println("insert");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}

		// -----------------ɾ��25�ڵ�--------------------
		curr = head;
		while (curr != null) {
			if (curr.getNext().getN() == 25) {
				p = curr.getNext().getNext();
				curr.setNext(p);
				break;
			} else
				curr = curr.getNext();
		}
		// ---------��������----------------------
		curr = head;
		System.out.println("delete");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}
		//---------���ͷ�ڵ�-----------------------
		N=new Node();
		N.setN(0);
		N.setNext(head);
		head =N;
		// ---------��������----------------------
		curr = head;
		System.out.println("add first");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}
		//--------ɾ��ͷ�ڵ�---------------------
		head=head.getNext();
		curr = head;
		System.out.println("delete first");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}
	}

}
