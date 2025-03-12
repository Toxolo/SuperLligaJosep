import java.util.Date;
import java.util.Random;

public class Partit {
    int id;
    Equip equipBlau;
    Equip equipRoig;
    Equip guanyador;
    Date hora;
    Jugador mvp;
}

public static void main(String[] args) {
    int min = 40000;  // Límite inferior
    int max = 90000;  // Límite superior        
    Random random = new Random();
    int numeroAleatorio = random.nextInt(max - min + 1) + min;
    int numeroAleatorio2 = random.nextInt(max - min + 1) + min;
    int EquipBlau = numeroAleatorio;
    int EquipRoig = numeroAleatorio2;
    int Diferencia;
    int posibilita = 50;
    if (EquipBlau > EquipRoig){
        Diferencia = (EquipBlau - EquipRoig)/1000;
        int blau = posibilita+Diferencia;
        int roig = posibilita-Diferencia;
        System.out.println("El equip blau te un "+ (blau)+"%");
        System.out.println("El equip roig te un "+ (roig)+"%");
        guanyador( blau, roig);
    }
    else if (EquipBlau < EquipRoig){
        Diferencia = (EquipRoig - EquipBlau)/1000;
        int blau = posibilita+Diferencia;
        int roig = posibilita-Diferencia;
        System.out.println("El equip blau te un "+ (blau)+"%");
        System.out.println("El equip roig te un "+ (roig)+"%");
        guanyador( blau, roig);
    }
    else {
        int blau = 50;
        int roig = 50;
        System.out.println("El equip blau te un "+ (posibilita)+"%");
        System.out.println("El equip roig te un "+ (posibilita)+"%");
        guanyador( blau, roig);
    }
    
}
public static void guanyador( int blau, int roig) {
    int min = 1;  // Límite inferior
    int max = 100;  // Límite superior  
    Random random = new Random();      
    int guanyadorf = random.nextInt(max - min + 1) + min;
    if (0<=guanyadorf && guanyadorf<=blau){
        System.out.println("Ha guanyat el equip Blau");
    }
    else {
        System.out.println("Ha guanyat el equip Roig");
    }
}