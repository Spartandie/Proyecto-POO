/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;
import Trabajadores.Acomodador;
import trabajador.*;



import baseDatos.Ingreso;
import Trabajadores.Vendedor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import Trabajadores.reproductores.CD_PLAYER;
import Trabajadores.reproductores.DVD_PLAYER;
import Trabajadores.Gerente;
import productos.Pnode;

/**
 *
 * @author Albert GP Pérez
 * @author Diego Monroy
 */
public class ProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
     File p = new  File("Producto");
     Vendedor c = new Vendedor();
     Gerente l = new Gerente();
     Acomodador a = new Acomodador();
     l.refresh_list(l);
     Pnode pd=new Pnode();
     CD_PLAYER p1 = new CD_PLAYER();
     DVD_PLAYER p2 = new DVD_PLAYER();
     Scanner sn = new Scanner(System.in);
        
     boolean salir = false;
     int opcion;
     
     Scanner in = new Scanner(System.in);
     System.out.println("Si desea Ingresar a la tienda presione 1, si desea registrase presione 2.\n"
                + "presione cualquier otra tecla en caso contrario");
     String respuesta=in.nextLine();
     if(respuesta.equals("1")){
     
        
        //Se verifica en los archivtos txt si los datos pertencen a un usuario o a un trabajador,
        //ambos anteriormente registrados
        //*********
        
        System.out.println("Identifiquese por favor, ingrese usuario");
        String usuario1=in.nextLine();
        Directorio nuevo= new Directorio();
        nuevo.directorio("Usuarios");
        File archivos=new File("Usuarios/"+usuario1+".txt");
            if(usuario1.equals("Trabajador") || usuario1.equals("TRABAJADOR")){
                  Ingreso uno=new Ingreso();
                  String trabajador=uno.LoginT(usuario1);//llama al método para casos de ingreso como trabajador
                  switch(trabajador){
                      case "Gerente":
                           System.out.println("Gerente!, ¿Qué desea realizar hoy?");
                                while(!salir){
                                    
                                        System.out.println("******************************************");
                                        System.out.println("1. OPCION 1: Agregar un Producto.");
                                        System.out.println("2. OPCION 2: Buscar algun Articulo.");
                                        System.out.println("3. OPCION 3: Ver carrito.");
                                        System.out.println("4. OPCION 4: Imprimir base de datos");
                                        System.out.println("5. OPCION 5: Salir.");
                                        System.out.println("******************************************");
                                // try- catch.        
                                        try{
                                // Se introduce la opcion y se guarda para proceder el switch.

                                            System.out.println("Introduce la opcion que requieres. ¡Porfavor!: ");
                                            opcion = sn.nextInt();

                                            switch(opcion){
                                                case 1:

                                                      if(l.add_product(l, null)!=false){
                                                          pd.getNombre();
                                                          //File archivos=new File(usuario1+".txt");
                                                         // if(archivos.exists()==true){
            
                                                                                     }
                                                         // l.print_list(l);
                                                          
                                                         
                                                          
                                                      
                                                      else{
                                                          System.out.println("Nombre y/o ID ya registrados");
                                                      }
                                                    break;

                                                case 2: 
                                                    l.search_node(l, c, p1, p2, 0);
                                                    break;
                                                case 3:

                                                    c.see_carrito(c, l);

                                                    break;

                                                case 4: 
                                                    System.out.print("Imprimir:\n1)Audifonos\n2)CDs\n3)DVDs\n4)Todos\n---> ");
                                                    opcion = sn.nextInt();
                                                    switch(opcion){
                                                        case 1:
                                                            l.print_list_headphones(l);
                                                            
                                                        break;
                                                        
                                                        case 2: 
                                                            l.print_list_Cds(l);
                                                            break;
                                                        case 3:
                                                            l.print_list_DVDs(l);
                                                            break;
                                                            
                                                        case 4:
                                                            l.print_list(l);
                                                            break;
                                                        default:
                                                            System.out.println("Opcion no valida");
                                                            break;
                                                    }
                                                    
                                                    break;

                                                case 5:
                                                    System.out.println(" ¡Vuelva Pronto! ");
                                                    l.del_list(l, c, 0);
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
                                    
                                   
                                   break;
                      case "Vendedor":
                          
                          
                          System.out.println("Vendedor!, ¿Qué desea realizar hoy?");
                                while(!salir){
                                    
                                        System.out.println("******************************************");
                                        System.out.println("1. OPCION 1: Buscar algun Articulo");
                                        System.out.println("2. OPCION 2: Ver carrito");
                                        System.out.println("3. OPCION 3: Salir del programa.");
                                        System.out.println("******************************************");
                                // try- catch.        
                                        try{
                                // Se introduce la opcion y se guarda para proceder el switch.

                                            System.out.println("Introduce la opcion que requieres. ¡Porfavor!: ");
                                            opcion = sn.nextInt();

                                            switch(opcion){
                                                

                                                case 1: 
                                                    c.search_node(l, c, p1, p2, 1);
                                                    break;
                                                    
                                                case 2:
                                                    c.see_carrito(c, l);
                                                    break;

                                                 
                                                    
                                                case 3: 
                                                    System.out.println(" ¡Vuelva Pronto! ");
                                                    l.del_list(l, c, 0);
                                                    salir = true;
                                                    break;

                                                
                                                default:
                                                    System.out.println(" Las opciones son unicamente las que aparecen en pantalla. ");

                                            }
                                // Damos una exepcion para prevenir posibles errores.      

                                    }catch(InputMismatchException e){

                                            System.out.println(" Debes colocar un numero. ");
                                            System.out.println(" Intentelo de nuevo porfavor.");
                                            sn.next();
                                    }

                                            }
                                    
                          
                                     break;
                      case "Acomodador":
                                     
                                           
                                
                                System.out.println("Acomodador!, ¿Qué desea realizar hoy?");
                                while(!salir){
                                    
                                        System.out.println("******************************************");
                                        System.out.println("1. OPCION 1: Buscar algun Articulo.");
                                        System.out.println("2. OPCION 2: Salir del programa.");
                                        System.out.println("******************************************");
                                // try- catch.        
                                        try{
                                // Se introduce la opcion y se guarda para proceder el switch.

                                            System.out.println("Introduce la opcion que requieres. ¡Porfavor!: ");
                                            opcion = sn.nextInt();

                                            switch(opcion){
                                                

                                                case 1: 
                                                    a.search_node(l, c, p1, p2, opcion);
                                                    break;
                                                
                                                
                                                    
                                                case 3: 
                                                    System.out.println(" ¡Vuelva Pronto! ");
                                                    salir = true;
                                                    l.del_list(l, c, 0);
                                                    break;

                                                
                                                default:
                                                    System.out.println(" Las opciones son unicamente las que aparecen en pantalla. ");

                                            }
                                // Damos una exepcion para prevenir posibles errores.      

                                    }catch(InputMismatchException e){

                                            System.out.println(" Debes colocar un numero. ");
                                            System.out.println(" Intentelo de nuevo porfavor.");
                                            sn.next();
                                    }

                                            }
                                     
                                     break;
                      default:
                                    return;
                                              
                                 }               
                      
                  }
                      
                 
                       
            else{ //Caso Usuario
                 System.out.println("Ingrese contraseña");
                 String contraseña=in.nextLine();
                 BufferedReader br = new BufferedReader(new FileReader("Usuarios/"+usuario1+".txt"));
                 String contrasetry = br.readLine();
                 String contrasetry2= br.readLine();
                 
                 if(contraseña.equals(contrasetry2)){ //Caso de ingreso de usuario exitoso
                     Menue menu=new Menue();
                     menu.menuUsuario(l, c);
                 }
                 
                 
                 else{ //Acciones tomadas a casua de seguridad
                         System.out.println("La contraseña es incorrecta, el programa se cerrará ahora por seguridad");
                         return;
                 }   
            }
        }
        else{ //Caso usuario no encontrado en la base de datos
        Ingreso u=new Ingreso();
         String d=u.RegistroU();
         if(d==null){ //caso no desea ya el registro
                 return;
             }
         if (d=="Cierto"){//Caso registro exitoso
            if(u.LoginU()==1){
                
            do{
           if(d==null){
             return;
             }
           d=u.RegistroU();
             }while(d!="Cierto");
           
           if(u.LoginU()==1){
               System.out.println("Demasiados intentos fallidos de sesion, el programa se cerrará ahora");
               return;
           }
                
             }
            return;
            
             
         }
       
         //Caso Registro no exitoso
  
       do{
           if(d==null){
                 return;
             }
           d=u.RegistroU();
             }while(d!="Cierto");
           
       u.LoginU();
             }
          

                //Se verifica en los archivtos txt si los datos pertencen a un usuario o a un trabajador,
                //ambos anteriormente registrados
                //*********


//Caso usuario quiere registrase

    if(respuesta.equals("2")){
         Ingreso u=new Ingreso();
         String d=u.RegistroU();
         if(d==null){ //caso no desea ya el registro
                 return;
             }
         if (d=="Cierto"){//Caso registro exitoso
            if(u.LoginU()==1){
                
            do{
           if(d==null){
             return;
             }
           d=u.RegistroU();
             }while(d!="Cierto");
           
           if(u.LoginU()==1){
               System.out.println("Demasiados intentos fallidos de sesion, el programa se cerrará ahora");
               return;
           }
                
             }
            return;
            
             
         }
       
         //Caso Registro no exitoso
  
       do{
           if(d==null){
                 return;
             }
           d=u.RegistroU();
             }while(d!="Cierto");
           
       u.LoginU();//Caso registro exitoso
             }

     //Caso Usuario sale de la tienda
     else{System.out.println("Esperamos verte pronto, Buen dia");
        // Termina el programa  
        //l.del_list(l);
        //if(l.print_list(l)==false){
            //System.out.println("Lista vacia\n");
       // }
       // System.out.println(" Fin del Menu. :D ");
     }
    }
}


     
     

    
