package br.edu.ifsp.arq.dw2s6.asssitencia_informatica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifsp.arq.dw2s6.asssitencia_informatica.model.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
