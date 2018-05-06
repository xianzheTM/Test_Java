public class NodeD {
    private Object data;
    private NodeD next;
    private NodeD pre;

    public NodeD() {
    }

    public NodeD(Object data) {
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public NodeD getPre() {
        return pre;
    }

    public void setPre(NodeD pre) {
        this.pre = pre;
    }
}
