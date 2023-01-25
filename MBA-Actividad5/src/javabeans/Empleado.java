package javabeans;

import java.util.Objects;

public class Empleado {
	
	//Atributos
	private int idEmpleado;
	private String nombre, apellidos;
	private char genero;
	private String email;
	private double salario, complemento;
	private Trabajo trabajo;
	private Departamento departamento;
	//Constructores
	public Empleado() {
		super();
	}
	public Empleado(int idEmpleado, String nombre, String apellidos, char genero, String email, double salario,
			double comision, Trabajo trabajo, Departamento departamento) {
		super();
		this.idEmpleado = idEmpleado;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.genero = genero;
		this.email = email;
		this.salario = salario;
		this.complemento = comision;
		this.trabajo = trabajo;
		this.departamento = departamento;
	}
	//Getter Setter
	public int getIdEmpleado() {
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado) {
		this.idEmpleado = idEmpleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public double getComision() {
		return complemento;
	}
	public void setComision(double comision) {
		this.complemento = comision;
	}
	public Trabajo getTrabajo() {
		return trabajo;
	}
	public void setTrabajo(Trabajo trabajo) {
		this.trabajo = trabajo;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	//Override
	@Override
	public String toString() {
		return "Empleado [idEmpleado=" + idEmpleado + ", nombre=" + nombre + ", apellidos=" + apellidos + ", genero="
				+ genero + ", email=" + email + ", salario=" + salario + ", comision=" + complemento + ", trabajo="
				+ trabajo + ", departamento=" + departamento + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(idEmpleado);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empleado other = (Empleado) obj;
		return idEmpleado == other.idEmpleado;
	}
	
	//Metodos propios
	public double salarioBruto() {
		return salario+complemento;
	}
	
	public String obtenerEmail() {
		String primerApellido="", email="";
		for (int i=0; i<=this.apellidos.length(); i++) {
			if (this.apellidos.charAt(i)==' ')
				break;
			else
				primerApellido+=this.apellidos.charAt(i);
		}
		email=this.nombre.toLowerCase().charAt(0)+primerApellido.toLowerCase()+"@enterprise.com";
		return email;
	}
	
	public String literalSexo() {
		if (this.genero=='H'||this.genero=='h')
			return "Hombre";
		else if (this.genero=='M'||this.genero=='m')
			return "Mujer";
		else
			return "Sexo incorrecto";
	}
	
	public String nombreCompleto(){
		return nombre+" "+apellidos;
	}
	
	public double salarioMensual(int meses) {
		return (salario+complemento)/meses;
	}
	
}
