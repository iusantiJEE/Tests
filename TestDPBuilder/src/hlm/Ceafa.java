package hlm;

import llm.Casoleta;

public abstract class Ceafa implements Produs {

	@Override
	public abstract String nume();

	@Override
	public abstract double pret();

	@Override
	public Prezentare prezentare() {
		return new Casoleta();
	}

}
