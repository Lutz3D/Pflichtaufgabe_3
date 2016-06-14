package Datenstrukturen;
import java.util.ArrayList;

import list.AbstractListType;
import list.SinglyLinkedList;

public class Datensatz {
	String titel;
	String dateneinheit;
	private AbstractListType daten = new SinglyLinkedList();
	//ArrayList<Dateneintrag> daten = new ArrayList<Dateneintrag>();
	//ArrayList<Dateneintrag> kopie = new ArrayList<Dateneintrag>();
	
	
	public Datensatz(String titel, String dateneinheit){
		this.titel = titel;
		this.dateneinheit = dateneinheit;
		
	}
	
	public void add(Dateneintrag eintrag){
		daten.addFirst(eintrag);
	}
	
	public int getAnzahlDateneintraege(){
		return daten.size();
	}
	
	public Dateneintrag getDateneintrag(int n){
		return daten.getDateneintrag(n);
	}
	
	
	public int getMax (){
		return daten.getMax();
	}
	
	public int getGesamtwert() {
		int summe = 0;
		for (int i = 0; i <daten.size(); i++) {
			summe += daten.getDateneintrag(i).getDatenwert();
		}
		return summe;
	}
	/*public void DateneintragLoeschen(String string){
		kopie = (ArrayList<Dateneintrag>) daten.clone();
		for(Dateneintrag each: kopie){
			if(each.getDatenname().equals(string)){
				daten.remove(each);
			}
		}
	}*
	
	public void MinDateneintragLoeschen(int min){
		kopie = (ArrayList<Dateneintrag>) daten.clone();
		for(Dateneintrag each: kopie){
			if(each.getDatenwert() < min) {
				daten.remove(each);
			}
		}
	}

	public int getMin(){
		int n = 0;
		int kleinste = 0;
		for(Dateneintrag each: daten){
			if(each.getDatenwert() < daten.get(kleinste).getDatenwert()) kleinste = n;
			n++;
		}
		return kleinste;
	}
	
	public int getMax(){
		int n = 0;
		int groesste = 0;
		for(Dateneintrag each: daten){
			if(each.getDatenwert() > daten.get(groesste).getDatenwert()) groesste = n;
			n++;
		}
		return groesste;
	}
	
	public int getDurchschnitt(){
		return getGesamtwert()/getAnzahlDateneintraege();
	}
	
	public int getGesamtwert(){
		int gesamtwert = 0;
		for(Dateneintrag each: daten){
			gesamtwert += each.getDatenwert();
		}
		return gesamtwert;
	}
	
	public boolean istVorhanden(String suchbegriff){
		for(Dateneintrag each: daten){
			if(each.getDatenname() == suchbegriff) return true;	
		}
		return false;
	}*/
}
