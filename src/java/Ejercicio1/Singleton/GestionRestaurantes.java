package Ejercicio1.Singleton;

public class GestionRestaurantes {
    private static GestionRestaurantes instance;

    private GestionRestaurantes() {}

    public static GestionRestaurantes getInstance() {
        if (instance == null) {
            instance = new GestionRestaurantes();
        }
        return instance;
    }

    // Métodos de gestión de restaurantes
}
