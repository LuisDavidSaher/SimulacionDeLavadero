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
public abstract class Lavadero {
    
    protected String tipo;
    protected String reporte;
    protected Inventario inv;

    
    public Lavadero(String tipo){
        this.inv = new Inventario();
        this.reporte="";
        this.tipo = tipo;
    }
    
    public void clean(){
        this.reporte = "";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getReporte() {
        return reporte;
    }

    public void setReporte(String reporte) {
        this.reporte = reporte;
    }
    
    public abstract void atender(ArrayList<Cliente> clientes);
    
}
