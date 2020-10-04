package com.alissondev.client.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alissondev.client.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll() {
		List<Client> clients = new ArrayList<>();
		clients.add(new Client(1L, "Alisson Dev", "1234567", 10.0, Instant.now(), 1));
		clients.add(new Client(2L, "Link da Silva", "12345678", 200.0, Instant.now(), 2));

		return ResponseEntity.ok().body(clients);
	}

}
