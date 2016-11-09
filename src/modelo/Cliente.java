/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Luis David SAHER
 */
public class Cliente {
    private int tLlegada;
    private int tServicio;

    public Cliente(int llegada, int servicio) {
        this.tLlegada = llegada;
        this.tServicio = servicio;
    }
    
    public Cliente(){
        
    }

    public long getLlegada() {
        return tLlegada;
    }

    public void setLlegada(int llegada) {
        this.tLlegada = llegada;
    }

    public int getServicio() {
        return tServicio;
    }

    public void setServicio(int servicio) {
        this.tServicio = servicio;
    }
    
    public double costo(){
        switch (tServicio)
        {
            case 10:
                return 5000;
            case 20:
                return 7000;
            case 30:
                return 9000;
            case 40:
                return 11000;
        }
        return 0;
    }
    
    
}
