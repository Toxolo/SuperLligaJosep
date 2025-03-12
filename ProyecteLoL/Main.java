
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
        equip1.afegirJugadorTitular(jugador1);
        equip1.afegirEntrenador(entrenador1);
        equip1.imprimirAlineacio();


    }
}