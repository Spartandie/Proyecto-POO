/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectopoo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Albert GP Pérez
 */
public class ProyectoPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        
        System.out.println("Identifiquese por favor, ingrese usuario");
        System.out.println("Ingrese contraseña");
        //Se verifica en los archivtos txt si los datos pertencen a un usuario o a un trabajador,
        //ambos anteriormente registrados
        //*********
        
        
        //Caso usuario no registrado
        System.out.println("Vemos que eres nuevo, ¿quieres registrate para poder navegar en la tienda?,"
                            + "presione 1 para confirmar o cualquier otro numero para salir de la tienda");
        Scanner in = new Scanner(System.in);
        String respuesta=in.nextLine();
        
        try{
            int resp=Integer.valueOf (respuesta);
            if(resp== 1){
                Scanner in2 = new Scanner(System.in);
                System.out.println(" ======={ Register }=======");
                System.out.println("Bienvenido por favor ingrese los datos que se le soliciten a continuación");
                System.out.println("=> Nombre de Usuario: ");
                String user=in.nextLine();
                File archivo=new File(user+".txt");
                if(archivo.exists()==true){
                    System.out.println("El Usuario ya existe, "
                            + "porfavor intente denuevo el ingreso o el registro más tarde");
                    return;   
                }
                archivo.createNewFile();
                System.out.println(archivo.exists());
                FileWriter fw = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Usuario: "+user+ '\n');
                System.out.println("=> Contraseña: ");
                String contraseña=in.nextLine();
                BufferedWriter bw2 = new BufferedWriter(fw);
                bw.write("Contraseña: "+ contraseña+ '\n');
                bw.close();
                System.out.println("Te has registrado con éxito"+ 
                                   "Vuelve a iniciar sesión para continuar");
                System.out.println("Identifiquese por favor, ingrese usuario");
                System.out.println("Ingrese contraseña");
                //Se verifica en los archivtos txt si los datos pertencen a un usuario o a un trabajador,
                //ambos anteriormente registrados
                //*********
                
                System.out.println("Bienvenido a su tienda favorita de música,¿Qué acción desea realizar");
                //desgloce de menu para el usuario
                
            }
            else{ System.out.println("Gracias por su visita, vuelva pronto");
                  return;}
            
        }
        catch(NumberFormatException resp){
            System.out.println("El valor ingresado no es válido, vuelva a intentarlo más tarde");
        }
       

        
    }
    
}
