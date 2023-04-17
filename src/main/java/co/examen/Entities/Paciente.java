package co.examen.Entities;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuario")
@Entity
@NamedQuery(name = "Usuario.findAll", query = "SELECT s FROM Usuario s")
public class Paciente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nombre;
	private String apellido;
	private String documento;
	private String email;
	private String genero;
	private String fechaDeNacimiento;
	private String Direccion;
	private String altura;
	public Paciente(String nombre, String email) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.email = email;
		this.genero = genero;
		this.fechaDeNacimiento = fechaDeNacimiento;
		this.Direccion = Direccion;
		this.altura = altura;
		
	}
	
	
}