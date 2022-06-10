package pe.com.dyd.spring.boot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import pe.com.dyd.spring.boot.backend.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {
	
}
