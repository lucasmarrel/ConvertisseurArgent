package métier;

public class Convertion {
	
	private float montant;
	
	
	public Convertion(){
		
	}
	
	public float convertisseurEurACad(float montant){
		this.montant=montant;
		return (float) (montant/0.67);
	}
	
	public float convertisseurCadAEur(float montant){
		this.montant=montant;
		return (float) (montant*0.67);
	}
	
	public float convertisseurUsdAEur(float montant){
		this.montant=montant;
		return (float) (montant*0.84);
	}
	
	public float convertisseurEurAUsd(float montant){
		this.montant=montant;
		return (float) (montant/0.84);
	}
	
	public float convertisseurCadAUsd(float montant){
		this.montant=montant;
		return (float) (montant*0.79);
	}
	
	public float convertisseurUsqACad(float montant){
		this.montant=montant;
		return (float) (montant/0.79);
	}

}
