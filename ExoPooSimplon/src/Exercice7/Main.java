package Exercice7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<Utilisateur> listUtilisateur = new ArrayList<>();

		listUtilisateur.add(
				new Utilisateur("Thomas", "Lemay", "29/10/2000", "thomas.lemay59@outlook.fr", "DonzerHD", "Simplon59"));
		listUtilisateur
				.add(new Utilisateur("Kevin", "Dupont", "22/10/1994", "Kevindu59@gmail.com", "Kevin59", "Denain59220"));

		System.out.print("Login :");
		String loginInput = sc.nextLine();
		System.out.print("Mot de passe :");
		String mdpInput = sc.nextLine();
		sc.close();

		for (int i = 0; i < listUtilisateur.size(); i++) {
			if (listUtilisateur.get(i).getLogin().equals(loginInput)
					&& listUtilisateur.get(i).getMdp().equals(mdpInput)) {
				System.out.println("Vous êtes connecté.");
				break;
			} else {
				if (i == listUtilisateur.size() - 1) {
					System.out.println("Vous n'êtes pas connecté.");
				}
			}
		}
		
		StringBuilder stringBuilder = new StringBuilder();
		
		for (int i = 0; i < listUtilisateur.size(); i++) {
		stringBuilder.append(listUtilisateur.get(i).getLogin()).append(",").append(listUtilisateur.get(i).getMdp()).append("\n");
		}
		try(FileWriter writer = new FileWriter("C:\\Users\\ApprenDesktop\\Java exo\\JavaExoPooHeritage\\POOH-ritageJava\\ExoPooSimplon\\data.csv")){
			writer.write("Login" + "," + "Mot de passe\n");
			writer.write(stringBuilder.toString());	
			System.out.println("CSV file created...");
		}catch (IOException e) {
			System.out.println("Erreur fichier");
			e.printStackTrace();
		}
	}
}
