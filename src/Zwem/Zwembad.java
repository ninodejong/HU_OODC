package Zwem;

public class Zwembad {
    private double lengte;
    private double breedte;
    private double diepte;

    public Zwembad(double len,double bred,double diep){
        lengte = len;
        breedte = bred;
        diepte = diep;
    }

    public String berekenenInhoud() {
        double result = lengte * breedte * diepte;
        String template = "BEREKENEDE INHOUD: ";
        return template +  result;
    }

    public String toString() {
        String result = "GEGEVENS ZWEMBAD: Dit zwembad is "+ breedte +" meter breed, "+ lengte +" meter lang, en "+ diepte +" meter diep";
        return result;
    }
}