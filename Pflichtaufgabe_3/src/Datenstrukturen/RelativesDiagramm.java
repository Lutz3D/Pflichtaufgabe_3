package Datenstrukturen;

public class RelativesDiagramm extends StatistischesDiagramm{

	public RelativesDiagramm(Datensatz daten) {
		super(daten);
	}
	@Override
	public void ausgabe(){
		System.out.println(daten.titel);
		for(int i=0; i < daten.getAnzahlDateneintraege(); i++){
			System.out.println(daten.getDateneintrag(i).getDatenname()+": "+
			daten.getDateneintrag(i).getDatenwert()+" "+
			daten.dateneinheit+" ("+daten.getDateneintrag(i).relativerAnteilVon(daten.getGesamtwert())+"%)");
		}
		System.out.println("\nGesamtwert: "+ daten.getGesamtwert()+" (100%)");
	}

}
