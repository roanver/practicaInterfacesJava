package com.automotora;

import java.util.List;

public interface VehiculoCRUD {


    void guardar(Vehiculo vehiculo);

    List<Vehiculo> mostrar();

    void eliminar();


}
