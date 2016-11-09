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
public class LavaderoSinCola extends Lavadero{

    public LavaderoSinCola() {
        super("Lavadero Sin Cola");
    }
    
    @Override
    public void atender(ArrayList<Cliente> clientes) {
        int time = 0;
        double ingreso=0, perdida=0; //auxiliares
        for(int i=0; i<clientes.size(); i++){
            
                if(clientes.get(i).getLlegada()>=time){//si llega despues de terminado el ultimo servicio
                    time+=clientes.get(i).getLlegada()+clientes.get(i).getServicio();
                    ingreso+=clientes.get(i).costo();
                    reporte+="Cliente[LLegada: "+clientes.get(i).getLlegada()+" Servicio : " +clientes.get(i).getServicio()+"min/"+clientes.get(i).costo()+"] Atendido \n";
                }else if(clientes.get(i).getLlegada()<=time){//llego durante un servicio
                    perdida+=clientes.get(i).costo();
                    reporte+="Cliente[LLegada: "+clientes.get(i).getLlegada()+" Servicio : " +clientes.get(i).getServicio()+"min/"+clientes.get(i).costo()+"] Rechazado \n";
                }
        }
        inv.addRegistro(ingreso, perdida);
    }
    
}
