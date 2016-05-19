package hlm;

import java.util.ArrayList;
import java.util.List;

public class Meniu implements IMeniu{
	private List<Produs> _produse = new ArrayList<Produs>();
	private double _total = 0;
	private StringBuilder _sb =  new StringBuilder();
	private String _description;
	
	public Meniu(String description){
		_description =  description;
	}

	@Override
	public void adaugaProdus(Produs produs){
		_produse.add(produs);
	}
	
	@Override
	public double calculeazaPretTotal(){
		_produse.forEach(produs->{
			_total += produs.pret();
		});
		return _total;
	}
	
	@Override
	public Meniu notaDePlata(){
		_sb.setLength(0);
		_sb.append(_description).append("\n");
		for(Produs produs : _produse){
			_sb.append("Nume: " + produs.nume()).append("\t");
			_sb.append("Pret: " + produs.pret()).append("\t");
			_sb.append("Prezentare: " + produs.prezentare().impachetare()).append("\t"); 
			_sb.append("\n");
		}
		_sb.append("TOTAL: " + calculeazaPretTotal() + " RON").append("\n\n");
		return this;
	}
	
	@Override
	public void print(){
		System.out.println(_sb.toString());
	}
	
}
