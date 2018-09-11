/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jajaja;

/**
 *
 * @author CETECOM
 */
public class Jajaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mamagiovanni;
        String comida;
        
        mamagiovanni = "Vilma";
        comida = "pene del Gerald";
        
        System.out.println(comer(mamagiovanni, comida));
        
        
        
    }
    public static String comer(String nombreZorra, String Comida){
        return nombreZorra +" se está comiendo un " + Comida;
    }
    
}
