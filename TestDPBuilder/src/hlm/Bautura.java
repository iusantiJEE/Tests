package hlm;

import llm.Sticla;

public  abstract class Bautura implements Produs{

	@Override
	public Prezentare prezentare() {
		// TODO Auto-generated method stub
		return new Sticla();
	}

	@Override
	public abstract String nume();

	@Override
	public abstract double pret();


	
}
