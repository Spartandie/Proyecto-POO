/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajadores;

import Trabajadores.reproductores.CD_PLAYER;
import Trabajadores.reproductores.DVD_PLAYER;
import productos.Cnode;
import java.util.Objects;
import productos.Pnode;
import proyectopoo.KeyboardInput;



/**
 *
 * @author spart
 */
public class Vendedor extends Gerente{
    KeyboardInput in = new KeyboardInput();
    private Cnode head;
    private Cnode tail;
    int nProd;

    public Vendedor(){
        
    }
    
    public Vendedor(Cnode head, Cnode tail, int nProd) {
        this.head = head;
        this.tail = tail;
        this.nProd = nProd;
    }

   
    public KeyboardInput getIn() {
        return in;
    }

    @Override
    public Cnode getHead() {
        return head;
    }

    @Override
    public Cnode getTail() {
        return tail;
    }

    public int getnProd() {
        return nProd;
    }

    public void setIn(KeyboardInput in) {
        this.in = in;
    }

    public void setHead(Cnode head) {
        this.head = head;
    }

    public void setTail(Cnode tail) {
        this.tail = tail;
    }

    public void setnProd(int nProd) {
        this.nProd = nProd;
    }

    

    
    public void add_carrito(Vendedor c, Pnode t){
        
        
        Cnode n = new Cnode(1, t.getNombre(), t.getPrecio(), t.getId(), t.getTipo(), t.getAutor(), t.getGenero());
        System.out.println(n.getCant());
        Cnode t2 = new Cnode();
        if(c.getHead()!=null){
            t2=c.getHead();
            for(; t2!=c.getTail();t2=t2.getNext())
            {
                if(Objects.equals(n.getNombre(), t2.getNombre())==true){
                    System.out.println(n.getCant());
                    t2.setCant(t2.getCant()+1);
                    
                    return;
                }
            }
            if(Objects.equals(n.getNombre(), t2.getNombre())==true){
                t2.setCant(t2.getCant()+1);
                
                return;
            }
        }
       
        if(c.getHead()==null){
            c.setHead(n);
            c.setTail(n);
            return;
        }
        n.setNext(c.getHead());
        c.setHead(n);
       
       
    }
    
    public boolean see_carrito(Vendedor c, Gerente l ){
        if(!c.is_empty_clist(c))
        {
            
            System.out.println("\n-----------Articulos en el carrito----------\n\n");
            print_clist(c, l);
            return true;
        }
        System.out.println("Carrito vacio\n");
       
        return false;
    }
    
    
    public void print_clist( Vendedor c, Gerente l)
    {
        int  prod = 0, opc;
        float precio=0, total = 0;
        Cnode t = new Cnode();

        if( c == null )
        {
            System.out.println("No existe");
            return;
        }
        else if( is_empty_clist(c) ){
            return;
        }
        
        for( t = c.getHead(); t!= null; t = t.getNext() )
        {
            prod++;
            System.out.println("----------- Producto "+prod+" -----------\n");
            System.out.println("=>Nombre: " + t.getNombre() );
            System.out.println("=>Precio: " + t.getPrecio());
            System.out.println("=>ID: "+ t.getId());
            System.out.println("=>Tipo: " + t.getTipo() );
            System.out.println("Cantidad: "+t.getCant());
            precio = t.getPrecio()*t.getCant();
            total += precio;
        }
        t = c.getHead();
        System.out.println("\nTotal: $" + total );
        System.out.print("\n1)Confirmar compra\n2)Eliminar prodcuto\n3)Vaciar carrito\nOtro)Seguir explorando Catalogo\n=>");
        opc = in.readInteger();
        switch(opc){
            case 1:
                c.buy(c, l, total);
            break;
            
            case 2:
                System.out.print("Que producto quieres borrar?\n----> ");
                
                opc = in.readInteger();
                if(opc>prod){
                    System.out.println("Numero no valido");
                    return;
                }                
                t.del_cnode(c, opc, l);
               
                
                
                
            break;
            
            
            
            case 3:
                l.del_list(l, c, 1);
                break;
            
            default:
                System.out.println("Regresando al menu");
                return;
           
            
        }
    }
    
    public boolean is_empty_clist( Vendedor l ){
        if( l.getHead() == null &&  l.getTail()== null ) return true;
        return false;
    }
    
