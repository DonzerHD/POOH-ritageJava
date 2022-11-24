package Exercice2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Utilisateur> listUtilisateur = new ArrayList<>();
		
		listUtilisateur.add(new Utilisateur("Thomas", "Lemay","29/10/2000" , 
				           "thomas.lemay59@outlook.fr", "DonzerHD","Simplon59"));
		listUtilisateur.add(new Utilisateur("Kevin", "Dupont","22/10/1994" , 
		           "Kevindu59@gmail.com", "Kevin59","Denain59220"));

		System.out.print("Login :");
		String loginInput = sc.nextLine();
		System.out.print("Mot de passe :");
		String mdpInput = sc.nextLine();
		sc.close();
		
		for(int i = 0 ; i < listUtilisateur.size(); i++) {
			if(listUtilisateur.get(i).getLogin().equals(loginInput) && listUtilisateur.get(i).getMdp().equals(mdpInput)){
				System.out.println("Vous êtes connecté.");
				break;
			}else {
				if( i == listUtilisateur.size() - 1) {
					 System.out.println("Vous n'êtes pas connecté.");
				}
			}
		}	
	}
}
