package chapitre_18_les_flux_entree_sortie;

public class MainGateau {

	public static void main(String[] args) {
	
		Patiserie pat = new CoucheChocolat(
							new CoucheCaramel(
								new CoucheBiscuit(
									new CoucheChocolat(
										new Gateau()))));

		System.out.println(pat.preparer());
	}

}
