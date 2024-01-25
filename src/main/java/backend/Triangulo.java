/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author david
 */
public class Triangulo extends Figura {
    private double base;
    private double altura;

    
    
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double calcularArea(){
        double area=(this.altura*this.base)/2;
        super.setArea(area);
        return area;
    }
    
    
    
    
}
