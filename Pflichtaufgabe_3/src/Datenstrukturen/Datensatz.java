package Datenstrukturen;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Stack;


public class Datensatz {
	String titel;
	String dateneinheit;
	//private AbstractListType daten = new SinglyLinkedList();
	//ArrayList<Dateneintrag> daten = new ArrayList<Dateneintrag>();
	//ArrayList<Dateneintrag> kopie = new ArrayList<Dateneintrag>();
	
	private Node first = null;
	private Node last = null;
	
	private class Node { 
		private Node (Dateneintrag data, Node next, Node prev) {
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
		private Dateneintrag data;
		private Node next;
		private Node prev;
	}
	
	public Dateneintrag reverse() {
		Dateneintrag x = null ;
		Stack<Dateneintrag> stack = new Stack<Dateneintrag>();
		return x;
	}
	
	
	public Datensatz(String titel, String dateneinheit){
		this.titel = titel;
		this.dateneinheit = dateneinheit;
		
	}
	
	public void addFirst(Dateneintrag d) {
		first = new Node (d, first, last);

	}
	
	public void addLast(Dateneintrag d) {
		if (isEmpty()) {
			addFirst (d);
		} else {
			Node runPointer = first;
			while (runPointer.next != null) {
				runPointer = runPointer.next;
			}
			runPointer.next = new Node (d, null, last);
			
		}
		
	}
	
	public Dateneintrag getFirst() {
		if (isEmpty()) throw new NoSuchElementException ();
		return first.data;
	}
	
	public Dateneintrag getLast() {
		if (isEmpty () ) throw new NoSuchElementException();
		
		Node runPointer = first;
		while (runPointer.next != null) {
			runPointer = runPointer.next;
		}
		return runPointer.data;
	}
	
	public Dateneintrag getDateneintrag(int n) {
		if (isEmpty() ) throw new NoSuchElementException();
		int position = 0;
		Node runPointer = first;
		while (runPointer != null) {
			if (position == n) return runPointer.data;
			position++;
			runPointer = runPointer.next;
		}
		throw new NoSuchElementException();
	}
	
	public boolean isEmpty() {
		return first == null;
		
	}
	
	public int size() {
		if (isEmpty() ) return 0;
		int size = 0;
		Node runPointer = first;
		while (runPointer != null) {
			runPointer = runPointer.next;
			size++;
		}
		return size;
	}
	


	public int getMax() {
		if (isEmpty() ) throw new NoSuchElementException();
		Node runPointer = first;
		int max = 0;
		while (runPointer.next != null) {
			
			if (max < runPointer.data.getDatenwert())  
				max = runPointer.data.getDatenwert();
				runPointer = runPointer.next;	

		}
		return max;
	}
	
	public int getGesamtwert() {
		if (isEmpty() ) throw new NoSuchElementException();
		int summe = 0;
		Node runPointer = first;
		while (runPointer != null) {
			summe += runPointer.data.getDatenwert();
			runPointer = runPointer.next;
		}
		return summe;
	}
	
	public void computeForAll (ComputeInterface computer) {
		ArrayList <Dateneintrag> liste = new ArrayList<Dateneintrag>();
		Node runPointer  = first;
		
		for (int i=0; i<size();i++) {
			liste.add(runPointer.data);
			runPointer = runPointer.next;
		}
		
		for (Dateneintrag each: liste) {
			computer.compute(each);
		}

		
	}

	public void removeLast () {
		if (isEmpty() ) throw new NoSuchElementException();
		Node runPointer = first;
		while (runPointer.next.next != null) {
			runPointer = runPointer.next;
		}
		runPointer.next = null;
					
				
				
			
		
		
	}
	
} //Ende der Klasse Datensatz

	/*public void remove(Dateneintrag d) {
		if (isEmpty () ) return;

			if (first.data == null) {
				first = first.next;
			} else {
				Node runPointer = first;
	
			while (runPointer != null) {
				if (runPointer.next.data == d) {
					runPointer.next = runPointer.next.next;
				} else {
			runPointer = runPointer.next;
		}
	}
}
}*/
	


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
		
		
			public void remove(Dateneintrag d) {
		if (isEmpty () ) return;
		
		if (first.data == null) {
			first = first.next;
		} else {
			Node runPointer = first;
			
			while (runPointer != null) {
				if (runPointer.next.data == d) {
					runPointer.next = runPointer.next.next;
				} else {
					runPointer = runPointer.next;
				}
			}
		}
	}
	}*/

