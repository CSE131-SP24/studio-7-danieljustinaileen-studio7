package studio7;

public class Complex {
	public double real;
	public double img;
	
	public Complex(double r, double im) {
		this.real = r;
		this.img = im;
	}
	
	public static Complex add(Complex c1, Complex c2) {
		double r = c1.real+c2.real;
		double i = c1.img+c2.img;
		
		return new Complex(r,i);
	}
	
	public static Complex multiply(Complex c1, Complex c2) {
		double r = c1.real*c2.real-c1.img*c2.img;
		double i = c1.real*c2.img+c1.img*c2.real;
		
		return new Complex(r,i);
	}
	public String toString() {
		if (this.img>=0)return this.real + "+" + this.img+"i";
		else return this.real + "-" + this.img;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex one_one = new Complex(1,1);
		Complex two_three = new Complex(2,3);
		System.out.println(multiply(one_one,two_three));
		System.out.println(add(one_one,two_three));
		
	}

}
