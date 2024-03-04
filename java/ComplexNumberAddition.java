import java.util.Scanner;

class Complex {
double real, imaginary;

public Complex(double real, double imaginary) 
{
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        double sumReal = this.real + other.real;
        double sumImaginary = this.imaginary + other.imaginary;
        return new Complex(sumReal, sumImaginary);
    }
    public String toString() {
        if (imaginary >= 0) {
            return real + " + " + imaginary + "i";
        } else {
            return real + " - " + Math.abs(imaginary) + "i";
        }
    }
}

public class ComplexNumberAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.println("Enter real part of the first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of the first complex number: ");
        double imaginary1 = scanner.nextDouble();
        Complex complex1 = new Complex(real1, imaginary1);

       
        System.out.println("Enter real part of the second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of the second complex number: ");
        double imaginary2 = scanner.nextDouble();
        Complex complex2 = new Complex(real2, imaginary2);

       
        Complex sum = complex1.add(complex2);

       
        System.out.println("Result of complex number addition: " + sum);

        scanner.close();
    }
}
