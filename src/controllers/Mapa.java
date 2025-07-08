package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {
    public Mapa() {
    }

    public void ejemploConHashMap(){
        HashMap<String, String> capitales = new HashMap();
        capitales.put("Ecuador", "Quito");
        capitales.put("Perú", "Lima");
        capitales.put("Colombia", "Bogotá");
        System.out.println("Mapa de Capitales:");
        for (String pais : capitales.keySet()){
            System.out.println("País: " + pais + ", Capital: " + capitales.get(pais));
        }

        HashMap<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(2, new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester"));
        System.out.println("Mapa de Empleados:");

        for (Map.Entry<Integer, Empleado> entry : empleados.entrySet()){
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        HashMap<Empleado, Integer> empleadosDos = new HashMap<>();

        Empleado emp1 = new Empleado(1,"Ana", "Dev");
        Empleado emp2 = new Empleado(2,"Pedro", "Dev");
        Empleado emp3 = new Empleado(3,"Ana", "Dev");
        Empleado emp4 = new Empleado(3,"Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);
        System.out.println("Mapa de EmpleadosDos:");

        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }


    }

    public void ejemploConLinkedHashMap(){
        LinkedHashMap<String , Integer> productos = new LinkedHashMap<>();
        productos.put("Pan", 15);
        productos.put("Leche", 12);
        productos.put("Agua", 97);
        productos.put("Television", 1014);
        productos.put("Papas", 4);
        System.out.println("Mapa de Productos:");
        for (String objeto : productos.keySet()){
            System.out.println("Objeto: " + objeto + ", Cantidad: " + productos.get(objeto));
        }




    }

    public void ejemploConTreeMap(){
        TreeMap<Integer , String> personas = new TreeMap<>();
        personas.put(10, "Juan");
        personas.put(11, "Maria");
        personas.put(12, "Joshua");
        personas.put(13, "Marco");
        personas.put(15, "Sofia");
        System.out.println("Mapa de Personas:");
        for (int num : personas.keySet()){
            System.out.println("Id: " + num + ", Nombre: " + personas.get(num));
        }

        TreeMap<Empleado, Integer> empleadosDos = new TreeMap<>();
        Empleado emp1 = new Empleado(1,"Ana", "Dev");
        Empleado emp2 = new Empleado(2,"Pedro", "Dev");
        Empleado emp3 = new Empleado(3,"Ana", "Dev");
        Empleado emp4 = new Empleado(3,"Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);
        System.out.println("Mapa de EmpleadosDos:");

        for (Map.Entry<Empleado, Integer> entry : empleadosDos.entrySet()){
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

    }
}
