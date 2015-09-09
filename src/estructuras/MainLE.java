/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package packageListaEnlazada;




public class MainLE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //tipodato  atributo
        ListaEnlazada oLE = new ListaEnlazada();
        
        oLE.InsertaxInicio(10);
        oLE.InsertaxInicio(20);
        oLE.InsertaxInicio(30);
        oLE.InsertaxInicio(40);
        
        System.out.println(oLE.muestraLE());
        
        oLE.insertaxFinal(50);
        oLE.insertaxFinal(60);
        oLE.insertaxFinal(70);
        
        System.out.println(oLE.muestraLE());
    }
    
}
