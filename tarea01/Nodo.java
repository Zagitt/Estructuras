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
public class Nodo {
    
    private int info;
    private Nodo sgte;

    public int getInfo() {
        return info;
    }

   public void setInfo(int info) {
        this.info = info;
    }

    public Nodo getSgte() {
        return sgte;
    }

    public void setSgte(Nodo sgte) {
        this.sgte = sgte;
    }
    
}
