package edu.pe.idat.dto;

public class AutorDto {

	private Long idautor;
	private String nomautor;
	private String apeautor;
	

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
	public AutorDto() {

	}
	public AutorDto(Long idautor, String nomautor, String apeautor) {
		super();
		this.idautor = idautor;
		this.nomautor = nomautor;
		this.apeautor = apeautor;
	}

	
	
}
