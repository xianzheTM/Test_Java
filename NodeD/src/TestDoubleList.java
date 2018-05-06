/**
 * @author YL
 */
public class TestDoubleList {
    public static void main(String[] args) {
        MyDoubleListImpl testnode = new MyDoubleListImpl();
        /*插入*/
        for (int i = 0; i < 20; i = i + 2) {
            testnode.add(i);
        }
        /*打印*/
        for (int i = 0; i < testnode.getLength(); i++) {
            System.out.println(testnode.getData(i));
        }
        System.out.println("--------------------------------");
        testnode.add("head", 0);

        testnode.add("tail", 11);

        testnode.add("middle", 6);

        for (int i = 0; i < testnode.getLength(); i++) {
            System.out.println(testnode.getData(i));
        }
        System.out.println("--------------------------------");
        System.out.println("the index of \"tail\" is " + testnode.getIndex("tail"));
        System.out.println("--------------------------------");
        System.out.println("the 6th is " + testnode.getData(6));
        System.out.println("--------------------------------");
        testnode.del(0);
        for (int i = 0; i < testnode.getLength(); i++) {
            System.out.println(testnode.getData(i));
        }

        System.out.println("--------------------------------");
        testnode.add("exit","tail");
        for (int i = 0; i < testnode.getLength(); i++) {
            System.out.println(testnode.getData(i));
        }
        System.out.println("--------------------------------");
        testnode.del("tail");
        for (int i = 0; i < testnode.getLength(); i++) {
            System.out.println(testnode.getData(i));
        }
    }
}
