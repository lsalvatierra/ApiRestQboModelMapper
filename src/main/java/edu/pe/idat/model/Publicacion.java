package edu.pe.idat.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "Publicacion")
public class Publicacion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idpublicacion;	
	@Column(name = "titulo")
	private String titulo;	
	@Column(name = "resumen")
	private String resumen;	
	@Column(name = "fechpublicacion")
	private Date fechpublicacion;
	
	//Cuando una entidad es persistida, su entidad relacionada 
	//debe ser persistida también.
	@JsonBackReference
	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "idautor")
	private Autor autor;

	public Long getIdpublicacion() {
		return idpublicacion;
	}

	public void setIdpublicacion(Long idpublicacion) {
		this.idpublicacion = idpublicacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public Date getFechpublicacion() {
		return fechpublicacion;
	}

	public void setFechpublicacion(Date fechpublicacion) {
		this.fechpublicacion = fechpublicacion;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public Publicacion(Long idpublicacion, String titulo, String resumen, Date fechpublicacion, Autor autor) {
		super();
		this.idpublicacion = idpublicacion;
		this.titulo = titulo;
		this.resumen = resumen;
		this.fechpublicacion = fechpublicacion;
		this.autor = autor;
	}

	public Publicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publicacion(Long idpublicacion, String titulo, String resumen, Date fechpublicacion) {
		super();
		this.idpublicacion = idpublicacion;
		this.titulo = titulo;
		this.resumen = resumen;
		this.fechpublicacion = fechpublicacion;
	}
	
	

}
