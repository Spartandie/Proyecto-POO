package trabajador;

import productos.Plist;

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
    
    public String ponerDisco(String disco){
        System.out.println("Reproduciendo"+ disco);
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
         
        return "El disco " + disco + "ha terminado de reproducirse. Le atendió el Trabajador:";      
    }
    
    public boolean buscarProducto(){
        Plist productoABuscar = new Plist();
        boolean busqueda=false;
        System.out.println("Estamos Buscando tu producto");
        try {
            //Ponemos a "Dormir" el programa durante los ms que queremos
            Thread.sleep(5*1000);
         } catch (Exception e) {
            System.out.println(e);
         }
        productoABuscar.search_node(productoABuscar);
        if (busqueda==true){
            System.out.println("Tu producto fue encontrado y añadido a tu carrito");
            return busqueda;
        }
        else{
            System.out.println("No contamos con tu producto en existencia");
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
