public class test {
    public static void main(String[] args) {
        MyStack teststack = new MyStack();
        String[] array1 = {"算","法","导","论"};
        String[] array2 = {"数","据","库","导","论"};
        teststack.add1(array1);
        teststack.add2(array2);
        System.out.println("在倒数第"+teststack.compare(teststack)+"合并");
    }
}
