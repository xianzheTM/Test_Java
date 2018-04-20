import java.util.EmptyStackException;

public class NodeStack {
    private Node headNode;//用链表实现栈

    public Node getHeadNode() {
        return headNode;
    }

    public void setHeadNode(Node headNode) {
        this.headNode = headNode;
    }

    public NodeStack() {
        this.headNode = new Node(null);
    }

    public void Push(Object data) {
        if (headNode == null) {//如果头节点为空，即链表/栈为空，创建头节点的下一个节点
            headNode = new Node(data);
        } else if (headNode.getData() == null) {
            headNode.setData(data);//有头节点，但数据为空
        } else {//已经存在节点
            Node curr = new Node(data);
            curr.setNext(headNode);//将新节点指向旧节点
            headNode = curr;//头节点指向新节点
        }
    }

    public Object pop() throws EmptyStackException {
        if (headNode == null) {
            throw new EmptyStackException();//栈为空
        } else {
            Object data = headNode.getData();
            headNode = headNode.getNext();
            return data;
        }
    }
}
