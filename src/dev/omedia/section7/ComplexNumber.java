package dev.omedia.section7;

public class ComplexNumber {
    private double imaginary;
    private double real;

    public ComplexNumber(double imaginary, double real) {
        this.imaginary = imaginary;
        this.real = real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double getReal() {
        return real;
    }

    public String add(double real, double imaginary) {
        ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
        return add(complexNumber);
    }

    public String add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
        return ("(" + real + "," + imaginary + ")");
    }

    public String subtract(double real, double imaginary) {
        ComplexNumber complexNumber = new ComplexNumber(real, imaginary);
        return subtract(complexNumber);
    }

    public String subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
        return ("(" + real + "," + imaginary + ")");
    }

}
