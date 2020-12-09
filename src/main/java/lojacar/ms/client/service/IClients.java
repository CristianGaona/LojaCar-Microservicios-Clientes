package lojacar.ms.client.service;

import java.util.List;

import lojacar.ms.client.entity.Clients;

public interface IClients {

	public List<Clients> findAll();
	public Clients findById(Integer id);
	
}
