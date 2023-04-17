package co.examen.Test;

import co.examen.DAO.PacienteDAO;
import co.examen.Entities.Paciente;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PacienteDAO sDao = new PacienteDAO();
		
		sDao.insert(new Paciente("prueba previo", "preuba@gmail.com"));
		
		for(Paciente s: sDao.list())
			System.out.println(s.toString());
	}

}
