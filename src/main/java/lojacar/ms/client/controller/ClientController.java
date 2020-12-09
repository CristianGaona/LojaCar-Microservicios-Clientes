package lojacar.ms.client.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import lojacar.ms.client.service.ClientsService;



@RestController
public class ClientController {
	
	@Autowired
	ClientsService service;
	
	@GetMapping("/list")
	public ResponseEntity<?> listClients(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/list/{id}")
	public ResponseEntity<?> getClintId(@PathVariable Integer id){
		return ResponseEntity.ok().body(service.findById(id));
	}

}
