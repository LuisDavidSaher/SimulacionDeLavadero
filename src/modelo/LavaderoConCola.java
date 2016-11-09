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
public class LavaderoConCola extends Lavadero{

    public LavaderoConCola() {
        super("Lavadero Con Cola");
    }

    @Override
    public void atender(ArrayList<Cliente> clientes) {
        int time = 0;
        double ingreso=0, perdida=0; //auxiliares
        for(int i=0; i<clientes.size(); i++){
            if(((clientes.get(i).getServicio()+time)<300)&&(time<=300)){//si el servicio no excede le tiempo limite y no se ha llegado al tiempo limite
                time+=clientes.get(i).getServicio();
                ingreso+=clientes.get(i).costo();
                reporte+="Cliente[LLegada: "+clientes.get(i).getLlegada()+" Servicio : " +clientes.get(i).getServicio()+"min/"+clientes.get(i).costo()+"] Atendido \n";
            }else{
                perdida+=clientes.get(i).costo();
                reporte+="Cliente[LLegada: "+clientes.get(i).getLlegada()+" Servicio : " +clientes.get(i).getServicio()+"min/"+clientes.get(i).costo()+"] Rechazado \n";
            }
        }
        inv.addRegistro(ingreso, perdida);
    }
    
    
}
