package com.taskdemo.demo.service;

import java.util.List;


import com.taskdemo.demo.model.Consumer;


public interface ConsumerService {

	List<Consumer> getAllConsumers();
	
	void saveConsumer(Consumer consumer);
	
	Consumer getConsumerById(int id);
	


	

	

}
