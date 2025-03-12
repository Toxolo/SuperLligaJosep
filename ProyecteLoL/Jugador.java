public class Jugador extends Participant{
    private String nom;
    private String cognom;
    private String nickname;
    private int edat;
    private Rol rol;

    public Jugador(String nom, String cognom, String nickname, int edat, Rol rol) {
        super(nom, cognom, nickname, edat);
        this.rol = rol;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }
}