package list;

import java.util.NoSuchElementException;

import Datenstrukturen.Dateneintrag;

public class SinglyLinkedList {
	
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
			if n == position) {
				return runPointer;
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
	
	

}
