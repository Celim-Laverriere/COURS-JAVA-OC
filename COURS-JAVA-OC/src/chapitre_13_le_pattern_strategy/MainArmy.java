package chapitre_13_le_pattern_strategy;

import chapitre_13_le_comportement.CombatCouteau;
import chapitre_13_le_comportement.Operation;

public class MainArmy {

	public static void main(String[] args) {
		
		Personnage [] tPers = {new Guerrier(), new Chirurgien(), new Sniper(), new Civil(), new Medecin()};
		
		for (int i = 0; i < tPers.length; i++) {
			System.out.println("\n Instance de " + tPers[i].getClass().getName());
			
			System.out.println("\n**************************************************");
			
			tPers[i].combattre();
			tPers[i].seDeplacer();
			tPers[i].soigner();
		}
		
		System.out.println("\n*******************************************************");
		Personnage pers = new Guerrier();
		pers.setEspritCombatf(new CombatCouteau());
		pers.combattre();
		pers.soigner();
		pers.setSoin(new Operation());
		pers.soigner();
	}

}
