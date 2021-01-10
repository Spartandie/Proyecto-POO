/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.poo;

/**
 *
 * @author spart
 */
public class Plist {
    private Pnode head;
    private Pnode tail;

    public Plist() {
    }

    
    
    
    public Plist(Pnode head, Pnode tail) {
        this.head = head;
        this.tail = tail;
    }

    public Pnode getHead() {
        return head;
    }

    public Pnode getTail() {
        return tail;
    }

    public void setHead(Pnode head) {
        this.head = head;
    }

    public void setTail(Pnode tail) {
        this.tail = tail;
    }
    
    
    public boolean is_empty(Plist l){
        if(l.getHead()==null){
            return true;
        }
        return false;
    }
    
}



