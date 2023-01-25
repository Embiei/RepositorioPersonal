package javabeans;

import java.util.ArrayList;


public class Empresa implements IntGestionEmpresa{
	//Atributos
	private String nombre;
	private ArrayList<Empleado> plantilla;
	//Constructores
	public Empresa(String nombre) {
		super();
		this.nombre = nombre;
		plantilla = new ArrayList<>(); //Lo crea vacio, pero queremos meter algunos items ya para probar
		cargarDatos();
	}
	//Getter and Setter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	//Metodo privado
	private void cargarDatos() {
		Localidad loc1 = new Localidad(10, "Calle Luz", "Madrid", "España");
		Departamento dep1 = new Departamento(50, "I+D", loc1);
		Trabajo trb1 = new Trabajo("Fisico", "Fisico Nuclear", 30000, 50000);
		Empleado emp1 = new Empleado(180, "Jose", "Plote", 'h', "Jose.plote@gmail.com", 60000, 8000, trb1, dep1);
		Empleado emp2 = new Empleado(181, "Lucia", "Crespo", 'm', "Lucia.crepso@gmail.com", 40000, 5500, trb1, dep1);
		Empleado emp3 = new Empleado(182, "Matias", "Perez", 'h', "Matias.Perez@gmail.com", 50000, 10000, trb1, dep1);
		plantilla.add(emp1);
		plantilla.add(emp2);
		plantilla.add(emp3);
	}		
	//Metodos propios		
	@Override
	public boolean alta(Empleado empleado) {
		if (plantilla.contains(empleado))
			return false;
		return plantilla.add(empleado);
	}
	@Override
	public boolean eliminarUno(Empleado empleado) {		
		return plantilla.remove(empleado);
	}
	@Override
	public Empleado modificarUno(Empleado empleado) {
		int posicion = plantilla.indexOf(empleado);
		
		if (posicion == -1)
			return null;
		else
			return plantilla.set(posicion, empleado);
	}
	@Override
	public ArrayList<Empleado> buscarPorSexo(char sexo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Empleado buscarUno(int idEmpleado) {
		Empleado emp00 = new Empleado();
		emp00.setIdEmpleado(idEmpleado);
		int posicion = plantilla.indexOf(emp00);
		
		if (posicion ==-1)
			return null;
		return plantilla.get(posicion);
	}
	@Override
	public ArrayList<Empleado> buscarTodos() {
		// TODO Auto-generated method stub
		return plantilla;
	}
	@Override
	public double masaSalarial() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public ArrayList<Empleado> buscarPorDepartamento(int idDepar) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Empleado> buscarPorTrabajo(int idTrabajo) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public ArrayList<Empleado> buscarPorPais(String pais) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
		
		
		
}
