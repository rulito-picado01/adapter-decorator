package adapterDecorator.ejercicio3;

import java.io.File;

public class ReporteNoSobreescrito extends Reportable {

    public ReporteNoSobreescrito(Reportar reportar) {
        super(reportar);
    }

    public void export(File file) {
        if (file == null) {
            throw new RuntimeException("El archivo no puede ser nulo");
        }
        if (file.exists()) {
            throw new RuntimeException("El archivo ya existe");

        }
        super.export(file);
    }

}
