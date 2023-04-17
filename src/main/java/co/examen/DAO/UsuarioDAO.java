package co.examen.DAO;

import co.examen.Entities.Usuario;
import co.examen.Utils.Conexion;

public class UsuarioDAO extends Conexion<Usuario> implements GenericDAO <Usuario> {
	public UsuarioDAO() {
		super(Usuario.class);
	}
}
