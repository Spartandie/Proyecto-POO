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
public class CD_PLAYER extends Gerente {
    private int num;
    proyectopoo.KeyboardInput in = new proyectopoo.KeyboardInput();
    public CD_PLAYER(){
        this.num=0;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    
    
    @Override
    public boolean add_product(Gerente l, Pnode n){
        int opc;
        if(l.is_in_list(l, n)){
            System.out.println("Disco ya puesto con anterioridad");
            return false;
        }
        if(l.getN()>4){
            System.out.println("El cd esta lleno\nQue deseas hacer?\n1)Quitar un disco y poner el nuevo\n2)Salir");
            opc = in.readInteger();
            if(opc==1){
                this.del_cd(l);
            }
            else{
                return false;
            }
        }
        if(l.getHead()==null){
            l.setHead(n);
            l.setTail(n);
            n.setNext(n);
            n.setPrev(n);
            l.setN(1);
            return true;
        }
        if(l.getHead()==l.getTail()){
            l.getHead().setNext(n);
            l.getHead().setPrev(n);
            n.setNext(l.getHead());
            n.setPrev(l.getHead());
            l.setTail(n);
            l.setN(l.getN()+1);
           
            return true;
        }
        l.getTail().setNext(n);
        l.getHead().setPrev(n);
        n.setPrev(l.getTail());
        n.setNext(l.getHead());
        l.setTail(n);
        l.setN(l.getN()+1);
        return true;
    }
    
    public boolean rec_list(Gerente l, Pnode n){
        if(l.is_empty(l))
        {
            return false;
        }
        Pnode t = new Pnode();
        t=l.getHead();
        int i=0, opc;
        for(t=l.getHead(); Objects.equals(t.getNombre(), n.getNombre())!=true ;t=t.getNext()){
            
        }
        
        while(true){
           
            System.out.println("                Ahora reproduciendo:\n");
            System.out.println("Nombre album: "+t.getNombre());
            System.out.println("Cancion "+(i+1)+"/"+t.getnPistas()+": "+t.getNombreCancion(i));
            System.out.println("Autor: "+t.getAutor());
            System.out.println("Genero: "+t.getGenero());
            System.out.println("Seleccione una opcion:");
            System.out.println("1)Siguiente cancion");
            System.out.print("2)Album siguiente\n3)Album previo\nOtro=Salir\n---> ");
            opc = in.readInteger();
            
            switch(opc){
                
                case 1:
                    i++;
                    if(i==t.getnPistas()){
                        System.out.println("Disco terminado...Reproduciendo siguiente disco");
                        i=0;
                        t=t.getNext();
                    }
                break;
                
                case 2:
                    i=0;
                    t=t.getNext();
                break;
                
                case 3:
                    i=0;
                    t=t.getPrev();
                break;
                
                
                default:
                    return true;
                        
                
            }
            
        }
        
    }
    
    public void del_cd(Gerente l){
        Pnode t = new Pnode();
        t=l.getHead();
        int i, opc;
        for(i =1 ; t!=l.getTail(); t = t.getNext(), i++){
            System.out.println("---------------- Disco "+i+" ---------------\n");
            System.out.println("Album: "+t.getNombre());
            System.out.println("Artista: "+t.getAutor());
            System.out.println("Genero: "+t.getGenero());
            System.out.println("");
        }
        System.out.println("---------------- Disco "+i+" ---------------\n");
        System.out.println("Album: "+t.getNombre());
        System.out.println("Artista: "+t.getAutor());
        System.out.println("Genero: "+t.getGenero());
        System.out.println("");
        System.out.print("Cual disco quieres quitar?: ");
        opc = in.readInteger();
        if(opc >i || opc<=0){
            System.out.println("Opcion no valida");
            return ;
        }
        i=1;
        t=l.getHead();
        for(; i!=opc ; t = t.getNext(), i++){
        }
        l.del_node(l, t);
    }
}
