package Ejercicio1;

public class AutenticacionOAuth implements ServicioAutenticacion{

    private String correo;
    private String contraseña;

    public AutenticacionOAuth (String correo, String contraseña) {
        this.correo = correo;
        this.contraseña = contraseña;
    }

    public String getcorreo() {
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo = correo;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    @Override
    public void autenticarUsuarios(String nombreUsuario, String contraseñaUsuario){
        if(getcorreo().equals(nombreUsuario) && getContraseña().equals(contraseñaUsuario)){
            System.out.println("El usuario ha sido correctamente autenticado por OAuth");
        }else{
            System.out.println("Los datos no coinciden, por favor intentelo nuevamente");
        }
    }
}