package Exercice1;

public class Chronometre {
      
	private long TEMP;
	
	public Chronometre(long TEMP) {
		this.TEMP = TEMP;
	}
	
	public double avancer(long avancer) {
		return this.TEMP = this.TEMP  + avancer;
	}
	
	public double reculer(long reculer) {
		return this.TEMP -= reculer;
	}
	
	public long getTEMP() {
		return TEMP;
	}

	public void setTEMP(long tEMP) {
		TEMP = tEMP;
	}
		
}
