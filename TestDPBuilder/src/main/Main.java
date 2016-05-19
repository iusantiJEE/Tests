package main;

import hlm.MeniuFactory;

public class Main {
	public static void main(String[] mydata){
		MeniuFactory comanda =  new MeniuFactory();
		comanda.getMeniu("cuDeToate").notaDePlata().print();
		comanda.getMeniu("meniuSmall").notaDePlata().print();
		comanda.getMeniu("betivulVesel").notaDePlata().print();
	}
}
