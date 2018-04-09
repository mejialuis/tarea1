package com.example.cristiansespinoza.convertidor;

/**
 * Created by Cristian S. Espinoza on 08/04/2018.
 */

public class Unitconverter {
    public static double Celsuis2Farenheit (double f) {
        return (f-32) * 5/9;
    }
    public static double Farenheit2Celsuis (double c){
        return  (32+c*9/5);
    }
}
