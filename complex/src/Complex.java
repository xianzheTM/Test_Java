public class Complex {
    private double realPart;
    private double imaginaryPart;

    public Complex(double realPart, double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImaginaryPart() {
        return imaginaryPart;
    }

    public void setImaginaryPart(double imaginaryPart) {
        this.imaginaryPart = imaginaryPart;
    }
    public Complex add(Complex number){
        this.setImaginaryPart(this.getImaginaryPart()+number.getImaginaryPart());
        this.setRealPart(this.getRealPart()+number.getRealPart());
        return this;
    }
    public Complex sub(Complex number){
        this.setImaginaryPart(this.getImaginaryPart()-number.getImaginaryPart());
        this.setRealPart(this.getRealPart()-number.getRealPart());
        return this;
    }

    public void print(Complex number){
        System.out.println(number.getRealPart()+"+"+number.getImaginaryPart()+"i");
    }
}
