public class MyQueneImpl implements MyQuene {
    private Node frontNode;
    private Node rearNode;

    public MyQueneImpl() {
        this.frontNode = null;
        this.rearNode = null;
    }

    public boolean isEmpty() {
        return (frontNode == null);
    }

    public void enQuene(Object data) {
        Node newNode = new Node(data);
        if (frontNode == null) {
            frontNode = rearNode = newNode;
        } else {
            rearNode.setNext(newNode);
            rearNode = newNode;
        }
    }

    public Object deQuene() {
        Object data = null;
        if (isEmpty()) {
            System.out.println("Quene empty");
        } else {
            data = frontNode.getData();
            frontNode = frontNode.getNext();
        }
        return data;
    }

    public Object Front() {
        if (isEmpty()) {
            System.out.println("Quene empty");
            return null;
        }
        return frontNode.getData();
    }

    public int QueneSize() {
        Node curr = new Node();
        curr = frontNode;
        int count = 0;
        if (isEmpty()) {
            return count;
        }
        while (curr.getNext() != null) {
            count++;
            curr = curr.getNext();
        }
        return count + 1;
    }

    public void Print() {
        Node curr = new Node();
        curr = frontNode;
        do{
            System.out.println(curr.getData());
            curr=curr.getNext();
        }while (curr!=null);
    }

}
