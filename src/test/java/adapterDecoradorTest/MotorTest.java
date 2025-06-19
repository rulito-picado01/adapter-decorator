package adapterDecoradorTest;

import adapterDecorator.ejercicio1.MotorComun;
import adapterDecorator.ejercicio1.MotorEconomico;
import adapterDecorator.ejercicio1.MotorElectrico;
import adapterDecorator.ejercicio1.MotorElectricoAdapter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MotorTest {

    @Test
    public void MotorTest() {
        var motorEconomico = new MotorEconomico();
        var motorElectrico = new MotorElectricoAdapter(new MotorElectrico());
        var motorComun = new MotorComun();
        assertEquals(motorEconomico.arrancar(), "Motor arrancado");
        assertEquals(motorEconomico.acelerar(), "Motor acelerado");
        assertEquals(motorEconomico.apagar(), "Motor apagado");
        assertEquals(motorElectrico.arrancar(), "motor Electrico Conectado");
        assertEquals(motorElectrico.acelerar(), "motor Electrico Moviendose más rápido");
        assertEquals(motorElectrico.apagar(), "motor Electrico Detenido y motor Electrico Desconectado");
        assertEquals(motorComun.arrancar(), "Motor arrancado");
        assertEquals(motorComun.acelerar(), "Motor acelerado");
        assertEquals(motorComun.apagar(), "Motor apagado");
    }

}
