/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajadores.reproductores;

import Trabajadores.Gerente;
import java.util.Objects;
import productos.Pnode;

/**
 *
 * @author spart
 */
public class DVD_PLAYER extends Gerente{
    proyectopoo.KeyboardInput in = new proyectopoo.KeyboardInput();
    public DVD_PLAYER(){
        
    }
    
    @Override
    public boolean add_product(Gerente l, Pnode n){
        int opc;
        if(l.getHead()==null){
            l.setHead(n);
            l.setTail(n);
            n.setNext(n);
            n.setPrev(n);
            return true;
        }else{
            if(l.is_in_list(l, n)){
                System.out.println("El DVD se esta reproduciendo actualmente");
                return false;
            }
            System.out.println("DVD lleno, por favor, saca el disco");
            System.out.println("1)Sacar disco y poner nuevo\n2)Salir\n---> ");
            opc = in.readInteger();
            if(opc==1){
                l.del_list(l, null, 0);
                l.add_product(l, n);
                
            }
            return false;
        }
        
       
    }
    
    
    public boolean rec_list(Gerente l, Pnode t){
        if(l.is_empty(l))
        {
            System.out.println("DVD vacio");
            return false;
        }
            int opc;
            System.out.println("                Ahora reproduciendo:\n");
            System.out.println("Nombre album: "+t.getNombre());
            System.out.println("Autor: "+t.getAutor());
            System.out.println("Genero: "+t.getGenero());
            System.out.println("Duracion aprox: "+t.getMinutos()+" minutos");
            System.out.println("");
            System.out.print("Elige opción\n1)Sacar disco?\n2)Salir\n----> ");
            
            opc = in.readInteger();
            
            switch(opc){
                
                case 1:
                    l.del_list(l, null, 0);
                    
                break;
                    
                case 2:
                    return true;
                
            }
         
            
        
        return true;
    }
    
    @Override
    public boolean is_in_list(Gerente l, Pnode n){
        
        if(Objects.equals(n.getNombre(), l.getHead().getNombre()) || Objects.equals(n.getId(), l.getHead().getId())){
            return true;
        }
        return false;
    }
}
