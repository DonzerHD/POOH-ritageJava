package Exercice4;

public class Main {

	public static void main(String[] args) {
      Chat Felix = new Chat("Felix");
      Chien chien1 = new Chien("Snow");
      
      System.out.println(Felix.cri());
      System.out.println(Felix.toString());
      
      System.out.println(chien1.cri());
      System.out.println(chien1.aboyer());
      System.out.println(chien1.toString());
	}

}
