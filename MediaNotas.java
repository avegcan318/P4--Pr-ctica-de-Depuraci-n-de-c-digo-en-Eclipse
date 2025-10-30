package tema2_debug;

import java.util.Scanner;

public class MediaNotas {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numAlumnos = pedirNum(sc,"Introduce el número de alumnos: ", "Error: número de almunos tiene que ser mayor que 0");
		double notAlumnos = pedirNota(sc, numAlumnos,"Introduce la nota del alumno","Error: la nota debe estar entre 0 y 10");
		
		double media = notAlumnos / numAlumnos;
		System.out.printf("La media del grupo es: %.2f", media);

		sc.close();
	}
	
	
	private static int pedirNum(Scanner sc, String mensaje, String error) {
		int numAlumnos = 0;
		
		do {
			System.out.print(mensaje);
			numAlumnos = sc.nextInt();
			
			if(numAlumnos <= 0) {
				System.out.println(error);
			}			
		} while (numAlumnos <= 0);
		
		return numAlumnos;
	}
	
	private static double pedirNota(Scanner sc, int numAlumnos, String mensaje,String error) {
		int contador = 1;
		double suma = 0;
		
		while (contador <= numAlumnos) {
			System.out.print(mensaje + contador + ": ");
			double nota = sc.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println(error);

			}else {
				suma = suma + nota;
				contador++;
			}
		}
		return suma; 
	}
	
	
}
