package com.taskdemo.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taskdemo.demo.model.Consumer;
import com.taskdemo.demo.repository.ConsumerRepo;

@Service
public class ConsumerServiceImpl implements ConsumerService{
	
	@Autowired
	private ConsumerRepo repo;

	@Override
	public List<Consumer> getAllConsumers() {
		return (List<Consumer>) repo.findAll();
	}

	@Override
	public void saveConsumer(Consumer consumer) {
		repo.save(consumer);
		
	}

	@Override
	public Consumer getConsumerById(int id) {
		Optional<Consumer> optional = repo.findById(id);
		Consumer consumer=null;
		if(optional.isPresent()) {
			consumer=optional.get();
		}else {
			throw new RuntimeException("Consumer Not Found for id :: "+id);
		}
		return consumer;
	}

	
	

}
