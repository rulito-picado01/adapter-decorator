package adapterDecorator.ejercicio4;

public class ComboFamiliar extends ComboBasico {

    public ComboFamiliar(double precioUnitario) {
        super(precioUnitario);
    }
   
    public String getDescripccion() {
        return "Combo familiar";
    }
}
