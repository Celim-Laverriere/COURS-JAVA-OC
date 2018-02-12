package chapitre_18_les_flux_entree_sortie;

public abstract class Couche extends Patiserie{

	protected Patiserie pat;
	protected String nom;
	
	public Couche(Patiserie p) {
		super();
		this.pat = p;
	}
	
	@Override
	public String preparer() {
		String str = pat.preparer();
		return str + nom;
	}
	
}
