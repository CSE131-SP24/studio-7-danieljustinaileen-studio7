package studio7;

public class Die {
	public int numSides;
	
	public Die(int n) {
		this.numSides = n;
	}
	
	public int throwDie() {
		double rand = Math.random();
		double val = 1+ ( numSides)*rand;
		return (int) val;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die = new Die(6);
		for(int i=0; i<100; i++) {
			System.out.println(die.throwDie());
		}
	}

}
