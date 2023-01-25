package testing;

import javabeans.Departamento;
import javabeans.Empleado;
import javabeans.Localidad;
import javabeans.Trabajo;

public class TestingEmpleado {

	public static void main(String[] args) {
		
		//Creamos primero una Localidad
		Localidad localidad1 = new Localidad(1, "Avenida Felipe 1", "Madrid", "España");
		
		//Creamos departamento
		Departamento dep1 = new Departamento(1, "Departamento de calidad", localidad1);
		
		//Creamos un trabajo
		Trabajo trb1 = new Trabajo("Fisico", "Revisar las reacciones", 45000, 60000);
		
		//Generamos el empleado introducciendo los metodos en el constructor
		Empleado emp1 = new Empleado(1, "Pepe", "Garcia Vaquero", 'h', "Pepe.garcia@gmail.com", 35000, 2800, trb1, dep1);
		
		
		//Informacion completa del empleado
		System.out.println("***** INFORMACION EMPLEADO " + emp1.getIdEmpleado() + "******");
		System.out.println("El nombre del empleado es "+emp1.nombreCompleto() + ", con genero '"+emp1.literalSexo()+"', trabaja en el departamento '"
				+ emp1.getDepartamento().getDescripcion()+ "'\n con el titulo de "+emp1.getTrabajo().getDescripcion()+", direccion "+ emp1.getDepartamento().getLocalidad().getDireccion()+ 
				", ubicado en "+emp1.getDepartamento().getLocalidad().getCiudad()+", dentro de "+emp1.getDepartamento().getLocalidad().getPais());
		
		//
		System.out.println("\nTrabajo: "+emp1.getTrabajo());
		System.out.println("Departamento: "+emp1.getDepartamento());

		//
		
	}

}
