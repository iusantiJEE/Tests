package hlm;

import llm.Hartie;

public abstract class Paine implements Produs{

	@Override
	public abstract String nume();
	
	@Override
	public abstract double pret();

	@Override
	public Prezentare prezentare() {
		// TODO Auto-generated method stub
		return new Hartie();
	}

}
