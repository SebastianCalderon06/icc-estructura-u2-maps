import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import controllers.Mapa;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {
        // Ejecutar ejemplos de uso de Mapas (HashMap, LinkedHashMap, TreeMap)
        runMapExamlpe();

        // Ejecutar ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecutar los ejercicios de sumatoria y anagramas
        runEjerccios();

        // Usando HashMap para manejar empleados
        EmpleadoDAO empleadoDAOHashMap = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoController = new EmpleadoContoller(empleadoDAOHashMap);

        // Usando TreeMap para manejar empleados
        EmpleadoDAO empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTreeMap);

        // Crear instancias de empleados
        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        // Agregar empleados usando HashMap
        empleadoController.agregarEmpleado(emp1);
        empleadoController.agregarEmpleado(emp2);
        empleadoController.agregarEmpleado(emp3);
        empleadoController.agregarEmpleado(emp4);
        empleadoController.agregarEmpleado(emp5);

        // Agregar empleados usando TreeMap
        empleadoContoller2.agregarEmpleado(emp1);
        empleadoContoller2.agregarEmpleado(emp2);
        empleadoContoller2.agregarEmpleado(emp3);
        empleadoContoller2.agregarEmpleado(emp4);
        empleadoContoller2.agregarEmpleado(emp5);

        // Listar empleados usando HashMap
        System.out.println("Empleados usando HashMap:");
        empleadoController.listarEmpleado();

        // Listar empleados usando TreeMap
        System.out.println("\nEmpleados usando TreeMap:");
        empleadoContoller2.listarEmpleado();
    }

    // Ejecuta ejemplos de Mapas (HashMap, LinkedHashMap y TreeMap)
    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    // Ejecuta el ejemplo de manejo de empleados con HashMap
    private static void runEmpleadoExample() {
        System.out.println("Ejemplo de empleados utilizando HashMap:");

        Empleado emp1 = new Empleado(1, "Juan", "Desarrollador");
        Empleado emp2 = new Empleado(2, "Maria", "Diseñadora");
        Empleado emp3 = new Empleado(3, "Carlos", "Manager");

        // Crear el DAO y controlador para manejar empleados
        EmpleadoDAO empleadoDAO = new EmpleadoDAOHashMap();
        EmpleadoContoller controller = new EmpleadoContoller(empleadoDAO);

        // Agregar empleados
        controller.agregarEmpleado(emp1);
        controller.agregarEmpleado(emp2);
        controller.agregarEmpleado(emp3);

        // Listar empleados
        controller.listarEmpleado();
    }

    // Ejecuta los ejercicios de sumatoria y anagramas
    private static void runEjerccios() {
        // Ejercicio de sumatoria
        int[] nums = {9, 2, 3, 6};
        int objetivo = 5;
        Ejercicios ejercicios = new Ejercicios();
        int[] resultado = ejercicios.sumatoriaDeDos(nums, objetivo);
        if (resultado != null) {
            System.out.println("Resultado de la sumatoria: [" + resultado[0] + ", " + resultado[1] + "]");
        } else {
            System.out.println("No se encontró una solución para la sumatoria.");
        }

        // Ejercicio de anagramas
        String palabra1 = "roma";
        String palabra2 = "amor";
        boolean sonAnagramas = ejercicios.sonAnagramas(palabra1, palabra2);
        System.out.println("¿Son anagramas? " + sonAnagramas);
    }
}