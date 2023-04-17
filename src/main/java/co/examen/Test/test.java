package co.examen.Test;

import co.examen.DAO.UsuarioDAO;
import co.examen.Entities.Usuario;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UsuarioDAO sDao = new UsuarioDAO();
		
		sDao.insert(new Usuario("prueba previo", "preuba@gmail.com"));
		
		for(Usuario s: sDao.list())
			System.out.println(s.toString());
	}

}
