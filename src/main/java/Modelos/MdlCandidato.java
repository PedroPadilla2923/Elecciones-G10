package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 * *
 * @author Pedro Padilla Rabace
 */
public class MdlCandidato {

    ClsJdbc jdbc;

    public MdlCandidato() {
        this.jdbc = new ClsJdbc();
        this.jdbc.CrearConexion();
    }

    public boolean agregarCandidato(ClsCandidato candidato) {

        return true;

    }

    public LinkedList<ClsCandidato> ObtenerCandidato() {

        try {

            LinkedList<ClsCandidato> listaCandidatos = new LinkedList<>();

            String sql = "SELECT * FROM tbl_candidatos";
            PreparedStatement sentencia = this.jdbc.conexion.prepareStatement(sql);
            ResultSet resultados = sentencia.executeQuery();

            while (resultados.next()) {
                String partidoPolitico = resultados.getNString("partido_politico");
                String descripcion = resultados.getNString("descripcion");
                String numeroCedula = resultados.getNString("id_candidato");
                String nombre = resultados.getNString("nombre");
                String numeroCelular = resultados.getNString("numero_celular");
                String correo = resultados.getNString("correo");

                ClsCandidato candidato = new ClsCandidato(partidoPolitico, descripcion, numeroCedula, nombre, numeroCelular, correo);

                listaCandidatos.add(candidato);

            }

            return listaCandidatos;

        } catch (Exception error) {

            System.out.println("Uy Ocurrio un Error: " + error.getMessage());
            return null;

        }

    }

}
