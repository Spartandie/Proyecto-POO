/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Giovanny Sanchez Ibarra
 */
public class Menu {

    /**
     * @param args el menu de nuestra empresa de discos.
     */
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        
        boolean salir = false;
        int opcion;
    
    // Menu para poder ingresar al sistema.
     
        while(!salir){
            
            System.out.println("******************************************");
            System.out.println("1. OPCION 1: Agregar un Producto.");
            System.out.println("2. OPCION 2: Pedir muestra de un producto.");
            System.out.println("3. OPCION 3: Buscar algun Articulo.");
            System.out.println("4. OPCION 4: Ver mi carrito.");
            System.out.println("5. OPCION 5: Salir del menu.");
            System.out.println("******************************************");
    // try- catch.        
            try{
    // Se introduce la opcion y se guarda para proceder el switch.
    
                System.out.println("Introduce la opcion que requieres. ¡Porfavor!: ");
                opcion = sn.nextInt();

                switch(opcion){
                    case 1:
                        System.out.println(" Esta es la opcion 1: ");
                        break;
                    case 2: 
                        System.out.println(" Esta es la opcion 2: ");
                        break;
                    case 3:
                        System.out.println(" Esta es la opcion 3: ");
                        break;
                    case 4:
                        System.out.println(" Esta es la opcion 4: ");
                        break;
                    case 5: 
                        System.out.println(" Esta es la opcion 5: ¡Vuelva Pronto! ");
                        salir = true;
                        break;
                    default:
                        System.out.println(" Las opciones son entre 1 y 5 nadamas. ");

                }
    // Damos una exepcion para prevenir posibles errores.      
    
        }catch(InputMismatchException e){
            
                System.out.println(" Debes colocar un numero. ");
                System.out.println(" Intentelo de nuevo porfavor.");
                sn.next();
        }
                
                }
    // Termina el menu    
        System.out.println(" Fin del Menu. :D ");
    }
    
    
    
}
