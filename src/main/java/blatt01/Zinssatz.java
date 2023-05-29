package blatt01;

public class Zinssatz {

	public static void main(String[] args) {
		double a = 1220.0;
		double b = 2.25;
		double c = a * b / 100;
		double d = a + c;
		System.out.println("Altes Kapital: " + a + " €" + "\n" + "Zinssatz: " + b + " %" + "\n\n" + "Zinsen: " + c
				+ " �" + "\n" + "Neues Kapital: " + d + " €");
	}

}
