package modele;

import vue.VueConvertisseurArgent;

public class Conversion {
	
	private float montant;
	private VueConvertisseurArgent vue;
	private final float TAUX_CAD_VERS_EUR = (float) 0.67;
	private final float TAUX_CAD_VERS_USD = (float) 0.79;
	private final float TAUX_USD_VERS_EUR = (float) 0.84;
	private int devise1;
	private int devise2;
	
	
	
	
	public Conversion(VueConvertisseurArgent vue){
		this.vue=vue;
	}
	
	
	public void conversionDevise() {
		try
		{			
			devise1 = vue.getDevise1();
			devise2 = vue.getDevise2();
			montant = vue.getMontant();
		
			if (devise1==devise2){
				vue.setLabelText(String.valueOf(montant));
			}
			else if (devise1==0 && devise2==1){
				vue.setLabelText(String.valueOf(montant/TAUX_CAD_VERS_EUR));
			}
			else if (devise1==0 && devise2==2){
				vue.setLabelText(String.valueOf(montant/TAUX_USD_VERS_EUR));
			}
			else if (devise1==1 && devise2==0){
				vue.setLabelText(String.valueOf(montant*TAUX_CAD_VERS_EUR));
			}
			else if (devise1==1 && devise2==2){
				vue.setLabelText(String.valueOf(montant*TAUX_CAD_VERS_USD));
			}
			else if (devise1==2 && devise2==0){
				vue.setLabelText(String.valueOf(montant*TAUX_USD_VERS_EUR));
			}
			else if (devise1==2 && devise2==0){
				vue.setLabelText(String.valueOf(montant/TAUX_CAD_VERS_USD));
			}
		} catch (Exception ex){
			vue.setLabelErreur("Le montant entré est incorrect");
		}
	}

}
