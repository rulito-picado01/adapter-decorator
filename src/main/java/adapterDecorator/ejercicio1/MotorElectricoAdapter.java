package adapterDecorator.ejercicio1;

public class MotorElectricoAdapter implements Motor{

    private final MotorElectrico motorElectrico;

    public MotorElectricoAdapter(MotorElectrico motorElectrico) {
        this.motorElectrico = motorElectrico;
    }


    @Override
    public String acelerar() {
        return motorElectrico.moverMasRapido();
    }

    @Override
    public String arrancar() {
        return motorElectrico.activar();
    }

    @Override
    public String apagar() {
        return motorElectrico.detener() + " y " + motorElectrico.desconectar();
    }
}
