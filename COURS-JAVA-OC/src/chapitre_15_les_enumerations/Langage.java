package chapitre_15_les_enumerations;

public enum Langage {

	JAVA ("Langage JAVA", "Eclipse", 125487),
	C ("Langage C", "Code Block", 45645646),
	CPlus ("Langage c++", "Visual Studio", 852 ),
	PHP ("Langage PHP", "PS Pad", 2568);
	
	private String name = "";
	private String editor = "";
	private int numSerie;
	
	Langage(String name, String editor, int numSerie) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.editor = editor;
		this.numSerie = numSerie;
	}
	
	public void getEditor () {
		System.out.println("Editeur : " + editor);
	}

	public void getNumSerie() {
		System.out.println("N° de serie : " + numSerie);
	}
	
	public void getName () {
		System.out.println(name);
	}
	
	public String toString() {
		return name;
	}
	
}
