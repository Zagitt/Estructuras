/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea01;

import javax.swing.JOptionPane;

/**
 *
 * @author Gianni
 */

public class Tarea01 {
    
    public static void main(String[] args) {
        
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Numero:"));
        
        ListaEnlazada li = new ListaEnlazada();
        
        li.CrearLista(N);
        System.out.println(li.muestraLE());
        
        li.EliminaPares();
        System.out.println(li.muestraLE());
       
        
        
    }
    
}
