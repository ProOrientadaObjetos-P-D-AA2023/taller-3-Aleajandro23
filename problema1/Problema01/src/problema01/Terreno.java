/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema01;

/**
 *
 * @author UTPL
 */
public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public double getCosto_terreno() {
        return costo_terreno;
    }

    public void setCosto_terreno(double costo_terreno) {
        this.costo_terreno = costo_terreno;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getValorMetroCuadrado() {
        return valorMetroCuadrado;
    }

    public void setValorMetroCuadrado(double valorMetroCuadrado) {
        this.valorMetroCuadrado = valorMetroCuadrado;
    }
    
    public void calcularArea(){
    
    area = largo * ancho;
    
    }
     public void costoTerreno(){
    
    costo_terreno = valorMetroCuadrado * area;
    
    }
     public double obtenerCostoTerreno(){
    
    return costo_terreno;
    } 
     
    public double obtenerArea(){
    
    return area;
    }
    
}

        