/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniandes.graph.busquedas;

/**
 *
 * @author Camilo Andres PV
 */
public class FabricaBusquedas extends BusquedaAbstract {

    @Override
   public  BusquedaInterface getBusqueda(String tipoBusqueda) {

        switch (tipoBusqueda) {
            case "BFS":
                return new BusquedaBFS();
            case "DFS":
                return new BusquedaDFS();
            default:
                return null;
        }

    }
}
