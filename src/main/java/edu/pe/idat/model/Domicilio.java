package edu.pe.idat.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Domicilio")
public class Domicilio {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long iddomicilio;	
	@Column(name = "descdomicilio")
	private String descdomicilio;
	@Column(name = "nrodomicilio")
	private Integer nrodomicilio;
	@Column(name = "refdomicilio")
	private String refdomicilio;
	public Long getIddomicilio() {
		return iddomicilio;
	}
	public void setIddomicilio(Long iddomicilio) {
		this.iddomicilio = iddomicilio;
	}
	public String getDescdomicilio() {
		return descdomicilio;
	}
	public void setDescdomicilio(String descdomicilio) {
		this.descdomicilio = descdomicilio;
	}
	public Integer getNrodomicilio() {
		return nrodomicilio;
	}
	public void setNrodomicilio(Integer nrodomicilio) {
		this.nrodomicilio = nrodomicilio;
	}
	public String getRefdomicilio() {
		return refdomicilio;
	}
	public void setRefdomicilio(String refdomicilio) {
		this.refdomicilio = refdomicilio;
	}
	public Domicilio() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Domicilio(Long iddomicilio, String descdomicilio, Integer nrodomicilio, String refdomicilio) {
		super();
		this.iddomicilio = iddomicilio;
		this.descdomicilio = descdomicilio;
		this.nrodomicilio = nrodomicilio;
		this.refdomicilio = refdomicilio;
	}
	
	
	
}
