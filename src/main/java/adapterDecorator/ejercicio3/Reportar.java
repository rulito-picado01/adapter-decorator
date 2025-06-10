package adapterDecorator.ejercicio3;

import java.io.File;

public interface Reportar {
    public void export(File file);

    public String getReporte();
}