package Datenstrukturen;

import static org.junit.Assert.*;

import org.junit.Test;

public class DatenTestUnit {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void testAddLast () {
		Datensatz verkaufszahlen = new Datensatz("Verkaufszahlen","Euro");
		verkaufszahlen.addLast(new Dateneintrag("Nord" , 300000));
		verkaufszahlen.addLast(new Dateneintrag("Süd" , 140000));
		verkaufszahlen.addLast(new Dateneintrag("West" , 900000));
		verkaufszahlen.addLast(new Dateneintrag("Ost" , 120000));
		
		assertTrue (verkaufszahlen.size() == 4);
		assertFalse (verkaufszahlen.isEmpty());
		
		
		assertEquals ("Ost", verkaufszahlen.getDateneintrag(3).getDatenname());
		assertEquals ("West", verkaufszahlen.getDateneintrag(2).getDatenname());
		assertEquals ("Süd", verkaufszahlen.getDateneintrag(1).getDatenname());
		assertEquals ("Nord", verkaufszahlen.getDateneintrag(0).getDatenname());
		
		assertTrue (verkaufszahlen.getMax() == 900000);
		assertTrue (verkaufszahlen.getGesamtwert() == 1460000);
		
		assertTrue (verkaufszahlen.getLast().getDatenname() == "Ost");
		assertTrue (verkaufszahlen.getFirst().getDatenname() == "Nord");

	}

}
