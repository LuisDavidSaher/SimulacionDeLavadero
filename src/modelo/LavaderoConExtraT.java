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
public class LavaderoConExtraT extends Lavadero{

    public LavaderoConExtraT() {
        super("Lavadero Con Extra Tiempo");
    }

    @Override
    public void atender(ArrayList<Cliente> clientes) {
        int time = 0;
        double ingreso=0, perdida=0; //auxiliares
        for(int i=0; i<clientes.size(); i++){
            if(((clientes.get(i).getServicio()+time)<300)&&(time<=480)){//si no se ha superado el tiempo totl de servicio
                ingreso+=clientes.get(i).costo();
                time+=clientes.get(i).getServicio();
                reporte+="Cliente[LLegada: "+clientes.get(i).getLlegada()+" Servicio : " +clientes.get(i).getServicio()+"min/"+clientes.get(i).costo()+"] Atendido \n";
                if(time>300){//si se encuentra en tiempo extra
                    perdida+=clientes.get(i).costo();                                        
                }
            }else{
                perdida+=clientes.get(i).costo();
                reporte+="Cliente[LLegada: "+clientes.get(i).getLlegada()+" Servicio : " +clientes.get(i).getServicio()+"min/"+clientes.get(i).costo()+"] Rechazado \n";
            }
        }
        inv.addRegistro(ingreso, perdida);
    }
    
}
