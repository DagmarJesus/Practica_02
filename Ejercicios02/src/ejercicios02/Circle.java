/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios02;
public class Circle {
    private double radio;
    private double diametro;
    private double area;
    public Circle(){
        setRadio(); }
    public void setRadio(){
        this.radio = 1;
        diametro = 2 * radio;
        area = Math.PI * radio * Math.pow(radio, 2);
    }
    public double getRadio(){
	return radio;
    }
    public double getDiametro(){
	return diametro;
    }
    public double getArea(){
        return area;

    }
}