
import java.util.Scanner;

public class Operaciones {

	Scanner sc = new Scanner(System.in);

	Alumnos array[] = new Alumnos[10];
	
	String lista = "";

	public void recorrerAlumno() {

		for (int i = 0; i < array.length; i++) {
			Alumnos alu = new Alumnos();
			System.out.println("Ingrese el nombre del alumno " + (i + 1) + ": ");
			alu.setNombre(sc.next());

			System.out.println("Ingrese el apellido del alumno " + (i + 1) + ": ");
			alu.setApellido(sc.next());

			System.out.println("Ingrese la nota del alumno " + (i + 1) + ": ");
			alu.setNota(sc.nextDouble());

			array[i] = alu;
			lista += array[i] = alu;

		}

		System.out.println(lista.toString());
		Alumnos aux;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length; j++) {
				Double maximo = array[j].getNota();
				if (maximo.compareTo(array[i].getNota()) > 0) {
					aux = array[i];
					array[i] = array[j];
					array[j] = aux;
				}
			}
		}

		double mayor;
		String nombre;
		mayor = array[0].getNota();
		nombre = array[0].getNombre();
		System.out.println("La nota mayor es : "  + mayor + " y Corresponde a : " + nombre);

	}

}