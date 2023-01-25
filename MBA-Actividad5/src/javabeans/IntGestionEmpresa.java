package javabeans;

import java.util.ArrayList;

interface IntGestionEmpresa {
	
	public boolean alta(Empleado empleado);
	public boolean eliminarUno(Empleado empleado);
	public Empleado modificarUno(Empleado empleado);
	public ArrayList<Empleado> buscarPorSexo(char sexo);
	public Empleado buscarUno(int idEmpleado);
	public ArrayList<Empleado> buscarTodos();
	public double masaSalarial();
	public ArrayList<Empleado> buscarPorDepartamento(int idDepar);
	public ArrayList<Empleado> buscarPorTrabajo(int idTrabajo);
	public ArrayList<Empleado> buscarPorPais(String pais);
	
}