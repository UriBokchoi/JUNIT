/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;


/**
 *
 * @author Raúl
 * Classe de funcions pròpies utils.
 */
public class MyUtils {
   


/**
 *
 * @param cadena Strint cadena que es vol invertir
 * @return cadena invertida (null per cadenes nulls).
 */
public static String inverteix(String cadena) {
    if (cadena == null) {
        return null;
    }

    String resultado = "";

    for (int i = cadena.length() - 1; i >= 0; i--) {
        resultado += cadena.charAt(i);
    }

    return resultado;
}

public static int edat(int day, int month, int year) {
        LocalDate currentDate = LocalDate.now();

        LocalDate birthDate;
        try {
            birthDate = LocalDate.of(year, month, day);
        } catch (DateTimeException e) {
            return -2;
        }

        int age = Period.between(birthDate, currentDate).getYears();

        if (age > 150) {
            return -1;
        }

        return age;
    }

    
       
    



public static double factorial(double numero) {
        // Verificar si el número es negativo
        if (numero < 0) {
            return -1; // Si el número es negativo, retornar -1
        }

        // Caso base: factorial de 0 es 1
        if (numero == 0) {
            return 1;
        }

        // Calcular el factorial recursivamente para números positivos
        return numero * factorial(numero - 1);
    }

    public static void main(String[] args) {
        // Ejemplo de uso del método factorial
        double resultado = factorial(5);
        System.out.println("Factorial de 5: " + resultado);
    }
}
