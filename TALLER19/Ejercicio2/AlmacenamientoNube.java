package Ejercicio2;

public class AlmacenamientoNube implements Almacenamiento{
    public String nombre;
    public String tipoArchivo;
    public String servidorNube;

    public AlmacenamientoNube (String nombre, String tipoArchivo, String servidorNube) {
        this.nombre = nombre;
        this.servidorNube = servidorNube;
        this.tipoArchivo = tipoArchivo;
    }

    @Override
    public void guardarArchivo(String nube){
        System.out.println("El archivo "+nombre+"."+tipoArchivo+" se guardó correctamente en el servidor: "+nube+" en la nube");

    }
    @Override
    public void recuperarArchivo(String nombreArchivo, String nube){
        System.out.println("Se ha recuperado "+nombreArchivo+"."+tipoArchivo+" del servidor "+nube+" en la nube");
    }
}
