import java.util.ArrayList;

public class Soleil extends Astre implements IAffichable, IAJouterSatellite{
    /**
     * Soleil est un singleton
     */
    private static Soleil instance;

    public static ArrayList<Planet> listeDePlanet = new ArrayList<>();
    private Soleil(){
        this.nom = "Soleil";
    }
    public static Soleil getInstance()
    {
        if (instance == null) {
            instance = new Soleil();
        }
        return instance;
    }


    @Override
    public void Afficher() {

    }

    /**
     * @param astre
     */
    @Override
    public void ajouterSatellite(Astre astre) throws Exception {
        if(astre instanceof Planet){
            listeDePlanet.add((Planet) astre);
        }else{
            throw new Exception("Type de planet non correct");


        }

    }
}
