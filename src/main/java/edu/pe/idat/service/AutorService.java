package edu.pe.idat.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.pe.idat.model.Autor;
import edu.pe.idat.repository.AutorRepository;

/*Estos archivos de clase se utilizan para escribir lógica 
 *empresarial en una capa diferente, separada del archivo de 
 *clase @RestController.
 *Es una especialización de la anotación @Component 
 * */
@Service
public class AutorService {

	//permite inyectar unas dependencias con otras dentro de Spring
	@Autowired
	private AutorRepository autorRepository;
	
	public List<Autor> listarAutor(){
		return autorRepository.findAll();
	}
}
