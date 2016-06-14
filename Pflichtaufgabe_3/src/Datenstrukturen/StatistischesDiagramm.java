package Datenstrukturen;

public class StatistischesDiagramm {
	protected Datensatz daten;
	
	public StatistischesDiagramm(Datensatz daten){
		this.daten = daten;
	}

	public void ausgabe(){
		System.out.println(daten.titel);
		for(int i=0; i < daten.getAnzahlDateneintraege(); i++){
			System.out.println(daten.getDateneintrag(i).getDatenname()+": "+daten.getDateneintrag(i).getDatenwert()+" "+daten.dateneinheit);
		}
	}
}