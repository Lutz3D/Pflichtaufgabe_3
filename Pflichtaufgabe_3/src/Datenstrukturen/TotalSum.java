package Datenstrukturen;

public class TotalSum implements ComputeInterface {
	
	private int summe = 0;

	@Override
	public void compute(Dateneintrag d) {
		summe += d.getDatenwert();
		
	}
	
	public int getDatenwert() {
		return summe;
	}

}
