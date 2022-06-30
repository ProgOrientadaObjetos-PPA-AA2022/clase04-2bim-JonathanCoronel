/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete04;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilDiesel extends Automovil {

    private double numLitros;
    private double costoLitro;
    private double descuento;

    public void establecerNumLitros(double numL) {
        numLitros = numL;
    }

    public void establecerCostoLitro(double costoL) {
        costoLitro = costoL;
    }

    public void establecerDescuento() {
        descuento = (valorCancelar * 10) / 100;
    }

    public double obtenerNumlitros() {
        return numLitros;
    }

    public double obtenerCostoLitro() {
        return numLitros;
    }

    public double obtenerDescuento() {
        return descuento;
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = (costoLitro * descuento);
    }

    @Override
    public String toString() {
        String cadena = String.format("Auto de Gasolina\nPropietario: "
                + "%s\nMatricula: %s\nNumero de Litros %.0f\n"
                + "Costo de Litro: %.1f\nDescuento: %d \nValor a Cancelar",
                nombrePropietario, placa, numLitros,
                costoLitro, descuento, valorCancelar);
        return cadena;
    }

}
