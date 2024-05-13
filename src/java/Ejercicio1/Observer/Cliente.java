package Ejercicio1.Observer;

public class Cliente implements Observer {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println(nombre + " ha recibido el mensaje: " + mensaje);
    }
}
