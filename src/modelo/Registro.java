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
public class Registro {
    private double ingreso;
    private double perdida;

    public Registro(double ingreso, double predida) {
        this.ingreso = ingreso;
        this.perdida = predida;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getPerdida() {
        return perdida;
    }

    public void setPerdida(double perdida) {
        this.perdida = perdida;
    }
    
    public double diferencia(){
        return ingreso-perdida;
    }
    
}
