package testing;

import javabeans.Departamento;
import javabeans.Empleado;
import javabeans.Empresa;
import javabeans.Localidad;
import javabeans.Trabajo;

public class TestingEmpresa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa empresa1 = new Empresa("Google");
		
		//Creamos localidades, departamentos, trabajos y empleados
		Localidad loc1 = new Localidad(10, "Calle Luz", "Madrid", "España");
		Localidad loc2 = new Localidad(20, "Calle Oscuridad", "Jaen", "España");
		Departamento dep1 = new Departamento(1, "I+D", loc1);
		Departamento dep2 = new Departamento(2, "Renovacion", loc2);
		Trabajo trb1 = new Trabajo("Fisico", "Fisico Nuclear", 30000, 50000);
		Trabajo trb2 = new Trabajo("Electrico", "Especialista LV", 40000, 45000);
		Empleado emp1 = new Empleado(201, "Jose", "Gomez", 'h', "Jose.gomez@gmail.com", 60000, 8000, trb1, dep1);
		Empleado emp2 = new Empleado(202, "Carmen", "Crespo", 'm', "Carmen.crespo@gmail.com", 50000, 7000, trb2, dep1);
		Empleado emp3 = new Empleado(203, "Pepe", "Gutierrez", 'h', "pepe.gutierrez@gmail.com", 40000, 6000, trb1, dep2);
		Empleado emp4 = new Empleado(204, "Antonio", "Pepo", 'h', "Antonio.pepo@gmail.com", 30000, 5000, trb2, dep2);
		Empleado emp5 = new Empleado(205, "Maria", "Galan", 'm', "Maria.Galan@gmail.com", 20000, 4000, trb1, dep1);
		
		
		//Alta Empleado
		System.out.println("Vamos a dar de alta a un empleado: ");
		System.out.println("Lista de empleados original");
		for (Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		System.out.println("Añadimos empleado "+emp1.getIdEmpleado()+" y mostramos lista de nuevo ");
		empresa1.alta(emp1);
		for (Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		
		//Eliminar Uno
		System.out.println("Vamos a eliminar un empleado: ");
		System.out.println("Eliminamos empleado "+emp1.getIdEmpleado()+" y mostramos lista de nuevo ");
		empresa1.eliminarUno(emp1);
		for (Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		
		//Modificar Uno
		System.out.println("Vamos a modificar un empleado: ");
		System.out.println("Modificamos empleado 181 y mostramos lista de nuevo ");
		empresa1.modificarUno(new Empleado(181, "Lucia", "Nuevo Apellido", 'm', "Lucia.crespo@gmail.com", 40000, 5500, trb1, dep1));
		for (Empleado ele: empresa1.buscarTodos())
			System.out.println(ele);
		
		//Buscar por sexo
		
		//Buscar Uno
		
		//Buscar Todos - ya lo estamos usando en todos los ejemplos
		
		//Masa Salarial
		
		//Buscar por Departamento
		
		//Buscar por Trabajo
		
		//Buscar por Pais
		
		
	}
}
