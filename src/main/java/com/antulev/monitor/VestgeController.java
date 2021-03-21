package com.antulev.monitor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/vestiges")
public class VestgeController {
	
	@Autowired
	VestigeReactiveRepository vestigeReactiveRepository;
	
	@GetMapping
	public Flux<Vestige> getAll(){
		return vestigeReactiveRepository.findAll();
	}
	@GetMapping("/{id}")
	public Mono<Vestige> getByID(@PathVariable("id") String id){
		return vestigeReactiveRepository.findById(id);
	}
}
