package studio7;

public class HockeyPlayer {
	public String name;
	public int jerseyNumber;
	public String hand;
	public String shootDirection;
	public int numberGames = 0;
	public int goals=0;
	public int assists=0;
	public int points=0;
	
	public HockeyPlayer(String n, int j, int h, int sd) {
		this.name =n;
		this.jerseyNumber = j;
		
		if(h==0) {
			this.hand = "left-handed";
		}else if (h==1) {
			this.hand="right-handed";
		}else {
			this.hand="both-handed";
		}
		
		if(sd==0) {
			this.shootDirection = "left";
		}else {
			this.shootDirection = "right";
		}
	}
	
	public void gameFinished(int g, int a) {
		this.numberGames ++;
		this.goals += g;
		this.assists +=a;
	}
	
	public String toString() {
		return "name: " + this.name + "\n" + "jersey number: " + this.jerseyNumber + "\n";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	}

}
