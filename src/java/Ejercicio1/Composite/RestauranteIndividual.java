package Ejercicio1.Composite;

public class RestauranteIndividual implements ComponenteRestaurante {
    private Restaurante restaurante;

    public RestauranteIndividual(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    @Override
    public void servir() {
        restaurante.servir();
    }
}