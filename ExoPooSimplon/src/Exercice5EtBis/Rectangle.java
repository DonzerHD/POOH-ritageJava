package Exercice5EtBis;

public class Rectangle extends Quadrilatère{
       
       public Rectangle(double cote1, double cote3) {
    	  super(cote1, cote1, cote3, cote3);
       }
     
       @Override
       public double calculperimetre() {
		return (this.cote1 + this.cote3) * 2;
	}
     }   

