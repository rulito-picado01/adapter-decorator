package adapterDecoradorTest;

import adapterDecorator.ejercicio3.Report;
import adapterDecorator.ejercicio3.ReporteNoSobreescrito;
import adapterDecorator.ejercicio3.ReporteSobreEscribible;
import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class ReportTest {

    @Test
    public void ReportTest() {
        Report report = new Report("reporte viejo");
        ReporteSobreEscribible rSobreEscribible = new ReporteSobreEscribible(report);
        ReporteNoSobreescrito rNoSobreEscribible = new ReporteNoSobreescrito(report);
        File f = new File("/home/jose/Escritorio/reporte.txt");

        rSobreEscribible.export(f);
        report = new Report("reporte nuevo");

        assertThrows(
                RuntimeException.class,
                () -> rNoSobreEscribible.export(f));
        System.out.println(rNoSobreEscribible.getReporte());
        rSobreEscribible.export(f);
        System.out.println(rSobreEscribible.getReporte());
    }

}
