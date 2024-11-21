package Ejercicio1;

public class Main {
    public static void main(String[] args) {
        ServicioAutenticacion autenticacionLocal = new AutenticacionLocal("kejisan1", "123456K");
        GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(autenticacionLocal);
        gestorAutenticacion.autenticar("kejisan1", "123456K");
    }
    
}
