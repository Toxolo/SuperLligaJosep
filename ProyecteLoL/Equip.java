import java.util.ArrayList;
import java.util.List;

public class Equip {
    private String nom;
    private List<Jugador> titulars = new ArrayList<Jugador>();
    private List<Jugador> reserves = new ArrayList<Jugador>();
    private Entrenador entrenador;
    private String tag;

    public Equip(String nom, String tag) {
        this.nom = nom;
        this.tag = tag;
    }

    public void imprimirAlineacio() {
        System.out.println(String.format("%1$25s %2$10s","NOM", "POSICIO"));
        System.out.println("-----------------------------------");
        for (Jugador jugador: titulars) {
            System.out.println(String.format("%1$25s %2$10s", jugador.getCompletePlayerName(), jugador.getRol()));
        }
        System.out.println("-----------------------------------");
        System.out.printf("%1$25s %2$10s", entrenador.getCompletePlayerName(), "ENTRENADOR");

    }

    public void afegirJugadorTitular(Jugador jugador) {
        titulars.add(jugador);
    }

    public void afegirJugadorSuplent(Jugador jugador) {
        reserves.add(jugador);
    }

    public void afegirEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public String getNom() {
        return nom;
    }

    public List getTitulars() {
        return titulars;
    }

    public List getReserves() {
        return reserves;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public String getTag() {
        return tag;
    }
}
