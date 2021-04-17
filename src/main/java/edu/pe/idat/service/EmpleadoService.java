package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Empleado;
import edu.pe.idat.repository.EmpleadoRepository;

/*Estos archivos de clase se utilizan para escribir lógica 
 *empresarial en una capa diferente, separada del archivo de 
 *clase @RestController.
 *Es una especialización de la anotación @Component 
 * */
@Service
public class EmpleadoService  {

	@Autowired
	private EmpleadoRepository empleadoRepository;
	
	public List<Empleado> listarEmpleado(){
		return empleadoRepository.findAll();
	}
	

	
}
