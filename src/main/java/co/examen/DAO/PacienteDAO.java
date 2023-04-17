package co.examen.DAO;

import co.examen.Entities.Paciente;
import co.examen.Utils.Conexion;

public class PacienteDAO extends Conexion<Paciente> implements GenericDAO <Paciente> {
	public PacienteDAO() {
		super(Paciente.class);
	}
}
