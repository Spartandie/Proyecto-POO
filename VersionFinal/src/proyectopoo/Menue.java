/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import Trabajadores.Gerente;
import Trabajadores.Vendedor;
import java.util.Scanner;


/**
 *
 * @author Albert GP Pérez
 */
public class Menue {

    public Menue() {
    }

public void menuUsuario(Gerente l, Vendedor c){
    boolean salida=false;
                     Scanner in = new Scanner(System.in);
                     System.out.println("Bienvenido de nuevo, porfavor ingrese el número de la accion que desea realizar");
                     do{
                     System.out.println("******************************************");
                     System.out.println("1. presione 1 para: Buscar un disco");
                     System.out.println("2. presione 2 para: Ver carrito");
                     System.out.println("3. presione 3 para: Salir de la tienda.");
                     System.out.println("******************************************");
                     String accion=in.nextLine();
                     switch(accion){
                         
                         case "1":
                             l.search_node(l, c, null, null, 1);
                             break;
                         case "2":
                                c.see_carrito(c, l);
                             break;
                         case "3":
                             System.out.println("Esperamos verte denuevo pronto. Buen dia");
                             salida=true;
                             return;
                         default:
                             System.out.println("El valor ingresado no es válido, porfavor intente denuevo");
                             
                             
                                }
                     } while(salida==false);
                     
                     
                    return;
}    

    @Override
    public String toString() {
        return "menue{" + '}';
    }

}

