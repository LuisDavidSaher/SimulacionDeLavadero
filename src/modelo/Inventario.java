/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Luis David SAHER
 */
public class Inventario {
    
   private ArrayList<Registro> registros;

    public Inventario(){
        registros = new ArrayList<Registro>();
    }

    public ArrayList getRegistros() {
        return registros;
    }

    public void setRegistros(ArrayList registros) {
        this.registros = registros;
    }
    
    public void addRegistro(double ingreso, double perdida){
        registros.add(new Registro(ingreso,perdida));
    }
    
    public double perdidaTotal(){
        double perdida=0;
        if(!registros.isEmpty()){
            for(int i=0; i<registros.size(); i++){
                perdida+=registros.get(i).getPerdida();
            }  
        }        
        return perdida;
    }
    
    public double ingresoTotal(){
        double ingreso=0;
        if(!registros.isEmpty()){
            for(int i=0; i<registros.size(); i++){
                ingreso+=registros.get(i).getIngreso();
            }  
        }        
        return ingreso;
    }
    
    public double diferenciaTotal(){
        return ingresoTotal()-perdidaTotal(); 
    }
   
}
