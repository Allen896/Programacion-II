import java.util.*;

public class Aplicacion {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        Empleado[] empleados = new Empleado[5];

	        System.out.println("3 empleados a tiempo completo:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println("Empleado Tiempo Completo " + (i + 1) + ":");
	            System.out.print("Nombre: ");
	            String nombre = scanner.next();
	            System.out.print("Salario Anual: ");
	            double salarioAnual = scanner.nextDouble();
	            empleados[i] = new EmpleadoTiempoCompleto(nombre, salarioAnual);
	        }

	        System.out.println("\n2 empleados por horas:");
	        for (int i = 3; i < 5; i++) {
	            System.out.println("Empleado por Horas " + (i - 2) + ":");
	            System.out.print("Nombre: ");
	            String nombre = scanner.next();
	            System.out.print("Horas Trabajadas: ");
	            double horas = scanner.nextDouble();
	            System.out.print("Tarifa por Hora: ");
	            double tarifa = scanner.nextDouble();
	            empleados[i] = new EmpleadoTiempoHorario(nombre, horas, tarifa);
	        }

	        
	        for (int i = 0; i < empleados.length; i++) {
	            System.out.println("Nombre: " + empleados[i].nombre + 
	                             ", Salario Mensual: " + empleados[i].CalcularSalarioMensual());
	        }

	        scanner.close();
	    }
	}