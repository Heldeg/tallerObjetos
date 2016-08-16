/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tallerobjetos;

import java.util.Scanner;

/**
 *
 * @author EDER H
 */
public class TallerObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double numero1, numero2;
        System.out.print("Ingrese el primer Número: ");
        numero1 = s.nextDouble();
        System.out.println("");
        System.out.print("Ingrese el segundo Número: ");
        numero2 = s.nextDouble();
        System.out.println("");
        System.out.print("El número mayor es: ");
        if (numero1 > numero2) {
            System.out.println(numero1);
        } else {
            System.out.println(numero2);
        }
    }

}
