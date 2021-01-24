/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import proyectopoo.Menue;

/**
 *
 * @author Albert GP Pérez
 */
public class Ingreso {

    public Ingreso() {
    }
    
  
    
    public String LoginT(String usuario1) throws FileNotFoundException, IOException{
        Scanner in = new Scanner(System.in);
        try{
        System.out.println("Ingrese contraseña");
        String contraseña=in.nextLine();
        switch(contraseña){
                       case "Gerente":
                           return "Gerente";
                                   
                               //Se manda a llamar a el menú de funciones del gerente
                       case "Vendedor":
                           return "Vendedor";
                                     
                       case "Acomodador":
                           return "Acomodador";
                                     
                       default:
                                    System.out.println("La contraseña es incorrecta, \nel programa se cerrará ahora");
                                    break;
                                              
                                 }
    }
        catch(Exception e){
            System.out.println("La contraseña es incorrecta, \nel programa se cerrará ahora");
            
            
        }
        return "Adios";
    }
       
    
    
    
    
    
    
    

public String RegistroU() throws IOException{
        Scanner in = new Scanner(System.in);
        System.out.println("Vemos que eres nuevo, ¿quieres registrate para poder navegar en la tienda?\n"
                            +"presione 1 para confirmar \no presiona cualquier otra tecla"
                            + " para salir de la tienda");
        
        String respuesta=in.nextLine();
        
        try{
            int resp=Integer.valueOf (respuesta);
            if(resp== 1){
                Scanner in2 = new Scanner(System.in);
                System.out.println(" ======={ Register }=======");
                System.out.println("Bienvenido por favor ingrese los datos que se le soliciten a continuación");
                System.out.println("=> Nombre de Usuario: ");
                String user=in.nextLine();
                Directorio usuari=new Directorio();
                usuari.directorio("Usuarios");
                File archivo=new File("Usuarios/"+user+".txt");
                if(archivo.exists()==true){
                    System.out.println("El Usuario ya existe, "
                            + "porfavor intente denuevo el ingreso o el registro más tarde");
                    return "Falso"  ;   
                }
                archivo.createNewFile();
                System.out.println(archivo.exists());
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(user+ '\n');
                System.out.println("=> Contraseña: ");
                String contraseña=in.nextLine();
                BufferedWriter bw2 = new BufferedWriter(fw);
                bw.write(contraseña+ '\n');
                bw.close();
                System.out.println("Te has registrado con éxito!! "+ 
                                   " Vuelve a iniciar sesión para continuar");
                return "Cierto";
  
            }
            else{ System.out.println("Gracias por su visita, vuelva pronto");
                  return null;}
            
        }
        catch(NumberFormatException resp){
            System.out.println("El valor ingresado no es válido para continuar con el resgitro\n"
                    + " por tal motivo el programa entiende que no desea continuar y\n terminará su ejecución"+
                    " \nEsperamos verte pronto, Buen dia");
            return null;
            
            
        }
}





public int LoginU() throws IOException{
    
        Scanner in = new Scanner(System.in);
        System.out.println("Identifiquese por favor, ingrese usuario");
        String usuario1=in.nextLine();
        Directorio usuari=new Directorio();
        usuari.directorio("Usuarios");
        File archivos=new File("Usuarios/"+usuario1+".txt");
        if(archivos.exists()==true){
            if(usuario1.equals("Trabajador")){
                  Ingreso uno=new Ingreso();
                  uno.LoginT(usuario1);
            }           
            else{
                 System.out.println("Ingrese contraseña");
                 String contraseña=in.nextLine();
                 BufferedReader br = new BufferedReader(new FileReader("Usuarios/"+usuario1+".txt"));
                 String contrasetry = br.readLine();
                 String contrasetry2= br.readLine();
                 if(contraseña.equals(contrasetry2)){
                     Menue menu=new Menue();
                     menu.menuUsuario();
                 return 0;}
                 else{ 
                         System.out.println("La contraseña es incorrecta, el programa se cerrará ahora por seguridad de nuestros clientes");
                         return 0;
                 }   
    }
        }
        else{
            return 1;
        }
        
        return 0;
        
    }

    @Override
    public String toString() {
        return "Ingreso{" + '}';
    }

}






       

        
    
    
    


        
    

    
        
        
    
                       
    

        
    

