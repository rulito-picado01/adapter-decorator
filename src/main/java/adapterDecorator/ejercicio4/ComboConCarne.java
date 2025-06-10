package adapterDecorator.ejercicio4;

public class ComboConCarne implements Combo {

    private Combo combo;

    public ComboConCarne(Combo combo) {
        this.combo = combo;
    }

    @Override
    public String getDescripccion() {
        return combo.getDescripccion() + "con carne";
    }

    @Override
    public double getPrecio() {
        return combo.getPrecio() + 200;
    }
}
