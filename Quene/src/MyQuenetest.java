public class MyQuenetest {
    public static void main(String[] args) {
        MyQueneImpl quene = new MyQueneImpl();
        if (quene.isEmpty()) {
            System.out.println("Quene empty");
        }
        for (int i = 0; i < 20; i = i + 2) {
            quene.enQuene(i);
        }
        quene.Print();
        //System.out.println(quene.deQuene());
        System.out.println(quene.Front());
        System.out.println(quene.QueneSize());
    }
}