// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws Exception {
        // IOrbiteAutour interface Méthode abstraite Orbiter(Astre astre)
        // IOrbiteAutour avoir un nouveau type et liste.Orbiter()

        // Astre class abstraite ? nom,

        // Soleil singleton ""est un"" == ""Héritage"" (Astre)

        // Terre, mars  Planette (Astre)

        // Lune Astre qui orbite autour de la terre

        Soleil sol = Soleil.getInstance();
       // Soleil sol2 = Soleil.getInstance();
        Terre terre = new Terre();
        Planet mars = new Planet("Mars");
        IOrbiteAutour jupiter = new Planet("Jupiter");
        Astre venus = new Planet("venus");
        jupiter.Orbiter(sol);

        sol.ajouterSatellite(terre);
        sol.ajouterSatellite(mars);
        sol.ajouterSatellite((Astre)jupiter);
        sol.ajouterSatellite(venus);


    }
}