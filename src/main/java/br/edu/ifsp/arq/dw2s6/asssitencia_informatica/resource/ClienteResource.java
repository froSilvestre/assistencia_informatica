package br.edu.ifsp.arq.dw2s6.asssitencia_informatica.resource;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifsp.arq.dw2s6.asssitencia_informatica.model.Cliente;
import br.edu.ifsp.arq.dw2s6.asssitencia_informatica.repository.ClienteRepository;


@RestController
@RequestMapping("/cliente")
public class ClienteResource {
	@Autowired
	private ClienteRepository clienteRepository;
	
	
	@GetMapping
	public List<Cliente> listar(){
		return clienteRepository.findAll();
	}
	
	@GetMapping("/{codigo}")
	public ResponseEntity<Cliente> buscarPeloCodigo(@PathVariable Long codigo){
		Optional<Cliente> cliente = clienteRepository.findById(codigo);
		
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		else {
			return ResponseEntity.notFound().build();
		}
	} 

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Cliente criar(@RequestBody Cliente cliente, HttpServletResponse response) {
		return clienteRepository.save(cliente);
	}
}
