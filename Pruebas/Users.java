/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMain;

import java.util.Scanner;
/**
 *Un objeto que simula el Login de los usuarios que accedan a la tiendita
 * @author David Martinez
 */
public class Users {
    //Es la contraseña de numeros
    int password;
    //Es una contraseña de caracteres
    String passwordString;
    //Es el nombre del usuario
    String user;
    
    //Los siguientes booleans nos serviran para idendificar que tipo de usuario es
    boolean client = false;
    boolean vendedor = false;
    boolean gerente = false;
    
    /**
     * Constructor de User general, sirve para registrarse en nuestra tiendita 
     * 
     */
    public Users() {
        //Variable de tipo int encargada de guardar el numero que dijite el usuario para despues
        int opc;
        
        //Objeto de tipo Scanner encargado de rescatar los datos que digite el usuario
        Scanner in = new Scanner(System.in);
        System.out.println(" ======={ Register }=======");
        
        System.out.println("Bienvenido por favor ingrese los datos que se le soliciten a continuación");
        System.out.println("=> Nombre de Usuario: ");
        this.user = in.nextLine();
        System.out.println("=> Contraseña: ");
        this.passwordString = in.nextLine();
        System.out.println("Escoja una de las siguientes opciones del tipo de usuario");
        System.out.println("1)Cliente \n2)Vendedor \n3)Gerente\n-1)Cancelar");
        opc = in.nextInt();
        if(opc == -1 ){
            System.out.println("==> !!Se a cancelado el registro¡¡\nTenga un Excelente dia");
        }else{
            switch( opc ){
                case 1:
                    this.client = true;
                break;
                case 2:
                    this.vendedor = true;
                break;
                case 3:
                    this.gerente = true;
                break;
            }
            System.out.println("Se a registrado correctamente\n==>Bienvenido " + this.user );
        }
    }
    
    /**
     * Constructor con parametros declarados.
     * @param user Nombre del usuario con el que se esta registrando.
     * @param password Contraseña de solo numeros.
     * @param  passwordString Constraseña de todo tipo de caracteres.
     * @param client Booleano encargado de indicar si es un cliente.
     * @param vendedor Booleano encargado de indicar si es un vendedor.
     * @param gerente Booleano encargado de indicar si es un gerente.
     * 
     */
    public Users(String user, int password, String passwordString, boolean client, boolean vendedor, boolean gerente ) {
        this.password = password;
        this.passwordString = passwordString;
        this.user = user;
        this.client = client;
        this.vendedor = vendedor;
        this.gerente = gerente;
    }
    
    /**
     * Esta funcion es encargada de la parte del codigo para que acceda el usuario a nuestra tiendita.
     */
    public void Ingresar( ){
        Scanner in = new Scanner(System.in);
        String nombre;
        String contraseña;
        boolean succes = false;
        
        System.out.println(" ========={ Login }========= ");
        
        while( succes == false ){
            System.out.println("Nombre de usuario: ");
            nombre = in.nextLine();
        
            System.out.println("Contraseña: ");
            contraseña = in.nextLine();
            if( nombre.equals(user) && contraseña.equals(passwordString) ){
                System.out.println("Bienvenido " + this.user + ", que decea hacer a continuación ");
                succes = true;
            }else{
                System.out.println("==> !!Error¡¡, El usuario o la contraseña son incorrectos, Trate de ingresar de nuevo");
            }
        }
    }
    
    
    
}
