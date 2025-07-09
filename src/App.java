import controllers.EmpleadoContoller;
import controllers.Mapa;
import controllers.EmpleadoDAO;
import controllers.EmpleadoDAOHashMap;
import controllers.EmpleadoDAOTreeMap;
import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        runEjerccios();

        EmpleadoDAO empleadoDAOHashMap = new EmpleadoDAOHashMap();
        EmpleadoContoller empleadoController = new EmpleadoContoller(empleadoDAOHashMap);

        EmpleadoDAO empleadoDAOTreeMap = new EmpleadoDAOTreeMap();
        EmpleadoContoller empleadoContoller2 = new EmpleadoContoller(empleadoDAOTreeMap);

        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "Jose", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");


        empleadoController.agregarEmpleado(emp1);
        empleadoController.agregarEmpleado(emp2);
        empleadoController.agregarEmpleado(emp3);
        empleadoController.agregarEmpleado(emp4);
        empleadoController.agregarEmpleado(emp5);

        empleadoContoller2.agregarEmpleado(emp1);  
        empleadoContoller2.agregarEmpleado(emp2);       
        empleadoContoller2.agregarEmpleado(emp3);       
        empleadoContoller2.agregarEmpleado(emp4);       
        empleadoContoller2.agregarEmpleado(emp5);       
     

        empleadoController.listarEmpleado();
    }

    private static void runEmpleadoExample() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        mapa.ejemploConHashMap();
        mapa.ejemploConLinkedHashMap();
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");
}
}
