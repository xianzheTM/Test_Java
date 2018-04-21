import java.util.EmptyStackException;

public class ArrayWithTwoStacks {
    private int[] dataArray;
    private int size;
    private int topOne;
    private int topTwo;

    public ArrayWithTwoStacks(int size) {
        if (size < 2) System.out.println("size < 2 is no persmissible");
        dataArray = new int[size];
        this.size = size;
        topOne = -1;
        topTwo = size;
    }

    public void push(int stackld, int data) {
        if (topTwo == topOne + 1) {
            System.out.println("Array is full");
        }
        if (stackld == 1) {
            dataArray[++topOne] = data;
        } else if (stackld == 2) dataArray[--topTwo] = data;
        else return;
    }

    public int pop(int stackld) {
        if (stackld == 1) {
            if (topOne == -1) {
                System.out.println("First Stack is Empty");
            }
            int toPop = dataArray[topOne];
            dataArray[topOne--] = 000;//书上的是dataArray[topOne--]=null;类型不匹配
            return toPop;
        } else if (stackld == 2) {
            if (topTwo == this.size) {
                System.out.println("Second Stack is Empty");
            }
            int toPop = dataArray[topTwo];
            dataArray[topTwo++] = 000;//书上的是dataArray[topTwo++]=null;类型不匹配
            return toPop;
        } else return 000;//书上是return null;类型不匹配
    }

    public int top(int stackld) {
        if (stackld == 1) {
            if (topOne == -1) System.out.println("First Stack is Empty");
            return dataArray[topOne];
        } else if (stackld == 2) {
            if (topTwo == this.size)
                System.out.println("Second Stack is Empty");
            return dataArray[topTwo];
        } else return 000;//书上的是dataArray[topTwo++]=null;类型不匹配
    }

    public boolean isEmpty(int stackld) {
        if (stackld == 1) {
            return topOne == -1;
        } else if (stackld == 2) {
            return topTwo == this.size;
        } else return true;
    }
}

