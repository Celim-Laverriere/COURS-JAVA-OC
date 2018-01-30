package chapitre_16_les_collections_objets;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.SpringLayout.Constraints;

public class ObjetLinkedList {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		l.add(12);
		l.add("toto");
		l.add(12.20f);
		
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println("éléments à l'index : " + i + " = " + l.get(i));
		}

		System.out.println("\n \tParcours avec un itérateur !");
		System.out.println("********************************************");
		
		ListIterator li = l.listIterator();
		
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une chaîne de caractères !");
		al.add(12.20f);
		al.add('d');
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("\ndonnée à l'indice " + i + " = " + al.get(i));
		}
		
		al.remove(1);
		al.add(1, "Element n° 2 remplacé");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("\n " + al.get(i));
		}
		
		for (Object object : al) {
			System.out.println(al);
		}
		
		Hashtable ht = new Hashtable();
		ht.put(1, "printemps");
		ht.put(10, "été");
		ht.put(12, "automne");
		ht.put(45, "hiver");
		ht.put(22, "Noel");
		
		Enumeration e = ht.elements();
		
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement() + " " + ht.keys());
		}
		
		Hashtable num = new Hashtable<>();
		num.put(1, 5);
		num.put(2, 9);
		num.put(3, 6);
		num.put(4, 8);
		num.put(5, 0);
		
		System.out.println(num.contains(4) + " " + num.keys());
		
		HashSet hs = new HashSet<>();
		hs.add("toto");
		hs.add(12);
		hs.add('d');
		
		Iterator its = hs.iterator();
		
		while (its.hasNext()) {
			System.out.println(its.next());
		}
		
		System.out.println("\n\tParcours avec un tableau d'objet !");
		System.out.println("*****************************************************");
		
		Object [] obj = hs.toArray();
		for (Object object : obj) {
			System.out.println(object);
		}
		
		System.out.println(hs.contains("toto"));
	}

}
