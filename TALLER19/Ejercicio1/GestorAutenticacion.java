package Ejercicio1;

public class GestorAutenticacion {
    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void autenticar(String nombreUsuario, String contraseñaUsuario){
        servicioAutenticacion.autenticarUsuarios(nombreUsuario, contraseñaUsuario);
    }
}
