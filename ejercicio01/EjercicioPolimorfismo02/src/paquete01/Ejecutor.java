/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;

import paquete03.AutomovilGasolina;
import paquete04.AutomovilDiesel;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        AutomovilGasolina auto1 = new AutomovilGasolina("Jonathan","LBB0711",20,3);
        auto1.establecerIva();
        auto1.calcularValorCancelar();
        System.out.println(auto1);
        AutomovilDiesel auto2 = new AutomovilDiesel();
        auto2.establecerNombrePropietario("Pablo");
        auto2.establecerPlaca("HSD4311");
        auto2.establecerNumLitros(20);
        auto2.establecerCostoLitro(2);
        auto2.establecerDescuento();
        auto2.calcularValorCancelar();

        
    }
}
