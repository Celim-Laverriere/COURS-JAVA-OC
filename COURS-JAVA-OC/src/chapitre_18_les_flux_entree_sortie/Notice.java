package chapitre_18_les_flux_entree_sortie;

import java.io.Serializable;

public class Notice implements Serializable{

	private String langue;

	
	public Notice() {
		super();
		this.langue = "Français";
	}

	public Notice(String langue) {
		super();
		this.langue = langue;
	}
	
	public String toString () {
		return "\n Langue de la notice : " + this.langue + "\n";
	}
	
	
}
