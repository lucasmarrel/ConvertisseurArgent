package modele;

public class Conversion {
	
	private float montant;
	private final float TAUX_CAD_VERS_EUR = (float) 0.67;
	private final float TAUX_CAD_VERS_USD = (float) 0.79;
	private final float TAUX_USD_VERS_EUR = (float) 0.84;
	
	
	public Conversion(){
	}
	
	public float convertisseurEurACad(float montant){
		this.montant=montant;
		return (float) (montant/TAUX_CAD_VERS_EUR);
	}
	
	public float convertisseurCadAEur(float montant){
		this.montant=montant;
		return (float) (montant*TAUX_CAD_VERS_EUR);
	}
	
	public float convertisseurUsdAEur(float montant){
		this.montant=montant;
		return (float) (montant*TAUX_USD_VERS_EUR);
	}
	
	public float convertisseurEurAUsd(float montant){
		this.montant=montant;
		return (float) (montant/TAUX_USD_VERS_EUR);
	}
	
	public float convertisseurCadAUsd(float montant){
		this.montant=montant;
		return (float) (montant*TAUX_CAD_VERS_USD);
	}
	
	public float convertisseurUsdACad(float montant){
		this.montant=montant;
		return (float) (montant/TAUX_CAD_VERS_USD);
	}

}
