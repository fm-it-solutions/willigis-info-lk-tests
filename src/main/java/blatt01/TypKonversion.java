package blatt01;

public class TypKonversion {

	public static void main(String[] args) {
		// Das Programm gibt die Zahlen und Zeichen aus.
		int a = 14;
		double b = -21.25;
		// int und double sind beides Darstellungen von Zahlen.
		int c = (int) b; // Durch das (int) wird aus einer Zahl mit Komma eine Nichtkommazahl
		double d = (double) a; // Durch (double) wird die Zahl als Kommazahl dargestellt
		// w�rde man das int oder double weglassen w�rden die Zahlen so bleiben und sich
		// nicht ver�ndern
		System.out.println(c);
		System.out.println(d);

		char e = 'a';
		int f = 65;

		int g = (int) e; // Ein Zeichen kann durch (int) in eine Zahl verwandelt werden
		char h = (char) f; // Eine Zahl kann durch (char) in ein Zeichen verwandelt werden
		// Durch das hinzuf�gen dieser Zeilen kommt ein Fehlerhinweis
		// boolean t = true;
		// h = (char) t; Aus einem Wahrheitswert kann kein Zeichen gebildet werden, da
		// es keine Zahl ist
		System.out.println(g);
		System.out.println(h);

	}

}
