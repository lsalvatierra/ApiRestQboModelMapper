package edu.pe.idat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import edu.pe.idat.convertdto.AutorConvert;
import edu.pe.idat.dto.AutorDto;
import edu.pe.idat.model.Autor;
import edu.pe.idat.service.AutorService;

@RestController
@RequestMapping("apiqbo/autor")
public class AutorController {
	
	@Autowired
	private AutorService autorService;
	@Autowired 
	private AutorConvert converter;
	
	
	/*@GetMapping("")
	public ResponseEntity<List<Autor>> obtenerAutores(){
		List<Autor> autores = new ArrayList<Autor>();
		autorService.listarAutor().forEach(autores::add);
		if (autores.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(autores, HttpStatus.OK);
	}*/
	
	@GetMapping("")
	public ResponseEntity<List<AutorDto>> obtenerEmpleados(){
		List<Autor> autores = new ArrayList<Autor>();
		autorService.listarAutor().forEach(autores::add);
		if (autores.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(converter.listEmpleadoToDto(autores), HttpStatus.OK);
	}

}
