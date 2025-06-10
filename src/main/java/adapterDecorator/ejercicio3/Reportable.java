package adapterDecorator.ejercicio3;

import java.io.File;

public class Reportable implements Reportar {

    private Reportar reportar;

    public Reportable(Reportar reportar) {
        this.reportar = reportar;
    }

    @Override
    public String getReporte() {
        return reportar.getReporte();
    }

    @Override
    public void export(File file) {
        reportar.export(file);
    }
}
