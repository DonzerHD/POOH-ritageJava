package Exercice2;

/**
 * Permet de créer des utilisateurs.
 * 
 * @author Thomas.l
 *
 */
public class Utilisateur {
	private String nom, prenom, dateN, email, login, mdp;

	/**
	 * @param nom    Nom de la personne
	 * @param prenom Prénom de la personne
	 * @param dateN  Date de naissance
	 * @param email  Adresse mail
	 * @param login  Pseudonyme
	 * @param mdp    Mot de passe
	 */
	public Utilisateur(String nom, String prenom, String dateN, String email, String login, String mdp) {
		this.nom = nom;
		this.prenom = prenom;
		this.dateN = dateN;
		this.email = email;
		this.login = login;
		this.mdp = mdp;

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateN() {
		return dateN;
	}

	public void setDateN(String dateN) {
		this.dateN = dateN;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

}
