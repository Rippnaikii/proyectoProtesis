package proyectoProtesis;
import java.io.FileWriter;
import java.io.PrintWriter;


public class Analizador {
	public void evaluarMarcha(double[] datosDelSensor) {
		int pasosCriticos = 0 ;	
        
        int i = 0 ; 
        
        while ( i < datosDelSensor.length) {
        	if (datosDelSensor[i] > 20) {
        		pasosCriticos++ ;
        	}
        	i++ ;
        	
        	
        }
        
        System.out.println("Análisis de marcha terminado. Pasos críticos (>20G): "+ pasosCriticos) ;
        
        guardarHistorialCsv(pasosCriticos);
	}
	
	public void guardarHistorialCsv(int cantPasosCriticos) {
		try {
		    
		    FileWriter archivo = new FileWriter("historial_protesis.csv", true);
		    PrintWriter escritor = new PrintWriter(archivo);

		    //Texto de prueba CAMBIAR
		    escritor.println("Pasos Criticos; " + cantPasosCriticos);

		    // Siempre hay que cerrar el archivo para que los cambios se guarden de verdad
		    escritor.close();
		    
		    System.out.println("Registro guardado en Excel (CSV).");

		} catch (Exception e) {
		    System.out.println("Ocurrió un error al guardar: " + e.getMessage());
		}
		
		
	}

}