    public void buy(Vendedor c, Gerente l, float total ){
        
        Cnode n = new Cnode();
        Pnode n2 = new Pnode();
        int i;
        
        System.out.println("\n------------------GRACIAS POR SU COMPRA VUELVA PRONTO---------------\n");
        for(n=c.getHead(), i=1;n!=c.getTail();n=n.getNext(), i++){
            
            for(n2=l.getHead();n2!=l.getTail();n2 = n2.getNext()){
                if(Objects.equals(n2.getNombre(), n.getNombre())){
                    n2.setExistencias(n2.getExistencias()-n.getCant());
                }
                if(n2.getExistencias()==0){
                    l.del_node(l, n2);
                }
            }
            if(Objects.equals(n2.getNombre(), n.getNombre())){
                    n2.setExistencias(n2.getExistencias()-n.getCant());
                }
            if(n2.getExistencias()==0){
                    l.del_node(l, n2);
            }
            if(Objects.equals(n.getTipo(), "Audifonos")){
                System.out.println("-------------PRODUCTO "+i+"----------------\n");
                System.out.println("Nombre de los audifonos: "+n.getNombre());
                System.out.println("Color: "+n.getColor());
                System.out.println("Precio: "+n.getPrecio());
            }
            else{
                if(Objects.equals(n.getTipo(), "CD")){
                    System.out.println("-------------PRODUCTO "+i+"----------------\n");
                    System.out.println("Album: "+n.getNombre());
                    System.out.println("Artista: "+n.getAutor());
                    System.out.println("Genero: "+n.getGenero());
                    System.out.println("Precio: "+n.getPrecio());
                }
                else{
                    System.out.println("-------------PRODUCTO "+i+"----------------\n");
                    System.out.println("Album: "+n.getNombre());
                    System.out.println("Artista: "+n.getAutor());
                    System.out.println("Genero: "+n.getGenero());
                    System.out.println("Duracion: Minutos["+n.getMinutos()+"]  Segundos["+n.getSegundos()+"]");
                    System.out.println("Precio: "+n.getPrecio());
                }
            }
        }
       
        for(n2=l.getHead();n2!=l.getTail();n2 = n2.getNext()){
                if(Objects.equals(n2.getNombre(), n.getNombre())){
                    n2.setExistencias(n2.getExistencias()-n.getCant());
                }
                if(n2.getExistencias()==0){
                    l.del_node(l, n2);
                }
        }
        if(Objects.equals(n2.getNombre(), n.getNombre())){
            n2.setExistencias(n2.getExistencias()-n.getCant());
        }
        if(n2.getExistencias()==0){
            l.del_node(l, n2);
        }
        
        if(Objects.equals(n.getTipo(), "Audifonos")){
                System.out.println("-------------PRODUCTO "+i+"----------------\n");
                System.out.println("Nombre de los audifonos: "+n.getNombre());
                System.out.println("Tipo de producto: "+n.getTipo());
                System.out.println("Color: "+n.getColor());
                System.out.println("Cantidad: "+n.getCant());
                System.out.println("Precio: "+n.getPrecio());
            }
            else{
                if(Objects.equals(n.getTipo(), "CD")){
                    System.out.println("-------------PRODUCTO "+i+"----------------\n");
                    System.out.println("Album: "+n.getNombre());
                    System.out.println("Artista: "+n.getAutor());
                    System.out.println("Genero: "+n.getGenero());
                    System.out.println("Duracion: "+n.getMinutos()+" minutos aprox");
                    System.out.println("Tipo de producto: "+n.getTipo());
                    System.out.println("Cantidad: "+n.getCant());
                    System.out.println("Precio: "+n.getPrecio());
                }
                else{
                    System.out.println("-------------PRODUCTO "+i+"----------------\n");
                    System.out.println("Album: "+n.getNombre());
                    System.out.println("Artista: "+n.getAutor());
                    System.out.println("Genero: "+n.getGenero());
                    System.out.println("Duracion: "+n.getMinutos()+" minutos aprox");
                    System.out.println("Tipo de producto: "+n.getTipo());
                    System.out.println("Cantidad: "+n.getCant());
                    System.out.println("Precio: "+n.getPrecio());
                }
            }
        
        System.out.println("---------   TOTAL: $"+total+"  ----------------\n");
        
        
        Cnode t = c.getHead();
        while(true){
            if(c.getHead()==c.getTail()){
                c.setHead(null);
                c.setTail(null);
                t.del_cnode(t);
                break;
            }
            if(t.getNext()!=c.getTail()){
                t=t.getNext();
            }else{
                c.setTail(t);
                t.del_cnode(t.getNext());
                c.getTail().setNext(null);
                t=c.getHead();
            }
        }
        
    }
    
    
    
