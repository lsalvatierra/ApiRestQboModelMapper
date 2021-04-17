package edu.pe.idat.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.pe.idat.convertdto.EmpleadoConvert;
import edu.pe.idat.dto.EmpleadoDto;
import edu.pe.idat.model.Empleado;
import edu.pe.idat.service.EmpleadoService;

@RestController
@RequestMapping("apiqbo/empleado")
public class EmpleadoController {

	@Autowired
	private EmpleadoService empleadoService;
	@Autowired 
	private EmpleadoConvert converter;
	
	/*@GetMapping("")
	public ResponseEntity<List<Empleado>> obtenerClientes(){
		List<Empleado> clientes = new ArrayList<Empleado>();
				//Del listado que recibimos lo vamos recorrer y agregarlo a la lista definida.
		empleadoService.listarEmpleado().forEach(clientes::add);
		if (clientes.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(clientes, HttpStatus.OK);
	}*/

	@GetMapping("")
	public ResponseEntity<List<EmpleadoDto>> obtenerEmpleados(){
		List<Empleado> empleados = new ArrayList<Empleado>();
		empleadoService.listarEmpleado().forEach(empleados::add);
		if (empleados.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(converter.listEmpleadoToDto(empleados), HttpStatus.OK);
	}

}
