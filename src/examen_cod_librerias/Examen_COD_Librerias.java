/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_cod_librerias;

/**
 *
 * @author artur
 */
public class Examen_COD_Librerias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos m = new Metodos();
        System.out.println(m.isLeapYear(400));
        System.out.println(m.isLeapYear(100));
        System.out.println(m.isLeapYear(4));
    }
    
}