    @Override
    public Pnode search_node(Gerente l, Vendedor c, CD_PLAYER p1, DVD_PLAYER p2, int mode)
    {
            if(l.is_empty(l)!=false){
                System.out.println("Lista vacia");
                return null;
            }
            System.out.println("Te atiende el vendedor: "+l.getNombreTrabajador());
            int opc;
            Pnode node = new Pnode();
            KeyboardInput in = new KeyboardInput();
            System.out.print("Buscar por:\n1)Nombre\n2)ID\n---> ");
            opc=in.readInteger(); 
            switch(opc)
            {
                case 1:
                    String name;
                    System.out.println("Ingrese el nombre a buscar: ");
                    name = in.readString();
                    node=l.search_name(l, name);
                break;

                case 2:
                    int id;
                    System.out.println("Ingrese el ID a buscar: ");
                    id = in.readInteger();
                    node=l.search_id(l, id);
                break;

                default:
                    System.out.println("Opcion invalida");
                    return null;


            }
            if(node!=null){
                if(Objects.equals("Audifonos", node.getTipo())!=true){
                    if(Objects.equals("DVD", node.getTipo())){
                        System.out.println("Nombre DVD: "+node.getNombre());
                        System.out.println("Precio: $"+node.getPrecio());
                        System.out.println("");
                        System.out.print("\nQue quieres hacer? \n1)Agregar al carrito\n2)Insertar en DVD\n\n4)Salir\n---> ");
                        opc=in.readInteger();
                        switch(opc){

                            case 1:
                                c.add_carrito(c, node);
                                System.out.print("Buscar otro disco?\n1)Si\n2)No\n---> ");
                                opc=in.readInteger();
                                if(opc==1){

                                    this.search_node(l, c, p1, p2, mode);
                                }
                                return null;


                            case 2:
                                Pnode t = new Pnode(node.getNombre(), node.getPrecio(), node.getId(), node.getTipo(), node.getAutor(), node.getGenero());
                                p2.add_product(p2, t);
                                p2.rec_list(p2, t);
                                System.out.print("Buscar otro producto?\n1)Si\n2)No\n---> ");
                                opc=in.readInteger();
                                if(opc==1){

                                    this.search_node(l, c, p1, p2, mode);
                                }
                                return null;




                            default:
                                return null;

                        }
                    }
                    else{

                        System.out.println("Nombre album: "+node.getNombre());
                        System.out.println("Precio: $"+node.getPrecio());
                        System.out.println("");
                        System.out.print("\nQue quieres hacer? \n1)Agregar al carrito\n2)Insertar en CD\n3)Salir\n---> ");
                        opc=in.readInteger();
                        switch(opc){

                            case 1:
                                c.add_carrito(c, node);
                                System.out.print("Buscar otro Producto?\n1)Si\n2)No\n---> ");
                                opc=in.readInteger();
                                if(opc==1){

                                    this.search_node(l, c, p1, p2, mode);
                                }
                                return null;


                            case 2:
                                Pnode t = new Pnode(node.getNombre(), node.getPrecio(), node.getId(), node.getTipo(), node.getAutor(), node.getGenero(), node.getnPistas(), node.getCanciones());



                                if(p1.add_product(p1, t)){
                                    p1.rec_list(p1, t);
                                }

                                System.out.print("Buscar otro disco?\n1)Si\n2)No\n---> ");
                                opc=in.readInteger();
                                if(opc==1){

                                    this.search_node(l, c, p1, p2, mode);
                                }
                                return null;


                            default:

                                return null;

                        }
                    }


                }
                else{
                    System.out.println("Nombre de los audifonos: "+node.getNombre());
                    System.out.println("Color: "+node.getColor());
                    System.out.println("Precio: $"+node.getPrecio());
                    System.out.println("");
                    System.out.print("\nQue quieres hacer? \n1)Agregar al carrito\n2)Salir\n---> ");
                    opc=in.readInteger();
                        switch(opc){

                            case 1:
                                c.add_carrito(c, node);
                            break;

                            case 2:
                                return null;


                        }
                }

            }
            else{
                System.out.println("No se encontró el producto");
            }
            return node;
        
        
    }
}

