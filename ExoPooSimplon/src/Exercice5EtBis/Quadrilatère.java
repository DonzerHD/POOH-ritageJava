package Exercice5EtBis;

public class Quadrilatère {
	protected double cote1, cote2, cote3, cote4;

	public Quadrilatère(double cote1, double cote2, double cote3, double cote4) {
		this.cote1 = cote1;
		this.cote2 = cote2;
		this.cote3 = cote3;
		this.cote4 = cote4;
	}

	public double calculperimetre() {
		return this.cote1 + this.cote2 + this.cote3 + this.cote4;
	}


	public double getCote1() {
		return cote1;
	}

	public void setCote1(double cote1) {
		this.cote1 = cote1;
	}

	public double getCote2() {
		return cote2;
	}

	public void setCote2(double cote2) {
		this.cote2 = cote2;
	}

	public double getCote3() {
		return cote3;
	}

	public void setCote3(double cote3) {
		this.cote3 = cote3;
	}

	public double getCote4() {
		return cote4;
	}

	public void setCote4(double cote4) {
		this.cote4 = cote4;
	}
}
