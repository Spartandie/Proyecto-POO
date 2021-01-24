/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajadores;

import Trabajadores.reproductores.CD_PLAYER;
import Trabajadores.reproductores.DVD_PLAYER;
import java.io.FileOutputStream;
import java.io.IOException;
import productos.Pnode;

/**
 *
 * @author spart
 */
public abstract class Trabajador {
    
    
    private String nombreTrabajador;

    public String getNombreTrabajador() {
        return nombreTrabajador;
    }

    public void setNombreTrabajador(String nombreTrabajador) {
        this.nombreTrabajador = nombreTrabajador;
    }
    public abstract boolean add_product(Gerente l, Pnode n);
    public abstract boolean is_in_list(Gerente l, Pnode n); 
    public abstract Pnode search_node(Gerente l, Vendedor c, CD_PLAYER p1, DVD_PLAYER p2, int mode);
    public abstract void del_list(Gerente l, Vendedor c, int mode);
    
}
