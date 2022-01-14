/**
 * 
 */
package hashCode;

import java.time.LocalDate;
import java.util.Objects;

public class PersonaV2 {

	private String nombre;
	private String apellidos;
	private LocalDate fechaNacimiento;

	public PersonaV2(String nombre, String apellidos, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;

		// casteamos a la clase correcta
		PersonaV2 p = (PersonaV2) obj;

		return Objects.equals(nombre, p.nombre) && Objects.equals(apellidos, p.apellidos)
				&& Objects.equals(fechaNacimiento, p.fechaNacimiento);

	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nombre, apellidos, fechaNacimiento);
	}
	

}
