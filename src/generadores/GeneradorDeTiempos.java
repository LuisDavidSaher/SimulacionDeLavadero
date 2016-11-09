/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package generadores;

/**
 *
 * @author Luis David SAHER
 */
public class GeneradorDeTiempos {
    private NumerosAleatorios llegada;
    private NumerosAleatorios servicio;
    
    public GeneradorDeTiempos(){
        this.llegada = new NumerosAleatorios();
        this.servicio = new NumerosAleatorios();
    }
    
    public int generarLlegada(){
        
        float t = llegada.optener();
        
        if(t<0.05){
            return 5;
        }else if(t<0.1){
            return 10;
        }else if(t<0.2){
            return 15;
        }else if(t<0.3){
            return 20;
        }else if(t<0.6){
            return 25;
        }else if(t<0.8){
            return 30;
        }else if(t<0.95){
            return 35;
        }else if(t<1){
            return 40;
        }
        return 0;
    }
    
    public int generaTServicio(){
        
        float t = servicio.optener();
        
        if(t<0.15){
            return 10;
        }else if(t<0.4){
            return 20;
        }else if(t<0.8){
            return 30;
        }else if(t<1){
            return 40;
        }
        return 0;
    }
}
