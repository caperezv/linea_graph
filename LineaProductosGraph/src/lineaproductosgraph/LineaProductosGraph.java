/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lineaproductosgraph;

import com.uniandes.graph.busquedas.BusquedaInterface;
import com.uniandes.graph.busquedas.FabricaBusquedas;
import com.uniandes.graph.elementos.ElementosInterface;
import com.uniandes.graph.elementos.FabricaElementos;

/**
 *
 * @author Camilo Andres PV
 */
public class LineaProductosGraph {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        BusquedaInterface busquedaInterface = new FabricaBusquedas().getBusqueda("tipo nusqueda");
        busquedaInterface.BusquedaGRAPH();
       
        ElementosInterface elementosInterface = new FabricaElementos().getElemento("tipo elemnto");
        elementosInterface.agregar();
    }
    
}
