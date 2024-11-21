package Ejercicio3;

public class GestorReportes {
    public GeneradorReporte reporte;

    public GestorReportes(GeneradorReporte reporte) {
        this.reporte = reporte;
    }

    public void gestorReporte(){
        reporte.generarReporte();
    }
    
}
