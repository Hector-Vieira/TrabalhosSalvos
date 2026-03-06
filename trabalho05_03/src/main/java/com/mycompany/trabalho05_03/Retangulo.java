/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabalho05_03;

/**
 *
 * @author hector80605
 */
public class Retangulo {
    private double largura;
    private double comprimento;
    private double area;
    private double perimetro;
    
    public void setLargura(double largura){
        this.largura = largura;
    }
    
    public double getLargura(){
        return largura;
    }
                  
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }
    
    public double getComprimento(){
        return comprimento;
    }
    
    public void setArea(double area){
        this.area = area;
    }
    
    public double getArea(){
        return area;
    }
    
    public void setPerimetro(double perimetro){
        this.perimetro = perimetro;
    }
    
    public double getPerimetro (){
        return perimetro;
    }
    
    public void CalcularArea(){
     this.area = this.comprimento * this.largura;
    }
    public void CalcularPerimetro(){
        this.perimetro = 2 * this.comprimento + 2 * this.largura;
    }
    
    public void imprimir(){
        System.out.println(
                "A area é: " + this.area +
                "O perímetro é: " + this.perimetro +
                "O comprimento é: " + this.comprimento +
                "A largura é: " + this.largura         
        );
    }
}
