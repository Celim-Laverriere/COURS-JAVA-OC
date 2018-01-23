package chapitre_13_le_pattern_strategy;

import chapitre_13_le_comportement.Deplacement;
import chapitre_13_le_comportement.EspritCombatif;
import chapitre_13_le_comportement.Operation;
import chapitre_13_le_comportement.Soin;

public class Chirurgien extends Personnage {

	public Chirurgien() {
		super();
		this.setSoin(new Operation());
	}

	public Chirurgien(EspritCombatif espritCombatf, Soin soin, Deplacement deplacement) {
		super(espritCombatf, soin, deplacement);
		// TODO Auto-generated constructor stub
	}

	

}
