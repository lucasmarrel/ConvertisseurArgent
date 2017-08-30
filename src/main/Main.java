package main;

import controleur.Conversion;
import vue.VueConvertisseurArgent;

public class Main {
	
	private static VueConvertisseurArgent fen;
	private static Conversion conversion;

	public static void main(String[] args) {
		//System.out.println("Hey");
		conversion = new Conversion();
		fen = new VueConvertisseurArgent(conversion);
		fen.setVisible(true);

	}

}
