package Controladores;

import Clases.ClsCandidato;
import Modelos.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author Pedro Padilla Rabace
 */
public class CtlCandidato {
    
    MdlCandidato modelo;

    public CtlCandidato() {
        
        this.modelo = new MdlCandidato();
        
    }
    
    public boolean agregarCandidato(ClsCandidato candidato){
        
        boolean respuesta = this.modelo.agregarCandidato(candidato);
      
        return respuesta;
        
    }
        
    public boolean agragarCandidato(ClsCandidato candidato){
        
        return true;        
        
    }
    
    public LinkedList<ClsCandidato> ObtenerCandidato(){
        
        return this.modelo.ObtenerCandidato();
        
    }
    
}
