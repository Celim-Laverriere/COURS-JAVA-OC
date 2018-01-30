package chapitre_16_les_collections_objets;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ObjetLinkedList {

	public static void main(String[] args) {
		
		List l = new LinkedList();
		l.add(12);
		l.add("toto");
		l.add(12.20f);
		
		
		for (int i = 0; i < l.size(); i++) {
			System.out.println("�l�ments � l'index : " + i + " = " + l.get(i));
		}

		System.out.println("\n \tParcours avec un it�rateur !");
		System.out.println("********************************************");
		
		ListIterator li = l.listIterator();
		
		while (li.hasNext()) {
			System.out.println(li.next());
		}
		
		ArrayList al = new ArrayList();
		al.add(12);
		al.add("Une cha�ne de caract�res !");
		al.add(12.20f);
		al.add('d');
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("\ndonn�e � l'indice " + i + " = " + al.get(i));
		}
		
		al.remove(1);
		al.add(1, "Element n� 2 remplac�");
		
		for (int i = 0; i < al.size(); i++) {
			System.out.println("\n " + al.get(i));
		}
		
		for (Object object : al) {
			System.out.println(al);
		}
	}

}
