
import java.util.Scanner;

public class Operaciones {

	Scanner sc = new Scanner(System.in);

	Alumnos array[] = new Alumnos[10];
	Alumnos alu = new Alumnos();
	String lista = "";

	public void recorrerAlumno() {

		for (int i = 0; i < array.length; i++) {

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

		double mayor, menor;
		mayor = menor = array[0].getNota();

		for (int i = 0; i < array.length; i++) {
			if (array[i].getNota() > mayor) {
				mayor = array[i].getNota();
			}
			if (alu.getNota() < menor) {
				menor = array[i].getNota();
			}
		}
		System.out.println("La nota mayor es : " + mayor);

	}

}
