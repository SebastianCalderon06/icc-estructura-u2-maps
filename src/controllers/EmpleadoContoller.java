package controllers;
import models.Empleado;

public class EmpleadoContoller {


    private EmpleadoDAO empleadoDAO;

    public EmpleadoContoller(EmpleadoDAO empleadoDAO) {
        this.empleadoDAO = empleadoDAO;
    }

    public void agregarEmpleado(Empleado emp){
        empleadoDAO.add(emp);
    }

    public void eliminarEmpleado(int id){
        empleadoDAO.remove(id);
    }

    public void listarEmpleado(){
        empleadoDAO.list();}
}
