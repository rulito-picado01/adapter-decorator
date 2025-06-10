package adapterDecorator.ejercicio4;

public class ComboEspecial extends ComboBasico {
    public ComboEspecial(double precioUnitario) {
        super(precioUnitario);
    }

    public String getDescripccion() {
        return "Combo Especial";
    }
}
