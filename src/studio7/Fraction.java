package studio7;

public class Fraction {
	public int numerator;
	public int denominator;

	public Fraction(int n, int d) {
		this.numerator = n;
		this.denominator = d;
	}

	public int gcd(int n1, int n2) {
		if (n2 == 0) {
			return n1;
		}
		return gcd(n2, n1 % n2);
	}

	public void simplify() {
		int n = this.numerator;
		int d = this.denominator;
		int g = gcd(n, d);

		this.numerator = n / g;
		this.denominator = d / g;
	}

	public String toString() {
		return this.numerator + "/" + this.denominator;
	}

	public static Fraction sum(Fraction f1, Fraction f2) {
		int n = f1.numerator * f2.denominator + f1.denominator * f2.numerator;
		int d = f1.denominator * f2.denominator;

		Fraction sum = new Fraction(n, d);
		sum.simplify();
		return sum;
	}
	
	public static Fraction multiply(Fraction f1, Fraction f2) {
		int n = f1.numerator*f2.numerator;
		int d = f1.denominator*f2.denominator;
		
		Fraction mult = new Fraction(n,d);
		mult.simplify();
		return mult;
	}
	
	public Fraction reciprocal() {
		int n = this.denominator;
		int d = this.numerator;
		
		return new Fraction(n,d);
	}
	public static void main(String[] args) {
		Fraction half = new Fraction(2, 4);
		Fraction third = new Fraction(2, 6);
		System.out.println(sum(half, third));
		System.out.println(multiply(half,third));
		System.out.println(sum(half,third).reciprocal());

	}

}
