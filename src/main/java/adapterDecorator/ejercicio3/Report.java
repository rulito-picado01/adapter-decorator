package adapterDecorator.ejercicio3;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Report implements Reportar {
    private String reporte;

    public Report(String reporte) {
        this.reporte = reporte;

    }

    @Override
    public String getReporte() {
        return reporte;
    }

    @Override
    public void export(File file) {

        try (FileWriter fw = new FileWriter(file)) {
            fw.write(reporte);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al exportar el reporte", e);
        }
    }
}