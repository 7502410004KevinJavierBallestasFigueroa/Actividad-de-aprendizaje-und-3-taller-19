package Ejercicio3;

public class ReportePDF implements GeneradorReporte {
    public String nombreArchivo;
    public String tipoArchivo;
    public String pesoArchivo;

    public ReportePDF (String nombreArchivo, String tipoArchivo, String pesoArchivo) {
        this.nombreArchivo = nombreArchivo;
        this.tipoArchivo = tipoArchivo;
        this.pesoArchivo = pesoArchivo;
    }

    @Override
    public void generarReporte() {
        System.out.println("Reporte del formato PDF");
        System.out.println("Nombre del archivo: "+nombreArchivo);
        System.out.println("Tipo del archivo: "+tipoArchivo);
        System.out.println("Peso del archivo: "+pesoArchivo+" mb");
        System.out.println("La extensión del archivo es .PDF");
    }
}
