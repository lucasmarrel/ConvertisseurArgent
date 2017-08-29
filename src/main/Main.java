package main;

import modele.Conversion;
import vue.VueConvertisseurArgent;

public class Main {
	
	private static VueConvertisseurArgent fen;
	private static Conversion conversion;

	public static void main(String[] args) {
		//System.out.println("Hey");
		fen = new VueConvertisseurArgent();
		conversion = new Conversion(fen);
		fen.setVisible(true);

	}
	
	public static Conversion getConversion() {
		return conversion;
	}

}
