package trabajador;

import Trabajadores.Vendedor;
import Trabajadores.reproductores.CD_PLAYER;
import Trabajadores.reproductores.DVD_PLAYER;
import Trabajadores.Gerente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albert GP Pérez
 */
public class Trabajador {
    String nombre;
    String edad;
    String puesto;
    
    public Trabajador() {
    }

    public Trabajador(String nombre, String edad, String puesto) {
        this.nombre = nombre;
        this.edad = edad;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void ponerDisco(String disco){
        System.out.println("Reproduciendo "+ disco);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        System.out.println("El disco " + disco + "ha terminado de reproducirse.");
        return;
        
        
    }
    
    public boolean buscarProducto(String Producto){
        Vendedor c = new Vendedor();
        Gerente l = new Gerente();
        CD_PLAYER p1 = new CD_PLAYER();
        DVD_PLAYER p2 = new DVD_PLAYER();
        boolean busqueda=false;
        System.out.println("Estamos Buscando tu producto");
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            l.search_node(l, c, p1, p2);
                                                   
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        if (busqueda==true){
            System.out.println("Tu producto fue encontrado y añadido a tu carrito");
            return busqueda;
        }
        else{
            System.out.println("No contamos con tu producto en existencia");
            return busqueda;
        }
        
    }
    
        public boolean buscarDisco(String disco){
        boolean busqueda=false;
        System.out.println("Estamos Buscando tu disco");
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        if (busqueda==true){
            System.out.println("Tu disco fue encontrado y añadido a tu carrito");
            return busqueda;
        }
        else{
            System.out.println("En estos momentos no tenemos el disco solicitado en existencia");
            return busqueda;
        }
        
    }
    
    public boolean buscarID(String ID){
        boolean busqueda=false;
        System.out.println("Estamos Buscando tu producto");
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        if (busqueda==true){
            System.out.println("Tu producto fue encontrado y añadido a tu carrito");
            return busqueda;
        }
        else{
            System.out.println("No contamos con tu producto en existencia");
            return busqueda;
        }
        
    }
    
   
    
}
