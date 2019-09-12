/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formulario;

/**
 *
 * @author Hernando
 */
public class Formulas {
    
     public Formulas(){
        
    }
    
    public float nominalAnual(float ip, float periodos){
        return ip*periodos;
    }
    
    public float periodicoEA(float ea,float dias){
        float a = (float) Math.pow((1+ea),(dias/360));
        return a-1;
    }
    
    public float periodicoNA(float na, float periodos){
        return na/periodos;
    }
    
    public float efectivoAnual(float ip, float dias){
        float a = (float) Math.pow((1+ip), (360/dias));
        return a-1;
    }
    
    public float cuotaFija(float ip, float n, float p){
        float i = (float) Math.pow((1+ip),n);
        System.out.println("pow float: " + i);
        System.out.println("otro: " + (float)(p*((i*ip)/(i-1))));
        return p*((i*ip)/(i-1));
    }
    
}
