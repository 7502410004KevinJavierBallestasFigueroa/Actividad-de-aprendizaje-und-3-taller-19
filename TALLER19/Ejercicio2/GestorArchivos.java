package Ejercicio2;

public class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void almacenar(String lugarArchivo){
        almacenamiento.guardarArchivo(lugarArchivo);
    }
    public void recuperar(String nombre, String lugarArchivo){
        almacenamiento.recuperarArchivo(nombre, lugarArchivo);
    }
    
}
