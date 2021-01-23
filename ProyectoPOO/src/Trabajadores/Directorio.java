package Trabajadores;

import proyectopoo.*;
import java.io.File;
/**
 *
 * @author decodigo.com
 */
public class Directorio {

    Directorio() {
         
    }
    
    public void directorio(String producto){
        File directorio = new File( producto );
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
}
