public class MyStack {
    NodeStack mystack1 = new NodeStack();
    NodeStack mystack2 = new NodeStack();

    public void add1(Object[] array) {
        for (Object member : array) {
            mystack1.Push(member);
        }
    }

    public void add2(Object[] array) {
        for (Object member : array) {
            mystack2.Push(member);
        }
    }

    public int compare(MyStack test) {
        int count = 0;
        while (mystack1.getHeadNode().getData()==(mystack2.getHeadNode().getData())) {//比较两个链表的头节点的data值，要求的地址值未能实现
            mystack1.pop();
            mystack2.pop();
            count++;
        }
        return count;
    }
}