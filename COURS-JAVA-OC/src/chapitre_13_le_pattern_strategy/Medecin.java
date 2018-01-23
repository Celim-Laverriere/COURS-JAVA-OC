package chapitre_13_le_pattern_strategy;

import chapitre_13_le_comportement.*;

public class Medecin extends Personnage {

	public Medecin() {
		super();
		this.setSoin(new PremierSoin());
	}

	public Medecin(EspritCombatif espritCombatf, Soin soin, Deplacement deplacement) {
		super(espritCombatf, soin, deplacement);
		// TODO Auto-generated constructor stub
	}

	
}
