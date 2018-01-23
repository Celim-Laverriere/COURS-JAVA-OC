package chapitre_13_le_pattern_strategy;

import chapitre_13_le_comportement.Deplacement;
import chapitre_13_le_comportement.EspritCombatif;
import chapitre_13_le_comportement.FusilSniper;
import chapitre_13_le_comportement.Soin;

public class Sniper extends Personnage {

	public Sniper() {
		super();
		this.setEspritCombatf(new FusilSniper() );
	}

	public Sniper(EspritCombatif espritCombatf, Soin soin, Deplacement deplacement) {
		super(espritCombatf, soin, deplacement);
		// TODO Auto-generated constructor stub
	}

	

}
