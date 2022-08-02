package Clases;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class ClsPersona {
    
    private String numeroCedula;
    private String nombre;
    private String numeroCelular;
    private String correo;

    public ClsPersona(String numeroCedula, String nombre, String numeroCelular, String correo) {
        this.numeroCedula = numeroCedula;
        this.nombre = nombre;
        this.numeroCelular = numeroCelular;
        this.correo = correo;
    }

    public String getNumeroCedula() {
        return numeroCedula;
    }

    public void setNumeroCedula(String numeroCedula) {
        this.numeroCedula = numeroCedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroCelular() {
        return numeroCelular;
    }

    public void setNumeroCelular(String numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
}
