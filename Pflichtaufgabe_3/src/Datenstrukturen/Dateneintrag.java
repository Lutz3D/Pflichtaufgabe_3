package Datenstrukturen;
import java.lang.Math;

public class Dateneintrag {
	private int datenwert;
	private String datenname;
	
	public Dateneintrag(String datenname, int datenwert){
		this.datenwert = datenwert;
		this.datenname = datenname;
	}
	
	public void erhoeheAbsolut (int wert){
		datenwert += Math.abs(wert);
	}
	
	public void erhoeheRelativ (int aenderung){
		datenwert = datenwert*(1+(aenderung/100));
	}
	
	public int relativerAnteilVon(int gesamtWert){
		return (int)Math.round((datenwert/(double)gesamtWert)*100);
	}
	
	public void setDatenwert(int datenwert){
		this.datenwert = datenwert;
	}
	
	public void setDatenname(String datenname){
		this.datenname = datenname;
	}
	
	public int getDatenwert(){
		return datenwert;
	}
	
	public String getDatenname(){
		return datenname;
	}
}