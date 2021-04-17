package edu.pe.idat.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity //Indica que esta clase es una entidad de BD.
@Table(name = "Empleado") // el nombre tabla contra la que mapea la entidad
public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idempleado;
	
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "apellido")
	private String apellido;
	@Column(name = "fechacontrat")
	private Date fechacontrat;
	
	public Empleado(Long idempleado, String nombre, String apellido, Date fechacontrat, Domicilio domicilio) {
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechacontrat = fechacontrat;
		this.domicilio = domicilio;
	}
	public Domicilio getDomicilio() {
		return domicilio;
	}
	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}
	//Indica que si se elimina el objeto empleado tambien se 
	//elimina el objeto asociado
	@OneToOne(cascade = CascadeType.ALL) 
	@JoinColumn(name = "iddomicilio") //Hace referencia a la columna que es FK
	private Domicilio domicilio;
	
	public Long getIdempleado() {
		return idempleado;
	}
	public void setIdempleado(Long idempleado) {
		this.idempleado = idempleado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechacontrat() {
		return fechacontrat;
	}
	public void setFechacontrat(Date fechacontrat) {
		this.fechacontrat = fechacontrat;
	}
	public Empleado(Long idempleado, String nombre, String apellido, Date fechacontrat) {
		this.idempleado = idempleado;
		this.nombre = nombre;
		this.apellido = apellido;
		this.fechacontrat = fechacontrat;
	}
	public Empleado() {
		// TODO Auto-generated constructor stub
	}
	
	

}
