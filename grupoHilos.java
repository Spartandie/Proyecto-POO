/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GrupoHilos;

/**
 * Clase Hilos que va a exteneder de la clase Thread 
 * @author David Martinez
 */
public class grupoHilos extends Thread{
    /**
     * Constructor el cual recibe 2 atributos que extiene de la clase Thread
     * @param g recibe hilo el cual tiene una prioridad normal
     * @param n recibe que hilo es, para poder identificarlo
     */
    public grupoHilos( ThreadGroup g, String n ){
        super(g,n);
    }
    
    @Override
    /**
     *Este metodo solo es una iteracion que se ejecuta en un ciclo for
     * que va de 0 a 10 y es para poder visualizar con que hilo se esta trabajando
     * 
     */
    public void run(){
        for( int i = 0; i < 10; ++i ){
            System.out.println( getName() + " iteración " + i );
        }
    }
    
    
}
