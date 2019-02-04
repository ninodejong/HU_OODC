package les1;

public class Voorbeeld_3 {
    public static void main(String[] args) {
        String titel = "Programeren in Java";
        String tekst1 = "Ik leer nu ";
        String tekst2 = "  Vandaag hebben we veel geleerd. ";

        System.out.println(titel.toUpperCase());
        System.out.println("");
        System.out.println(tekst1 + titel + "!");
        tekst2 = tekst2.trim();
        System.out.println(tekst2);
        System.out.println("");

        System.out.println("'we' staat vannaf positie: "+ tekst2.indexOf("we"));
    }
}
