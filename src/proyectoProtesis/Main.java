
package proyectoProtesis;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

        System.out.println("=== SISTEMA DE CALIBRACIÓN DE PRÓTESIS ===");
        
        System.out.print("Ingrese el nombre del paciente: ");
        String nombreUsuario = teclado.nextLine();
        
        System.out.print("Ingrese la edad del paciente: ");
        int edadUsuario = teclado.nextInt(); 
        teclado.nextLine(); // Limpiamos el "Enter" que queda flotando (truco clásico de Java)
        
        while (edadUsuario <= 0) {
        	System.out.print("Error, Ingrese la edad del paciente: ");
            edadUsuario = teclado.nextInt(); 
            teclado.nextLine();
        }
        
        System.out.print("Ingrese el nivel de amputación (ej. Pierna derecha baja): ");
        String amputacionUsuario = teclado.nextLine();
        
        System.out.print("Ingrese el peso en kg (use coma para decimales): ");
        double pesoUsuario = teclado.nextDouble(); 
        
        while (pesoUsuario <= 0) {
        	System.out.print("Error, Ingrese el peso en kg(use coma para decimales): ");
        	pesoUsuario = teclado.nextDouble();
        }

        Paciente tio = new Paciente(nombreUsuario, edadUsuario, amputacionUsuario, pesoUsuario);

        System.out.println("\nGuardando datos... ¡Paciente registrado con éxito!\n");
        
        // Usamos el método que creamos en el molde
        tio.mostrarFichaMedica();
        
        double[] pasosSimulados = {11.2,30.1,20,19.6,22.4};
        	
        Analizador datosAnalizados = new Analizador() ;
        
        datosAnalizados.evaluarMarcha(pasosSimulados);
        
        teclado.close();
	}

}
