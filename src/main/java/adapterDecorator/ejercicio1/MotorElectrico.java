package adapterDecorator.ejercicio1;

public class MotorElectrico {
    public String conectar() {
        return "motor Electrico Conectado";
    }

    public String desconectar() {
        return "motor Electrico Desconectado";
    }

    public String activar() {
        return "motor Electrico Activado";
    }

    public String detener() {
        return "motor Electrico Detenido";
    }

    public String moverMasRapido() {
        return "motor Electrico Moviendose más rápido";
    }
}
