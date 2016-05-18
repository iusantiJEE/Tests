package main;

import hlm.MeniuBuilder;

public class Main {
	public static void main(String[] mydata){
		MeniuBuilder comanda =  new MeniuBuilder();
		comanda.meniuSmall().notaDePlata().print();;
		comanda.betivulVesel().notaDePlata().print();;
		comanda.cuDeToate().notaDePlata().print();;
	}
}
