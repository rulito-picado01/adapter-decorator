package adapterDecorator.ejercicio4;

public class ComboBasico implements Combo {

    protected double precioUnitario;

    public ComboBasico(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    @Override
    public String getDescripccion() {
        return "Combo Basico";
    }

    @Override
    public double getPrecio() {
        return precioUnitario;
    }
}
