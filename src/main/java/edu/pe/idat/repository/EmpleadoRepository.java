package edu.pe.idat.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.pe.idat.model.Empleado;

/*es una anotación de Spring que indica que la clase decorada 
es un repositorio. Un repositorio es un mecanismo para encapsular 
el comportamiento de almacenamiento, recuperación y búsqueda que 
emula una colección de objetos. Es una especialización de 
la anotación @Component
*/ 
@Repository
public interface EmpleadoRepository extends JpaRepository<Empleado, Long> {

}
