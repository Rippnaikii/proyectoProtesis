package proyectoProtesis;

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
        
		
	}

}
