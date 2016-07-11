package Datenstrukturen;

public class DoubleAllValues implements ComputeInterface {

	private int summe;
	@Override
	public void compute(Dateneintrag d) {
		summe = d.getDatenwert()*2;
		d.setDatenwert(summe);
		
	}

	public int getDatenwert() {
		return summe;
	}

}
