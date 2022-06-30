/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete02.Automovil;

/**
 *
 * @author JonathanCoronel
 */
public class AutomovilGasolina extends Automovil {

    private double numGalones;
    private double costoGalon;
    private double iva;

    public AutomovilGasolina(String nombrePro, String pla, double numGa, double costoGa) {
        super(nombrePro, pla);
        numGalones = numGa;
        costoGalon = costoGa;
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
                + "Costo de galon: %.1f\nIva: %.2f \nValor a Cancelar: %.1f\n",
                nombrePropietario, placa, numGalones,
                costoGalon, iva, valorCancelar);
        return cadena;
    }

}
