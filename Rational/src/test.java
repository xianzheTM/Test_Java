public class test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Rational a = new Rational(1, 4);
        Rational b = new Rational(3, 5);
        a.add(b);
        a.printRational();
        a.printReal();
        Rational c = new Rational(1, 5);
        Rational d = new Rational(3, 5);
        c.sub(d);
        c.printRational();
        c.printReal();
        Rational e = new Rational(3, 4);
        Rational f = new Rational(3, 5);
        e.mul(f);
        e.printRational();
        e.printReal();
        Rational g = new Rational(7, 4);
        Rational h = new Rational(2, 5);
        g.div(h);
        g.printRational();
        g.printReal();
    }
}
