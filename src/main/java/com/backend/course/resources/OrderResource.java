package com.backend.course.resources;

import com.backend.course.entities.Order;
import com.backend.course.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value="/orders")
public class OrderResource {
	
	@Autowired
	private OrderService service;
	
	@GetMapping
	public ResponseEntity<List<Order>> findAll() {	
		List<Order> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findById(@PathVariable Long id) { // Para funcionar parâmetros na url deve ter o @PathVariable
		Order obj = service.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
