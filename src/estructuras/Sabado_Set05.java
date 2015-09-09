/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sabado_set05;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumnos
 */
public class Sabado_Set05 {

    public static int factorial(int num){
        int fact=1;
        for (int i=1; i<=num;i++)
            fact = fact * i;
        return fact;
    }
    
    public static double[] generaSerie(double B[], int X, int N ){
        for (int i = 0; i<=N; i++){
            B[i]= Math.pow(X,i)/factorial(i);
        }
        return B;
    }
    
    public static double sumaSerie(double B[]){
        int N = B.length;
        double suma = 0;
        
        for (int i = 0; i < N; i++){
            suma = suma + B[i];
        }
        return suma;
    }
    
    public static String muestraSerie(double B[]){
    int N = B.length;
    String cadena = "";

    for (int i = 0; i < N; i++){
        cadena= cadena + B[i] + " ";
    }
    return cadena;
    }
    
    public static void main(String[] args) {
        
        int N = Integer.parseInt(JOptionPane.showInputDialog("Ingrese N"));
        int X = Integer.parseInt(JOptionPane.showInputDialog("Ingrese X"));
        
        double A[] = new double[N+1];
        A=generaSerie(A,X,N);
        
        System.out.println("La suma es: "+ sumaSerie(A));
        System.out.println(muestraSerie(A));
    }
    
}
