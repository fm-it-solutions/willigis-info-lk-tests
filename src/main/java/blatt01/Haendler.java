package blatt01;

public class Haendler {

	public static void main(String[] args) {
		int a = 5; // Preis für normale SD-Karten
		int b = 8; // Preis für MiniSD-Karten
		int c = 12; // Preis für MicroSD-Karten
		int d = 9; // Menge an normalen SD-Karten
		int e = 5; // Menge an MiniSD-Karten
		int f = 0; // Menge an MicroSD-Karten
		double g = a * d + b * e + c * f; // Preis für alle SD-Karten
		System.out.println("Der Preis für...\r\n" + d + " normale SD-Karten\r\n" + e + " MiniSD-Karten\r\n" + f
				+ " MicroSD-Karten\r\n...lautet " + g + " €");

	}

}
