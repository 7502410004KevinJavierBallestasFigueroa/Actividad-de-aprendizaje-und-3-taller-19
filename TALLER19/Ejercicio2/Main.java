package Ejercicio2;

public class Main {
    public static void main(String[] args) {
        Almacenamiento almacenarLocal = new AlmacenamientoLocal("Taller19", "java");
        Almacenamiento almacenarNube = new AlmacenamientoNube("Taller18", "java", "Cloudfare");
        GestorArchivos gestorArchivos = new GestorArchivos(almacenarLocal);
        GestorArchivos gestorArchivos2 = new GestorArchivos(almacenarNube);

        
        gestorArchivos.almacenar("Escritorio/talleres/taller19");
        gestorArchivos.recuperar("Taller19", "Escritorio/talleres/taller19");
        gestorArchivos2.almacenar("Cloudfare");
        gestorArchivos2.recuperar("Taller18", "Cloudfare");
    }
}
