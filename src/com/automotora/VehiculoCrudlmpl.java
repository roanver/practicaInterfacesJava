package com.automotora;

import java.util.ArrayList;
import java.util.List;

public class VehiculoCrudlmpl implements VehiculoCRUD{

    List<Vehiculo> autos = new ArrayList<>();
    @Override
    public void guardar(Vehiculo vehiculo ) {

        autos.add(vehiculo);
    }

    @Override
    public List<Vehiculo> mostrar() {
        return autos;
    }

    @Override
    public void eliminar() {

        autos.clear();
    }
}
