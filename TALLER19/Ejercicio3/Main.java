package Ejercicio3;

public class Main {
    public static void main(String[] args) {
        GeneradorReporte reportepdf = new ReportePDF("Factura", "Confidencial", "15");
        GestorReportes reporteFactura = new GestorReportes(reportepdf);
        reporteFactura.gestorReporte();
    }
    
}
