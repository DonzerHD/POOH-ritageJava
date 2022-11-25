package Exercice4;

public  class Animal {
	protected String nomAnimal;
	
	public Animal(final String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}
	
	public String cri() {
		return "L'animal cri";
	}
	
	public String toString() {
		return "C'est un animal";
	}

	public String getNomAnimal() {
		return nomAnimal;
	}

	public void setNomAnimal(String nomAnimal) {
		this.nomAnimal = nomAnimal;
	}


}
