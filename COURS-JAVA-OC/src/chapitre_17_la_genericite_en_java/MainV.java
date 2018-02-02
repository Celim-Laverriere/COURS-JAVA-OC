package chapitre_17_la_genericite_en_java;

import java.util.ArrayList;

public class MainV {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Voiture> listeVoiture = new ArrayList<Voiture>();
		listeVoiture.add(new Voiture());
		listeVoiture.add(new Voiture());
		
		ArrayList<Object> listeVoitureSP = new ArrayList<Object>();
		listeVoitureSP.add(new Object());
		listeVoitureSP.add(new Object());
		
//		listeVoiture = VoitureSansPermis;
		
//		ArrayList<? extends Voiture> listVoitureSP = new ArrayList<VoitureSansPermis>(); 
		
		afficher(listeVoitureSP);
		afficher(listeVoiture);
		
		ArrayList<Voiture> listVoiture = new ArrayList<Voiture>();
		listVoiture.add(new Voiture());
		
		ArrayList<VoitureSansPermis> listVoitureSP = new ArrayList<VoitureSansPermis>(); 
		listVoitureSP.add(new VoitureSansPermis());
		
		GarageG garage = new GarageG();
		garage.add(listVoiture);
		System.out.println("-------------------------------------");
		garage.add(listVoitureSP);
	}
	
	static void afficher (ArrayList<? super Voiture> list) {
		for (Object voiture : list) {
			System.out.println(voiture.toString());
		}
	}
}
