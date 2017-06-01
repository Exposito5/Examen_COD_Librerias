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
public class Metodos {
    public static boolean isLeapYear(int a) {
        if(a%4==0&&a%100!=0||a%400==0)
            return true;
        else
            return false;
    }
}
