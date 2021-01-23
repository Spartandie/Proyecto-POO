/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseDatos;

import java.util.Scanner;
/**
 *Un objeto que simula el Login de los usuarios que accedan a la tiendita
 * @author David Martinez
 */
public class Users {
    //Es una contraseña de caracteres
    String passwordString;
    //Es el nombre del usuario
    String user;
    
    //Los siguientes booleans nos serviran para idendificar que tipo de usuario es
    boolean client = false;
    boolean vendedor = false;
    boolean gerente = false;

    
    /**
     * Constructor con parametros declarados.
     * @param user Nombre del usuario con el que se esta registrando.
     * @param  passwordString Constraseña de todo tipo de caracteres.
     * @param client Booleano encargado de indicar si es un cliente.
     * @param vendedor Booleano encargado de indicar si es un vendedor.
     * @param gerente Booleano encargado de indicar si es un gerente.
     * 
     */
    public Users(String user, String passwordString, boolean client, boolean vendedor, boolean gerente ) {
        
        this.passwordString = passwordString;
        this.user = user;
        this.client = client;
        this.vendedor = vendedor;
        this.gerente = gerente;
    }

    public Users() {
    }

    public String getPasswordString() {
        return passwordString;
    }

    public void setPasswordString(String passwordString) {
        this.passwordString = passwordString;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isClient() {
        return client;
    }

    public void setClient(boolean client) {
        this.client = client;
    }

    public boolean isVendedor() {
        return vendedor;
    }

    public void setVendedor(boolean vendedor) {
        this.vendedor = vendedor;
    }

    public boolean isGerente() {
        return gerente;
    }

    public void setGerente(boolean gerente) {
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

    @Override
    public String toString() {
        return "Users{" + "passwordString=" + passwordString + ", user=" + user + ", client=" + client + ", vendedor=" + vendedor + ", gerente=" + gerente + '}';
    }
    
    
    
}