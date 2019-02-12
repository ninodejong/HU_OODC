package Zwem;

public class Main {

	public static void main(String[] arg) {
			Zwembad first_zwembad = new Zwembad(100,2.5,2.0);
			System.out.println(first_zwembad.berekenenInhoud());
			System.out.println(first_zwembad.toString());
	}
}
