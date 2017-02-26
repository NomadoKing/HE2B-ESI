package g43194.td03;

/**
 * Classe qui introduit la notion de moment dans la journée
 * @author G43194; Mayne Lonny
 */
public class Moment {
	
	//Attributs
	private int heure, minute, seconde;
	
	//Constructeur
	public Moment(int heure, int minute, int seconde) throws IllegalArgumentException{
		this.setHeure(heure);
		this.setMinute(minute);
		this.setSeconde(seconde);
	}
	
	public Moment(){
		this(0,0,0);
	}
	
	public boolean equals(Moment other){
		return this.getHeure() == other.getHeure()
				&& this.getMinute() == other.getMinute()
				&& this.getSeconde() == other.getSeconde();
	}
	
	// Getteurs
	public int getHeure() {
		return heure;
	}

	public int getMinute() {
		return minute;
	}

	public int getSeconde() {
		return seconde;
	}
	
	
	//Setteurs
	public void setHeure(int heure) throws IllegalArgumentException {
		if(heure>23 || heure < 0){
			throw new IllegalArgumentException("Heure Incorrecte !");
		} 
		this.heure = heure;
	}

	public void setMinute(int minute) throws IllegalArgumentException {
		if(minute>59 || minute < 0){
			throw new IllegalArgumentException("Minute Incorrecte !");
		}
		this.minute = minute;
	}

	public void setSeconde(int seconde) throws IllegalArgumentException {
		if(seconde>59 || seconde < 0){
			throw new IllegalArgumentException("Seconde Incorrecte !");
		}
		this.seconde = seconde;
	}
	
	public int toSeconds(){
		return this.heure*3600 + this.minute*60 + this.seconde;	
	}
	
	public int compareTo(Moment otherMoment){
		int valeur;
		if(this.toSeconds() > otherMoment.toSeconds()){
			valeur = 1;
		} else if (this.toSeconds() < otherMoment.toSeconds()){
			valeur = -1;
		} else {
			valeur = 0;
		}
		return valeur;
	}

	
	//ToString
	public String toString() {
		return heure + ":" + minute + ":" + seconde;
	}
	
	
}
