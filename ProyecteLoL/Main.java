import java.util.Date;
public class Main {
    /**
     * Funcio principal que executa el programa
     *
     * @param args paràmetres d'entrada del programa
     */
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Jordi", "Cido", "cidovich", 36, Rol.JUNGLE);
        Entrenador entrenador1 = new Entrenador("Ruben", "Talora", "Taylor", 18);
        Equip equip1 = new Equip("Movistar KOI", "MKOI");
        Equip equip2 = new Equip("G2A", "G2");
        Partit partit1 = new Partit(1, equip1, equip2, new Date());
        Partit.calculaGanador(args);
        System.out.println("---------------------------------------------");
        equip1.afegirJugadorTitular(jugador1);
        equip1.afegirEntrenador(entrenador1);
        equip1.imprimirAlineacio();


    }
}