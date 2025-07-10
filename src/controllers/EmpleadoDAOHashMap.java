package controllers;

import java.util.HashMap;
import models.Empleado;

public class EmpleadoDAOHashMap implements EmpleadoDAO {
    private HashMap<Integer, Empleado> empleados;  // Usamos un HashMap con el ID del empleado como clave

    public EmpleadoDAOHashMap() {
        empleados = new HashMap<>(); // Aseguramos que el HashMap se inicialice en el constructor
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado.getId(), empleado);  // Usamos el ID como clave
    }

    @Override
    public void remove(int id) {
        empleados.remove(id);  // Eliminamos un empleado por ID
    }

    @Override
    public void list() {
        if (empleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("Lista de empleados:");
            for (Empleado empleado : empleados.values()) {  // Iteramos sobre los valores del mapa
                System.out.println(empleado);  // Imprime cada empleado
            }
        }
    }
}