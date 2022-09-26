
public class Alumnos {
	
	// Attributes
	 String nombre;
	 String apellido;
	 Double nota;
	
	
	
	
	//Mutates
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public String toString() {
		return "Informacion del Alumno [nombre=" + nombre + ", apellido=" + apellido + ", nota=" + nota + "]\n\n";
	}
	
	public String notasString() {
		return "Alumnos [nombre=" + nombre + ", nota mas alta=" +  nota + "]\n\n";
	}
	

}
