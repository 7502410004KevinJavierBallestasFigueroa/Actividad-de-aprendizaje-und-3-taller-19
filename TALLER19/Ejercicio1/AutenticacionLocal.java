package Ejercicio1;

public class AutenticacionLocal implements ServicioAutenticacion{

    private String nombre;
    private String contraseña;

    public AutenticacionLocal(String nombre, String contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    @Override
    public void autenticarUsuarios(String nombreUsuario, String contraseñaUsuario){
        if(getNombre().equals(nombreUsuario) && getContraseña().equals(contraseñaUsuario)){
            System.out.println("El usuario ha sido correctamente autenticado localmente");
        }else{
            System.out.println("Los datos no coinciden, por favor intentelo nuevamente");
        }
    }
}
