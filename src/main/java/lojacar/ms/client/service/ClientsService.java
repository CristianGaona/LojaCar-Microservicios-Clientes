package lojacar.ms.client.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lojacar.ms.client.entity.Clients;
import lojacar.ms.client.repository.ClientsRepository;

@Service
public class ClientsService implements IClients{

	@Autowired
	ClientsRepository clientRepo;
	
	@Override
	public List<Clients> findAll() {
		return (List<Clients>) clientRepo.findAll();
	}

	@Override
	public Clients findById(Integer id) {
		return clientRepo.findById(id).orElse(null);
	}

}
