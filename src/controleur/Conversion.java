package controleur;

import modele.MontantArgent;
import vue.VueConvertisseurArgent;

public class Conversion {
	
	
	private final float TAUX_CAD_VERS_EUR = (float) 0.67;
	private final float TAUX_CAD_VERS_USD = (float) 0.79;
	private final float TAUX_USD_VERS_EUR = (float) 0.84;
	private MontantArgent montant;
	private float valeurMontant;
	
	public Conversion() {
		
	}
	
	
	public void conversionDevise(MontantArgent montant) {
		
		this.montant = montant;
		valeurMontant= montant.getMontant();
		
	
		if (montant.getDevise()==montant.getDeviseConversion()){
			montant.setMontantConverti(valeurMontant);
		}
		else if (montant.getDevise()==0 && montant.getDeviseConversion()==1){
			montant.setMontantConverti(valeurMontant/TAUX_CAD_VERS_EUR);
		}
		else if (montant.getDevise()==0 && montant.getDeviseConversion()==2){
			montant.setMontantConverti(valeurMontant/TAUX_USD_VERS_EUR);
		}
		else if (montant.getDevise()==1 && montant.getDeviseConversion()==0){
			montant.setMontantConverti(valeurMontant*TAUX_CAD_VERS_EUR);
		}
		else if (montant.getDevise()==1 && montant.getDeviseConversion()==2){
			montant.setMontantConverti(valeurMontant*TAUX_CAD_VERS_USD);
		}
		else if (montant.getDevise()==2 && montant.getDeviseConversion()==0){
			montant.setMontantConverti(valeurMontant*TAUX_USD_VERS_EUR);
		}
		else if (montant.getDevise()==2 && montant.getDeviseConversion()==0){
			montant.setMontantConverti(valeurMontant/TAUX_CAD_VERS_USD);
		}
	}

}
