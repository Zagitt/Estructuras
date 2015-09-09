/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageListaEnlazada;

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
}
