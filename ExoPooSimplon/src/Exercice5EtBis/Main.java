package Exercice5EtBis;

public class Main {

	public static void main(String[] args) {

		 Quadrilatère quadri1 = new Quadrilatère(12.33, 11.22, 12.33, 22.11);
		 System.out.println("Le périmètre est : " + quadri1.calculperimetre());
		 Rectangle rectangle1 = new Rectangle(15,30);

		 System.out.println("Le périmètre du rectangle est : " +rectangle1.calculperimetre());
	}

}
