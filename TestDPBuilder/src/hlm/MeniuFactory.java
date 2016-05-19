package hlm;

import java.util.LinkedHashMap;

import llm.CartofiPrajiti;
import llm.CeafaDePorc;
import llm.Chifla;
import llm.Pepsi;
import llm.Timisoreana;

public class MeniuFactory {

	private String _description;
	private LinkedHashMap<String,IMeniu> _configMeniuri =  new LinkedHashMap<String, IMeniu>();
	
	public MeniuFactory(){
		loadConfig();
	}
	
	public IMeniu getMeniu(String description){
		_description = description;
		return _configMeniuri.containsKey(_description) ?
				_configMeniuri.get(_description) : null;
	}
	
	private void loadConfig(){
		_description = "cuDeToate";
		Meniu  meniu  =  new Meniu(_description);
		meniu.adaugaProdus(new CeafaDePorc());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Pepsi());
		meniu.adaugaProdus(new Chifla());
		meniu.adaugaProdus(new Chifla());
		_configMeniuri.put(_description, meniu);
		
		_description = "meniuSmall";
		meniu  =  new Meniu( _description);
		meniu.adaugaProdus(new CeafaDePorc());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Pepsi());
		meniu.adaugaProdus(new Chifla());
		meniu.adaugaProdus(new Chifla());
		_configMeniuri.put(_description, meniu);
		
		_description = "betivulVesel";
		meniu  =  new Meniu( _description);
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		_configMeniuri.put(_description, meniu);
	}
}
