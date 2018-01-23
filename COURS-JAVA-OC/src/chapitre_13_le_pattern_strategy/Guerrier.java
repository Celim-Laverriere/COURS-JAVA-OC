package chapitre_13_le_pattern_strategy;

import chapitre_13_le_comportement.*;

public class Guerrier extends Personnage {

	public Guerrier () {
		this.setEspritCombatf(new CombatPistolet());
	}

	public Guerrier(EspritCombatif espritCombatf, Soin soin, Deplacement deplacement) {
		super(espritCombatf, soin, deplacement);
		
	}

	
}
