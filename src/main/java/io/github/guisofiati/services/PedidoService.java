package io.github.guisofiati.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.guisofiati.domain.Pedido;
import io.github.guisofiati.repositories.PedidoRepository;
import io.github.guisofiati.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido find(Integer id) {
		 Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " +id+ ", Tipo: " +Pedido.class.getName()));
		} 
}
