package Ejercicio2;

public class AlmacenamientoLocal implements Almacenamiento{
    public String nombre;
    public String tipoArchivo;

    public AlmacenamientoLocal(String nombre, String tipoArchivo) {
        this.nombre = nombre;
        this.tipoArchivo = tipoArchivo;
    }

    @Override
    public void guardarArchivo(String rutaArchivo){
        System.out.println("El archivo "+nombre+"."+tipoArchivo+" se guardó correctamente en la ruta: "+rutaArchivo);

    }
    @Override
    public void recuperarArchivo(String nombreArchivo, String rutaArchivo){
        System.out.println("Se ha recuperado "+nombreArchivo+"."+tipoArchivo+" de la ruta "+rutaArchivo+" en su computador");
    }
}
