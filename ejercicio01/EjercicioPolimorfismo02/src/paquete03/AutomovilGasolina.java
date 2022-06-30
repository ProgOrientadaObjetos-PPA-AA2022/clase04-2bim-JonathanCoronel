/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author reroes
 */
public class AutomovilGasolina extends Automovil {

    private double numGalones;
    private double costoGalon;
    private double iva;

    public AutomovilGasolina(double numGa, double costoGa, double iv, String nombrePro, String pla) {
        super(nombrePro, pla);
        numGalones = numGa;
        costoGalon = costoGa;
        iva = iv;
    }

    public void establecerNumGalones(double numg) {
        numGalones = numg;
    }

    public void establecerCostoGalon(double costoG) {
        costoGalon = costoG;
    }

    public void establecerIva() {
        iva = ((costoGalon * numGalones) * 10) / 100;
    }

    public double obtenerNumgalones() {
        return numGalones;
    }

    public double obtenerCostoGalon() {
        return costoGalon;
    }

    public double obtenerIva() {
        return iva;
    }

    @Override
    public void calcularValorCancelar() {
        valorCancelar = (costoGalon * numGalones) + iva;
    }

    @Override
    public String toString() {
        String cadena = String.format("Auto de Gasolina\nPropietario: "
                + "%s\nMatricula: %s\nNumero de Galones: %.0f\n"
                + "Costo de galon: %.1f\nIva: %d \nValor a Cancelar",
                nombrePropietario, placa, numGalones,
                costoGalon, costoGalon, iva, valorCancelar);
        return cadena;
    }

}
