/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

import java.util.Scanner;

/**
 *
 * @author UTPL
 */
public class Ejecutor {
    
  public static void main(String[] args) {
        
        System.out.println(" COSTO DEL TERRENO ");
        Scanner entrada =new Scanner(System.in);
        
        
        double at , lt, ct , l;
        
        Terreno obj = new Terreno();
        
         System.out.println("Ingrese el costo del terreno: ");
        at =  entrada.nextDouble();
        
        obj.setAncho(at);
        
        System.out.println(" Ingrese el largo del Terreno: ");
        lt = entrada.nextDouble();
        
        obj.setLargo(lt);
        obj.calcularArea();
        
        
        System.out.println(" Ingrese el costo del metro cuadrado: ");
        ct = entrada.nextDouble();
        
        obj.setValorMetroCuadrado(ct);
        obj.costoTerreno();
        
        System.out.println("El ancho es: " + obj.getAncho());
        System.out.println("El largo es: " + obj.getLargo());
         System.out.println("El Total del Metro del caudrado es: "
                 + obj.getValorMetroCuadrado());
        System.out.println("El costo del terreno es: " + obj.getCosto_terreno());
        
        
    }
}
