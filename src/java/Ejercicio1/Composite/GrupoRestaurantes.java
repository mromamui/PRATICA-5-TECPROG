package Ejercicio1.Composite;

public class GrupoRestaurantes implements ComponenteRestaurante {
    private List<ComponenteRestaurante> componentes = new ArrayList<>();

    public void agregar(ComponenteRestaurante componente) {
        componentes.add(componente);
    }

    public void eliminar(ComponenteRestaurante componente) {
        componentes.remove(componente);
    }

    @Override
    public void servir() {
        for (ComponenteRestaurante componente : componentes) {
            componente.servir();
        }
    }
}