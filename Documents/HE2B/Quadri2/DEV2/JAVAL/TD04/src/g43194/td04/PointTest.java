package g43194.td04;

public class PointTest {

	public static void main(String[] args) {
		
		Point point1 = new Point(2,3);
		Point point2 = new Point(4,5);
		
		System.out.println("Test classe Point :");
		System.out.println("-------------------\n");
		System.out.println("Avec toString() :\n");
		System.out.println("Point1 : " + point1 + "\nPoint2 : " + point2);
		System.out.println("\nAvec getX() et getY() :\n");
		System.out.println("Point 1 : " + point1.getX() + "," + point1.getY());
		System.out.println("Point 2 : " + point2.getX() + "," + point2.getY());
		point1.move(3, 2);
		System.out.println("\nApres move() du point1 de delatX = 3 et delatY = 2\n");
		System.out.println("Point 1 : " + point1);
		point2.move(6, 3);
		System.out.println("\nApres move() du point2 de delatX = 6 et delatY = 3\n");
		System.out.println("Point 2 : " + point2);
		System.out.println("\nTest méthode distance\n");
		System.out.println("Distance entre point1 et point2 : " + point1.distance(point2));
		System.out.println("\nTest méthode middle\n");
		System.out.println("Milieu entre point1 et point2 : " + point1.middle(point2));
		
	}

}
