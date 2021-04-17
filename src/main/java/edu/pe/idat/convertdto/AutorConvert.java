package edu.pe.idat.convertdto;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import edu.pe.idat.dto.AutorDto;
import edu.pe.idat.model.Autor;

@Component
public class AutorConvert {
	
	public AutorDto autorToDto(Autor autor) {
		ModelMapper mapper = new ModelMapper();
		AutorDto map = mapper.map(autor, AutorDto.class);
		return map;
	}

	public List<AutorDto> listEmpleadoToDto(List<Autor> autores) {
		return autores.stream().map(x -> autorToDto(x)).collect(Collectors.toList());
	}


}
