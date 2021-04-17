package edu.pe.idat.convertdto;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import edu.pe.idat.dto.EmpleadoDto;
import edu.pe.idat.model.Empleado;
/*registra la clase como un componentes o un  
 * bean de Spring. 
 * */
@Component
public class EmpleadoConvert {

	public EmpleadoDto empeladoToDto(Empleado empleado) {
		ModelMapper mapper = new ModelMapper();
		EmpleadoDto map = mapper.map(empleado, EmpleadoDto.class);
		return map;
	}
	
	//Aplicando un poco de programación funcional
	//Con el método stream vamos recoger cada objeto del arreglo Empleado 
	//vamos a mapear cada objeto y con la expresión lambda llamaremos al método 
	//empleadoToDTO , finalmente generamos un listado del resultado  
	//que obtenemos del stream
	public List<EmpleadoDto> listEmpleadoToDto(List<Empleado> empleados) {
		return empleados.stream()
				.map(x -> empeladoToDto(x))
				.collect(Collectors.toList());
	}
	//Stream: creando flujos de datos que permite el procesamiento de una forma declarativa
}
