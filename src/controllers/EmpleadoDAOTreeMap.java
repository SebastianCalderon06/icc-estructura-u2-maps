package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
    private Map<Integer, Empleado> empleados;

    public EmpleadoDAOTreeMap() {
        empleados = new TreeMap<>();  // Usamos un TreeMap con el ID del empleado como clave
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);  // Usamos el ID como clave
    }

    @Override
    public void remove(int id) {
        empleados.remove(id);  // Removemos un empleado por ID
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados ordenados por ID:");
            for (Empleado empleado : empleados.values()) {  // Iteramos sobre los valores del mapa
                System.out.println(empleado);  // Imprime cada empleado
            }
        }
    }
}