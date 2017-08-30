package modele;

public class MontantArgent {
	
	private float montant;
	private int devise;
	private int deviseConversion;
	private float montantConverti;
	
	public MontantArgent() {
		
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}

	public float getMontantConverti() {
		return montantConverti;
	}

	public void setMontantConverti(float montantConverti) {
		this.montantConverti = montantConverti;
	}

	public int getDevise() {
		return devise;
	}

	public void setDevise(int devise) {
		this.devise = devise;
	}

	public int getDeviseConversion() {
		return deviseConversion;
	}

	public void setDeviseConversion(int deviseConversion) {
		this.deviseConversion = deviseConversion;
	}

	@Override
	public String toString() {
		return "MontantArgent [montant=" + montant + ", devise=" + devise + ", deviseConversion=" + deviseConversion
				+ ", montantConverti=" + montantConverti + "]";
	}

	
	
}
