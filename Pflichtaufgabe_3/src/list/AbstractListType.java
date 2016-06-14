package list;

import Datenstrukturen.Dateneintrag;

public interface AbstractListType {
	
	public void addFirst(Dateneintrag d);
	public void addLast(Dateneintrag d);
	
	public boolean isEmpty();
	public int size();
	
	public int getGesamtwert(Dateneintrag d);
	public int getMax(Dateneintrag d);
	public Dateneintrag getFirst();
	public Dateneintrag getLast();
	public Dateneintrag get (int n);
	
	public void remove (Dateneintrag d);
	
	

}
