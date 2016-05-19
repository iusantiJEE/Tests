package hlm;

public interface IMeniu {
	
	public void adaugaProdus(Produs produs);
	
	public double calculeazaPretTotal();
	
	public Meniu notaDePlata();
	
	public void print();
}
