package list;

import java.util.NoSuchElementException;

import org.w3c.dom.Node;

import Datenstrukturen.Dateneintrag;

public class SinglyLinkedList implements AbstractListType {
	
	private Node first = null;
	
	private class Node { //innere Klasse, nicht von auﬂen erreichbar
		private Node (Dateneintrag data, Node next) {
			this.data = data;
			this.next = next;
		}
		private Dateneintrag data;
		private Node next;
	}


	@Override
	public void addFirst(Dateneintrag d) {
		first = new Node (d, first);

	}

	@Override
	public void addLast(Dateneintrag d) {
		if (isEmpty()) {
			addFirst (d);
		} else {
			Node runPointer = first;
			while (runPointer.next != null) {
				runPointer = runPointer.next;
			}
			runPointer.next = new Node (d, null);
		}
		
	}

	@Override
	public Dateneintrag getFirst() {
		if (isEmpty()) throw new NoSuchElementException ();
		return first.data;
	}

	@Override
	public Dateneintrag getLast() {
		if (isEmpty () ) throw new NoSuchElementException();
		
		Node runPointer = first;
		while (runPointer.next != null) {
			runPointer = runPointer.next;
		}
		return runPointer.data;
	}
	
	@Override
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

	
	@Override
	public int getMax() {
		for (int i = 0; i<)
		return 0;
	}
	
	@Override
	public boolean isEmpty() {
		return first == null;
		
	}

	@Override
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


	@Override
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
	


	@Override
	public int getGesamtwert(Dateneintrag d) {
		int n = 0;
		int groesste = 0;
		for (int i = 0; i<size();i++) {
			groesste += first.next.data.getDatenwert();
		}
		/*for(Dateneintrag each: d){
			if(each.getDatenwert() > d.get(groesste).getDatenwert()) groesste = n;
			n++;
		}
		return groesste;*/
		return groesste;
	}



}
	
/*private Node first;
	
	public void addFirst (Dateneintrag d) {
		
	}
	
	public void addLast (Dateneintrag d) {
		
	}
	
	public Dateneintrag getFirst () {
		return null;
		
	}
	
	public Dateneintrag getLast () {
		return null;
		
	}
	
	public Dateneintrag getDateneintrag (int n){
		if (isEmpty() || n<0 || n >= size() ) throw new NoSuchElementException();
		
		int position = 0;
		Node runPointer = first;
		
		while (runPointer != null) {
			if (n == position) {
				return runPointer.data;
			}
			runPointer = runPointer.next;
			position++;
		}
		return null;
		
	}
	
	public Dateneintrag getMax () {
		return null;
	}
	
	public boolean isEmpty () {
		return true;
	}
	
	public int size () {
		return 0;
		
	}
	
	
	public void remove(Dateneintrag d) {
		if (isEmpty () ) return;
		
		if (first.data == 0) {
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
