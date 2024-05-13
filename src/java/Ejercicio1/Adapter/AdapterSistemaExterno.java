package Ejercicio1.Adapter;

public class AdapterSistemaExterno implements SistemaExterno {
    private SistemaExternoReservas sistemaExternoReservas;

    public AdapterSistemaExterno(SistemaExternoReservas sistemaExternoReservas) {
        this.sistemaExternoReservas = sistemaExternoReservas;
    }

    @Override
    public void procesar() {
        sistemaExternoReservas.realizarReserva();
    }
}
