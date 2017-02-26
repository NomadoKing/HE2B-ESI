package g43194.td04;

public class Point {
	
	private double x,y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
		
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	public String toString(){
		return "(" + this.x + ", " + this.y + ")";	
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void move(double deltaX, double deltaY){
		this.setX(this.x + deltaX);
		this.setY(this.y + deltaY);
	}
	
	private double calculCarreCoords(double valeur1, double valeur2){
		return (valeur1 - valeur2) * (valeur1 - valeur2);
	}
	
	public double distance (Point other){
		return Math.sqrt(this.calculCarreCoords(this.getX(), other.getX()) + this.calculCarreCoords(this.getY(), other.getY()));
	}
	
	private double moyenne(double valeur1, double valeur2){
		return (valeur1 + valeur2)/2;
	}
	
	public Point middle(Point other){
		Point retour = new Point(this.moyenne(this.getX(), other.getX()), this.moyenne(this.getY(), other.getY()));
		return retour;
	}

}
