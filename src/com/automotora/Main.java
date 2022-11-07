package com.automotora;


import java.util.List;

public class Main {

    public static void main(String[] args) {

        VehiculoCrudlmpl autocrud = new VehiculoCrudlmpl();

        Vehiculo vehiculo = new Vehiculo("Toyota", "JDHG98", 4, "Azul");

        autocrud.guardar(vehiculo);


        List<Vehiculo> autito = autocrud.mostrar();

        System.out.println(autito);

        autocrud.eliminar();

        System.out.println("Despues de metodo eliminar" + autito);

    }
}
