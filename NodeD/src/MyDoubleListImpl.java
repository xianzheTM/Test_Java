/**
 * 实现了Mylist接口
 *
 * @author YL
 */
public class MyDoubleListImpl implements Mylist {
    private NodeD head = null;
    private NodeD tail = null;


    @Override
    public int getLength() {
        NodeD curr;
        curr = head;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.getNext();
        }
        return length;
    }


    @Override
    public void add(Object data) {
        NodeD newNodeD = new NodeD(data);
        if (head == null) {
            head = newNodeD;
        } else {
            tail.setNext(newNodeD);
            newNodeD.setPre(tail);
        }
        tail = newNodeD;
    }


    @Override
    public void add(Object data, int index) {
        if (index > getLength() || index < 0) {
            throw new RuntimeException("Out of Bounds");
        }
        /*在尾部插入*/
        if (index == getLength()) {
            add(data);
        }
        NodeD newNodeD = new NodeD(data);
        NodeD curr = head;
        /*在头部插入*/
        if (index == 0) {
            head = newNodeD;
            if (head == null) {
                tail = newNodeD;
            } else {
                curr.setPre(newNodeD);
                head = newNodeD;
                head.setNext(curr);
            }
        }
        /*向中间插入*/
        if (index > 0 && index < getLength() - 1) {
            int count = 0;
            /*将curr移动到索引值的前一位*/
            while (count < index - 1) {
                curr = curr.getNext();
                count++;
            }
            curr.getNext().setPre(newNodeD);
            newNodeD.setNext(curr.getNext());
            curr.setNext(newNodeD);
            newNodeD.setPre(curr);
        }
    }


    @Override
    public void add(Object data, Object afterData) {
        add(data, getIndex(afterData) + 1);
    }

    @Override
    public int getIndex(Object data) {
        NodeD curr = head;
        int index = 0;
        while (!curr.getData().equals(data) && curr != null) {
            index++;
            curr = curr.getNext();
        }
        if (index < getLength()) {
            return index;
        } else {
            throw new RuntimeException("Can't find the data");
        }
    }

    @Override
    public Object getData(int index) {
        NodeD curr = head;
        int count = 0;
        if (index < 0 || index >= getLength()) {
            return null;
        } else {
            while (count < index) {
                count++;
                curr = curr.getNext();
            }
        }
        return curr.getData();
    }

    @Override
    public void del(int index) {
        if (index >= getLength() || index < 0) {
            throw new RuntimeException("Out of Bounds");
        }
        NodeD curr = head;
        int count = 0;
        while (count < index - 1) {
            curr = curr.getNext();
            count++;
        }
        if (count == 0) {
            head = head.getNext();
            head.setPre(null);
        } else if (count == getLength() - 1) {
            curr.setNext(null);
            tail = curr;
        } else {
            curr.getNext().getNext().setPre(curr);
            curr.setNext(curr.getNext().getNext());
        }
    }

    @Override
    public void del(Object data) {
        del(getIndex(data));
    }
}
