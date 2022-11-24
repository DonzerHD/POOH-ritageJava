package Exercice1;

import java.sql.Date;

public class Main {
   public static void main(String[] args) {
	   
	   Chronometre chrono1 = new Chronometre(45353436L);
	   chrono1.avancer(456464645414646464L);
	   chrono1.reculer(3232324545351353532L);
	   System.out.println(chrono1.getTEMP()+ "s");
	   fonction1(chrono1.getTEMP());

		    
}
   
   public static void fonction1(long chrono) {
   java.sql.Timestamp stamp = new java.sql.Timestamp(chrono);	 
   Date d = new Date(stamp.getTime());  
   System.out.println(d);
   }

  }

