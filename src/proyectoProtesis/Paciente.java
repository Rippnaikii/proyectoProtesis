package proyectoProtesis;

public class Paciente {
	
	String nombre;
	int edad;
	String nivelAmputacion;
	double pesoIdeal;
	
	
	public Paciente(String nombreIngresado, int edadIngresada, String nivelIngresado, double pesoIngresado) {
		this.nombre = nombreIngresado;
        this.edad = edadIngresada;
        this.nivelAmputacion = nivelIngresado;
        this.pesoIdeal = pesoIngresado;
			
	}
	
	public void mostrarFichaMedica() {
        System.out.println("--- FICHA DEL PACIENTE ---");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad + " años");
        System.out.println("Amputación: " + this.nivelAmputacion);
        System.out.println("Peso para calibración: " + this.pesoIdeal + " kg");
        System.out.println("--------------------------");
    }

}
