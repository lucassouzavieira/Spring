package com.mm.os.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mm.os.model.Cliente;

public interface Clientes extends JpaRepository<Cliente, Long>{

	
}
