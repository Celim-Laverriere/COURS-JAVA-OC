package chapitre_13_le_pattern_strategy;

import chapitre_13_le_comportement.*;

public abstract class Personnage {

	private EspritCombatif espritCombatif = new Pacifiste();
	private Soin soin = new AucunSoin();
	private Deplacement deplacement = new Marcher ();
	
	public Personnage () {
	
	}

	public Personnage(EspritCombatif espritCombatf, Soin soin, Deplacement deplacement) {
		super();
		this.setEspritCombatf(espritCombatf);
		this.setSoin(soin);
		this.setDeplacement(deplacement);
	}

	EspritCombatif getEspritCombatf() {
		return espritCombatif;
	}

	Soin getSoin() {
		return soin;
	}

	Deplacement getDeplacement() {
		return deplacement;
	}

	void setEspritCombatf(EspritCombatif espritCombatf) {
		this.espritCombatif = espritCombatf;
	}

	void setSoin(Soin soin) {
		this.soin = soin;
	}

	void setDeplacement(Deplacement deplacement) {
		this.deplacement = deplacement;
	}
	
	public void seDeplacer () {
		 deplacement.deplacer();
	}
	
	public void combattre () {
		espritCombatif.combat();
	}
	
	public void soigner () {
		soin.soigne();
	}
	
	
	
	
}
