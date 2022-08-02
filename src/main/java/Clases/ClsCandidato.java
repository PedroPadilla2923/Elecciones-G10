package Clases;

import java.util.LinkedList;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class ClsCandidato extends ClsPersona {
    
    private String partidoPolitico;
    private String ciudadDeOrigen;
    private String descripcion;
    private String mensajeCampania;
    private LinkedList<String> propuestas;

    public ClsCandidato(String partidoPolitico, String descripcion, String numeroCedula, String nombre, String numeroCelular, String correo) {
        super(numeroCedula, nombre, numeroCelular, correo);
        this.partidoPolitico = partidoPolitico;
        this.descripcion = descripcion;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getCiudadDeOrigen() {
        return ciudadDeOrigen;
    }

    public void setCiudadDeOrigen(String ciudadDeOrigen) {
        this.ciudadDeOrigen = ciudadDeOrigen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMensajeCampania() {
        return mensajeCampania;
    }

    public void setMensajeCampania(String mensajeCampania) {
        this.mensajeCampania = mensajeCampania;
    }

    public LinkedList<String> getPropuestas() {
        return propuestas;
    }

    public void setPropuestas(LinkedList<String> propuestas) {
        this.propuestas = propuestas;
    }
    
    
    
}
