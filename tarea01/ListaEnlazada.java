/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import sabado_set05.*;

/**
 *
 * @author Alumnos
 */
public class ListaEnlazada {
    private Nodo inicio, nuevo, p, q; //punteros del Nodo
    
    
    public void InsertaxInicio (int valor){
        nuevo = new Nodo();
        nuevo.setInfo(valor);
        if (inicio == null)
            inicio = nuevo;
        else {
            nuevo.setSgte(inicio);
            inicio = nuevo;
        }
    }
    
    
    public void insertaxFinal (int valor){
        nuevo = new Nodo();
        nuevo.setInfo(valor);
        
        if (inicio == null)
            inicio = nuevo;
        else {
            p = inicio;
            
            while (p.getSgte() != null){
                p = p.getSgte();
            }
                p.setSgte(nuevo);
        }
    }
     
    
    public String muestraLE(){
       String cadena = "";
       
       if (inicio != null){
           p = inicio;
           
           while (p != null){
               cadena = cadena + p.getInfo()+" ";
               p = p.getSgte();
           }
        }
       
    return cadena;
    }
    
    public void CrearLista(int N){
        
        int numero = 0;
        
        while (N>0){
           numero = N%10;
           InsertaxInicio(numero);
           N=N/10;
       }
    }
    
    public void EliminaPares(){
           
        while (inicio.getInfo()%2==0 && inicio.getSgte() != null) {
            
            inicio = inicio.getSgte();
        }
        
        if (inicio.getInfo()%2==0){
            inicio = null;
            return;
        }
        p = inicio; //valor correcto
        q = inicio.getSgte(); //indice
        
        while (q != null){
            if (q.getInfo()%2==0){
                q = q.getSgte();
            }
            else {
                //aca impar
                p.setSgte(q);
                p=q;
                q = q.getSgte();

                    
            }
        }
        p.setSgte(null);
        
    }
    
}
