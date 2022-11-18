package Paketon;

import java.util.Scanner;

public class Conditionals {

public static void main(String[] args) {
	
		Scanner teclado = new Scanner(System.in); 
		
		
		final int PRECIO_NORMAL = 12;
		final int PRECIO_EXTRA = 16;
		final int HORA_TOPE = 40;
		
		int horasTrabajadas;
		int salario;
		
		
		System.out.print("Porfavor, introduzca el número de horas trabajadas durante la semana: ");
		horasTrabajadas = Integer.parseInt(teclado.nextLine());
		
		if (horasTrabajadas <= HORA_TOPE ) {
			salario = horasTrabajadas * PRECIO_NORMAL;
		}else {
			salario = (HORA_TOPE * PRECIO_NORMAL) + ((horasTrabajadas - HORA_TOPE) * PRECIO_EXTRA);
		}
		
		
		
		
		System.out.println("El sueldo semanal que le corresponde es de " + salario + "euros");

	}	
}
