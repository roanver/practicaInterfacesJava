package com.automotora;

public class Vehiculo {

    String marca;
    String patente;
    int nPuertas;
    String color;

public Vehiculo(){}

    public Vehiculo(String marca, String patente, int nPuertas, String color) {
        this.marca = marca;
        this.patente = patente;
        this.nPuertas = nPuertas;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "marca='" + marca + '\'' +
                ", patente='" + patente + '\'' +
                ", nPuertas=" + nPuertas +
                ", color='" + color + '\'' +
                '}';
    }
}
