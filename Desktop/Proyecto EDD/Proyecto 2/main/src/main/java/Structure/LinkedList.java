/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Structure;

/**
 *
 * @author eduardopinzon
 */
public class LinkedList {
    
    Nodo primero;
    int tamano;
    
    
    public LinkedList () {
        this.primero = null;
        this.tamano = 0;
        
}
    
    public void InsertarPrimero (int dato) {
        if (this.primero == null){
            this.primero = new Nodo(dato);
           
        } else {
            Nodo nuevo = new Nodo(dato);
            nuevo.sig = this.primero;
            this.primero = nuevo;
        } 
    }
    
    public void InsertarFinal (int dato) {
         if (this.primero == null){
            this.primero = new Nodo(dato);
           
        } else{
            Nodo aux = this.primero;
            while(aux.sig != null){
                aux = aux.sig;
            }
            Nodo nuevo = new Nodo(dato);
            aux.sig = nuevo;
         }
    }
    
    public void Eliminar (int dato) {
        if(this.primero.dato == dato){
            this.primero = this.primero.sig;
        }
        else{
            Nodo aux = this.primero;
            while(aux.sig.dato != dato){
                aux = aux.sig;
            }
            aux.sig = aux.sig.sig;
                
                }
    }
}
