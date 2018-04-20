public class Rational {
    private int molecule;
    private int denominator;

    public Rational(int molecule, int denominator) {
        this.molecule = molecule;
        this.denominator = denominator;
        simplify(this.molecule, this.denominator);
    }

    private void simplify(int molecule, int denominator) {//化简分数形式
        boolean flag = true;
        if (molecule < 0) {
            molecule = -molecule;
            flag = false;
        }
        if (denominator < 0) {
            denominator = -denominator;
            flag = false;
        }
        if (flag == false) {
            this.molecule = -molecule / getGCF(molecule, denominator);
            this.denominator = denominator / getGCF(molecule, denominator);
        } else {
            this.molecule = molecule / getGCF(molecule, denominator);
            this.denominator = denominator / getGCF(molecule, denominator);
        }
    }

    private void reversesimplify(Rational number) {//用于将两个分数通分,将结果保存在backup中
        int tempthisdenominator = this.denominator;
        int tempnumberdenominator = number.getDenominator();
        this.denominator=this.getLCM(this.denominator, number.getDenominator());
        number.setDenominator(this.denominator);
        // 统一两个分数的分母

        this.molecule=(this.denominator / tempthisdenominator) * this.molecule;
        number.setMolecule((number.getDenominator() / tempnumberdenominator) * number.getMolecule());
        //计算各自的分子
    }
    public int getMolecule() {
        return molecule;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setMolecule(int molecule) {
        this.molecule = molecule;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    private int getGCF(int a, int b) {
        int temp;
        while (b != 0) {
            /* 利用辗除法，直到b为0为止 */
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }// Greatest Common Factor(最大公因数),用于化简分数

    private int getLCM(int a, int b) {
        int temp_lcm;
        temp_lcm = a * b / getGCF(a, b);// 最小公倍数等于两数之积除以最大公约数
        return temp_lcm;
    }// 最小公倍数

    public Rational add(Rational number) {
        reversesimplify(number);
        this.molecule=this.molecule + number.getMolecule();
        return this;
    }

    public Rational sub(Rational number) {
        reversesimplify(number);
        this.molecule=this.molecule - number.getMolecule();
        return this;
    }

    public Rational mul(Rational number) {
        this.molecule=this.molecule * number.getMolecule();
        this.denominator=this.denominator * number.getDenominator();
        return this;
    }

    public Rational div(Rational number) {
        this.molecule=this.molecule * number.getDenominator();
        this.denominator=this.denominator * number.getMolecule();
        return this;
    }

    public void printRational() {
        if (this.getMolecule() == 0) {
            System.out.println("0");
        }
        if (this.getMolecule() % this.getDenominator() == 0) {
            System.out.println(this.getMolecule() / this.getDenominator());
        }
        simplify(this.getMolecule(), this.getDenominator());
        System.out.println(this.getMolecule() + "/" + getDenominator());
    }

    public void printReal() {
        simplify(this.getMolecule(), this.getDenominator());
        System.out.println((double)this.getMolecule() / getDenominator());
    }
}
