package Node;

public class MyList {
	Node head = null;
	Node tail = null;
	Node curr = null;

	void add1(int n) {
		Node N;
		if (head == null) {
			head = tail = new Node();
			head.setN(n);
		} else {
			N = new Node();
			N.setN(n);
			tail.setNext(N);
			tail = N;
		}
	}

	void add2(int n) {
		Node N, curr;
		if (head == null) {
			head = tail = new Node();
			head.setN(n);
		} else {
			curr = head;
			while (curr != null) {
				if (curr.getNext() == null) {
					N = new Node();
					N.setN(n);
					curr.setNext(N);
					break;
				}
				curr = curr.getNext();
			}

		}
	}

	// ---------±éÀúÁ´±í----------------------
	void print() {
		curr = head;// key
		System.out.println("start");
		while (curr != null) {
			System.out.println(curr.getN());
			curr = curr.getNext();
		}
	}

	// ----------„h³ýÊý×Ö-----------------------
	void del(int n) {
		curr = head;
		while (curr != null) {
			if(curr.getN()==n) {
				head=curr.getNext();
				break;
			}
			if(curr.getNext().getN() == n) {
				curr.setNext(curr.getNext().getNext());
				break;
			}
			if(curr.getNext().getN() == n&&curr.getNext()==null) {
				curr.setNext(null);
			}
			
			curr=curr.getNext();
		}
	}

	// void add(int n,int index);
	// void del(int n,int index);
}
