package Datenstrukturen;
import java.util.Scanner;

public class App {
	private static Scanner in;

	public static void main(String[] args) {
		Datensatz verkaufszahlen = new Datensatz("Verkaufszahlen","Euro");
		verkaufszahlen.add(new Dateneintrag("Nord" , 300000));
		verkaufszahlen.add(new Dateneintrag("S�d" , 140000));
		verkaufszahlen.add(new Dateneintrag("West" , 900000));
		verkaufszahlen.add(new Dateneintrag("Ost" , 120000));
		
		RelativesDiagramm relativ = new RelativesDiagramm(verkaufszahlen);
		relativ.ausgabe();

		VisuellesDiagramm visuell = new VisuellesDiagramm(verkaufszahlen);
		JDatensatzEditor editor = new JDatensatzEditor(verkaufszahlen, visuell);
		

	}

}
