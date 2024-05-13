package Ejercicio1.Observer;

public abstract class Restaurante implements ComponenteRestaurante {
    private List<Observer> observadores = new ArrayList<>();

    public void agregarObserver(Observer observer) {
        observadores.add(observer);
    }

    public void eliminarObserver(Observer observer) {
        observadores.remove(observer);
    }

    public void notificarObservers(String mensaje) {
        for (Observer observer : observadores) {
            observer.actualizar(mensaje);
        }
    }

    public abstract void servir();
}
