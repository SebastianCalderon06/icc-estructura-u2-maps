package controllers;
import java.util.TreeMap;

import models.Empleado;

public class EmpleadoDAOTreeMap implements EmpleadoDAO {
     private TreeMap<Empleado,Empleado> empleados;

     

    public EmpleadoDAOTreeMap() {
    }

    public EmpleadoDAOTreeMap(TreeMap<Empleado, Empleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public void add(Empleado empleado) {
        empleados.put(empleado, empleado);
    
    }

    @Override
    public void remove(int id) {
        Empleado emp = new Empleado(id);
       empleados.remove(id);

    }

    @Override
    public void list() {
       if (empleados.isEmpty()) {
        System.out.println("No hay empleados registrados.");
    } else {
        System.out.println("Lista de empleados:");
        for (Empleado empleado : empleados.values()) {
            System.out.println(empleado);
        }
   }
}

}
