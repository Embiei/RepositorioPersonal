package javabeans;

import java.util.Objects;

public class Localidad {
	
		//Atributos
		private int idLocalidad;
		private String direccion, ciudad, pais;
		
		//Constructores
		public Localidad() {
			super();
		}

		public Localidad(int idLocalidad, String direccion, String ciudad, String pais) {
			super();
			this.idLocalidad = idLocalidad;
			this.direccion = direccion;
			this.ciudad = ciudad;
			this.pais = pais;
		}
		
		//Getter setter

		public int getIdLocalidad() {
			return idLocalidad;
		}

		public void setIdLocalidad(int idLocalidad) {
			this.idLocalidad = idLocalidad;
		}

		public String getDireccion() {
			return direccion;
		}

		public void setDireccion(String direccion) {
			this.direccion = direccion;
		}

		public String getCiudad() {
			return ciudad;
		}

		public void setCiudad(String ciudad) {
			this.ciudad = ciudad;
		}

		public String getPais() {
			return pais;
		}

		public void setPais(String pais) {
			this.pais = pais;
		}
		//Override metodos

		@Override
		public String toString() {
			return "Localidad [idLocalidad=" + idLocalidad + ", direccion=" + direccion + ", ciudad=" + ciudad
					+ ", pais=" + pais + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(idLocalidad);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Localidad other = (Localidad) obj;
			return idLocalidad == other.idLocalidad;
		}
		
		
		
		
		
}
