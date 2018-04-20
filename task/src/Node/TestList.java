package Node;

public class TestList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyList mylist=new MyList();
		for(int i=0;i<5;++i) {
			mylist.add2(i);
		}
		mylist.print();
		mylist.del(0);
		mylist.print();
	}

}
