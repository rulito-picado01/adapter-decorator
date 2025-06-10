package adapterDecorator.ejercicio1;

public class MotorEconomico implements Motor{
    @Override
    public String acelerar() {
        return "acelerando";
    }

    @Override
    public String arrancar() {
        return "arrancando";
    }

    @Override
    public String apagar() {
        return "apagando";
    }
}
