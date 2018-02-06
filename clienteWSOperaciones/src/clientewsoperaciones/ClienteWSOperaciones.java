/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientewsoperaciones;

import java.util.Scanner;

/**
 *
 * @author entrar
 */
public class ClienteWSOperaciones {

    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca el primer número: ");
    int a = sc.nextInt();
    System.out.println("Introduzca el segundo número: ");
    int b = sc.nextInt();
    System.out.println("Números " + a + " y "+b); 
    System.out.println("Suma: " + sumar(a,b)); 
    System.out.println("Resta: " + restar(a,b));
    System.out.println("Multiplicación: " + multiplicar(a,b));
    System.out.println("División: " + dividir(a,b)); 
    
    }

    private static int sumar(int in1, int in2) {
        clientewsoperaciones.Calcular_Service service = new clientewsoperaciones.Calcular_Service();
        clientewsoperaciones.Calcular port = service.getCalcularPort();
        return port.sumar(in1, in2);
    }

    private static int restar(int in1, int in2) {
        clientewsoperaciones.Calcular_Service service = new clientewsoperaciones.Calcular_Service();
        clientewsoperaciones.Calcular port = service.getCalcularPort();
        return port.restar(in1, in2);
    }

    private static int multiplicar(int in1, int in2) {
        clientewsoperaciones.Calcular_Service service = new clientewsoperaciones.Calcular_Service();
        clientewsoperaciones.Calcular port = service.getCalcularPort();
        return port.multiplicar(in1, in2);
    }

    private static int dividir(int in1, int in2) {
        clientewsoperaciones.Calcular_Service service = new clientewsoperaciones.Calcular_Service();
        clientewsoperaciones.Calcular port = service.getCalcularPort();
        return port.dividir(in1, in2);
    }

   
    
}
