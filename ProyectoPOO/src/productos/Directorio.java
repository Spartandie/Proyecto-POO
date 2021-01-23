package productos;

import proyectopoo.*;
import java.io.File;
/**
 * Objeto de tipo Directorio que sirve a manera de directorio para mostrar todos
 * nuetsros productos en nuestra tienda.
 * @author decodigo.com
 */
public class Directorio {

    /**
     * Constructor del Objeto Directorio totalmente vacio.
     */
    Directorio() {
    }
    
    /**
     * Funcion dedicada a crear un directorio referente a un producto.
     * @param producto Es el nombre del producto a agregar al directorio
     */
    public void directorio(String producto){
        File directorio = new File("Productos/"+ producto );
        if (!directorio.exists()) {
            if (directorio.mkdirs()) {
                System.out.println("Directorio creado");
            } else {
                System.out.println("Error al crear directorio");
            }
        }
    }
}
