/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulacion;

import generadores.GeneradorDeTiempos;
import java.util.ArrayList;
import modelo.*;

/**
 *
 * @author Luis David SAHER
 */
public class Simulacion {
    private LavaderoConCola lavadero1;
    private LavaderoSinCola lavadero2;
    private LavaderoConExtraT lavadero3;
    private GeneradorDeTiempos generador;
    private ArrayList<Cliente> clientes;

    public Simulacion( ) {
        this.generador = new GeneradorDeTiempos();
        this.lavadero1 = new LavaderoConCola();
        this.lavadero2 = new LavaderoSinCola();
        this.lavadero3 = new LavaderoConExtraT();
        this.clientes = new ArrayList();
    }
    
    // genera el arreglo con los clientes que se recibiran en el dia
    private void generarClientes(){
        clientes.clear();//Limpiar la lista de clientes
        int time = 0;
        
        //genera los clientes para un dia
        while(time<=300){//mientras se este en horas de servicio (300Min == 5horas)
            time+=generador.generarLlegada();
            clientes.add(new Cliente(time, generador.generaTServicio()));//se crea y grega un cliente a la lista de clientes
        }
    }
    
    public void simular(int corrida){//Cada corrida es un dia
        for(int i=0; i< corrida; i++){
            generarClientes();//generar clientes del dia
            /*
            Se realiza la simulacion de cada lavadero al mismo tiempo
            con los mismos clientes para analizar el comportamiento de cada
            cada uno frente a los mismos clientes
            */
            this.lavadero1.atender(clientes);
            this.lavadero2.atender(clientes);
            this.lavadero3.atender(clientes);
        }
    }
    
    
}
