package adapterDecorator.ejercicio4;

public class ComboConPapas implements Combo {

    private Combo combo;

    public ComboConPapas(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripccion() {
        return combo.getDescripccion() + "con papas";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + 100;
    }
}
