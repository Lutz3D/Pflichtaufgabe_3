package Datenstrukturen;

public class RelativesDiagramm extends StatistischesDiagramm{

	public RelativesDiagramm(Datensatz daten) {
		super(daten);
	}
	@Override
	public void ausgabe(){

		for(int i=0; i < daten.size(); i++){
			System.out.println(daten.getDateneintrag(i).getDatenname()+": "+
			daten.getDateneintrag(i).getDatenwert()+" "+
			daten.dateneinheit+" ("+daten.getDateneintrag(i).relativerAnteilVon(daten.getGesamtwert())+"%)" );
		}
		System.out.println("\nGesamtwert: "+ daten.getGesamtwert()+" (100%)");

	}

}






/*		System.out.println(daten.titel);
TotalSum ts = new TotalSum();
daten.computeForAll(ts);
System.out.println("ComputeMethode Summe" + summe);

*/