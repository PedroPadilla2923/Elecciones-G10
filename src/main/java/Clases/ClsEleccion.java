package Clases;

import java.util.LinkedList;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class ClsEleccion {
    
    private LinkedList<String> listaCandidatos;
    private LinkedList<String> listaVotantes;
    private String fechaInicio;
    private String fechaFinalizacion;
    private String estadoEleccion;
    private String ganadorEleccion;

    public ClsEleccion(LinkedList<String> listaCandidatos, LinkedList<String> listaVotantes, String fechaInicio, String fechaFinalizacion, String estadoEleccion, String ganadorEleccion) {
        this.listaCandidatos = listaCandidatos;
        this.listaVotantes = listaVotantes;
        this.fechaInicio = fechaInicio;
        this.fechaFinalizacion = fechaFinalizacion;
        this.estadoEleccion = estadoEleccion;
        this.ganadorEleccion = ganadorEleccion;
    }

    public LinkedList<String> getListaCandidatos() {
        return listaCandidatos;
    }

    public void setListaCandidatos(LinkedList<String> listaCandidatos) {
        this.listaCandidatos = listaCandidatos;
    }

    public LinkedList<String> getListaVotantes() {
        return listaVotantes;
    }

    public void setListaVotantes(LinkedList<String> listaVotantes) {
        this.listaVotantes = listaVotantes;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getFechaFinalizacion() {
        return fechaFinalizacion;
    }

    public void setFechaFinalizacion(String fechaFinalizacion) {
        this.fechaFinalizacion = fechaFinalizacion;
    }

    public String getEstadoEleccion() {
        return estadoEleccion;
    }

    public void setEstadoEleccion(String estadoEleccion) {
        this.estadoEleccion = estadoEleccion;
    }

    public String getGanadorEleccion() {
        return ganadorEleccion;
    }

    public void setGanadorEleccion(String ganadorEleccion) {
        this.ganadorEleccion = ganadorEleccion;
    }
    
    
}
