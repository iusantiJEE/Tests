package hlm;

import llm.CartofiPrajiti;
import llm.CeafaDePorc;
import llm.Chifla;
import llm.Pepsi;
import llm.Timisoreana;

public class MeniuBuilder {
	public Meniu meniuSmall(){
		String methodName = "[" + new Object(){}.getClass().getEnclosingMethod().getName()+"]:";
		Meniu  meniu  =  new Meniu( methodName);
		meniu.adaugaProdus(new CeafaDePorc());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Pepsi());
		meniu.adaugaProdus(new Chifla());
		meniu.adaugaProdus(new Chifla());
		return meniu;
	}
	
	public Meniu cuDeToate(){
		String methodName = "[" + new Object(){}.getClass().getEnclosingMethod().getName()+"]:";
		Meniu  meniu  =  new Meniu(methodName);
		meniu.adaugaProdus(new CeafaDePorc());
		meniu.adaugaProdus(new CeafaDePorc());
		meniu.adaugaProdus(new CeafaDePorc());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new CartofiPrajiti());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Chifla());
		meniu.adaugaProdus(new Chifla());
		return meniu;
	}
	
	public Meniu betivulVesel(){
		String methodName = "[" + new Object(){}.getClass().getEnclosingMethod().getName()+"]:";
		Meniu  meniu  =  new Meniu(methodName);
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		meniu.adaugaProdus(new Timisoreana());
		return meniu;
	}
}
