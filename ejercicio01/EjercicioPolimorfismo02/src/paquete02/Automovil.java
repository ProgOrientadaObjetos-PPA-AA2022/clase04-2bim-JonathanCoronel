/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete02;

/**
 *
 * @author JonathanCoronel
 */
public abstract class Automovil {

    protected String nombrePropietario;
    protected String placa;
    protected double valorCancelar;

    public Automovil(String nombrePro, String pla) {
        nombrePropietario = nombrePro;
        placa = pla;
    }

    public void establecerNombrePropietario(String nom) {
        nombrePropietario = nom;
    }

    public void establecerPlaca(String pla) {
        placa = pla;
    }

    public abstract void calcularValorCancelar();

    public String obtenerNombrePropietario() {
        return nombrePropietario;
    }

    public String obetnerPlaca() {
        return placa;
    }

    public double obtenerValorCancelar() {
        return valorCancelar;
    }

}
