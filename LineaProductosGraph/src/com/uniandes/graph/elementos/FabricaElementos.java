/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uniandes.graph.elementos;

import com.uniandes.graph.busquedas.*;

/**
 *
 * @author Camilo Andres PV
 */
public class FabricaElementos extends ElementosAbstract {

    @Override
    public ElementosInterface getElemento(String tipoElemento) {

        switch (tipoElemento) {
            case "ARCO":
                return new ElementoArco();
            case "NODO":
                return new ElementoNodo();
            default:
                return null;
        }
    }
}
