package edu.pe.idat.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Autor")
public class Autor {
	
	/* Entre la entidad autor y entidad publicación tenemos una 
	 * relación bidireccional, obteniendo una recursividad infinita
	 * para realizar la deserialización utilizamos las anotaciones
	 * @JsonManagedReference = parte directa de la referencia la misma que se serializa
	 *  @JsonBackReference = parte inversa de la referencia y 
	 *  los campos / colecciones marcados con esta anotación no se serializan.
	 * Con estas anotaciones dejamos a Jaskon que maneje la relación
	 * */

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long idautor;	
	@Column(name = "nomautor")
	private String nomautor;	
	@Column(name = "apeautor")
	private String apeautor;	
	@Column(name = "fechnacautor")
	private Date fechnacautor;

	
	public Autor(Long idautor, String nomautor, String apeautor, Date fechnacautor) {
		super();
		this.idautor = idautor;
		this.nomautor = nomautor;
		this.apeautor = apeautor;
		this.fechnacautor = fechnacautor;
	}

	//orphanRemoval = true Es una especificación del ORM 
	//nos permite eliminar un elemento de la lista desde una 
	//referencia del objeto principal
	//mappedBy = Hace referencia a la definición del objeto autor en Publicación
	@JsonManagedReference
	@OneToMany(mappedBy = "autor" , cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Publicacion> publicaciones = new ArrayList<Publicacion>();

	public Long getIdautor() {
		return idautor;
	}

	public void setIdautor(Long idautor) {
		this.idautor = idautor;
	}

	public String getNomautor() {
		return nomautor;
	}

	public void setNomautor(String nomautor) {
		this.nomautor = nomautor;
	}

	public String getApeautor() {
		return apeautor;
	}

	public void setApeautor(String apeautor) {
		this.apeautor = apeautor;
	}

	public Date getFechnacautor() {
		return fechnacautor;
	}

	public void setFechnacautor(Date fechnacautor) {
		this.fechnacautor = fechnacautor;
	}

	public List<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	public void setPublicaciones(List<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}

	public Autor(Long idautor, String nomautor, String apeautor, Date fechnacautor, List<Publicacion> publicaciones) {
		super();
		this.idautor = idautor;
		this.nomautor = nomautor;
		this.apeautor = apeautor;
		this.fechnacautor = fechnacautor;
		this.publicaciones = publicaciones;
	}

	public Autor() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
