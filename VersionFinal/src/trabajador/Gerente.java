package trabajador;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Albert GP Pérez
 */
public class Gerente extends Trabajador {

    public Gerente() {
    }

    
    
    public void Deberes(){
        System.out.println ("1) Contratar empleado\n"
                + "2) Añadir Producto\n"
                + "3) Dar de alta producto\n");
        return;
                
    }
    
    public void agregarTrabajador(){
        Scanner in = new Scanner(System.in);
        System.out.println("¿Qué tipo de trabajador desea dar de alta?");
        String data=in.nextLine();
        switch(data){
            case "Vendedor":
                //Manda a la clase Vendedor para crear uno nuevo, y en ella misma 
                //crea el archivo txt
            break;
            
            case "Acomodador":
                //Manda a la clase Vendedor para crear uno nuevo, y en ella misma 
                //crea el archivo txt
                break;
                
            
        }
        
        
    }
    
}


