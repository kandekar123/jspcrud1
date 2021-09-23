package com.taskdemo.demo.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.taskdemo.demo.model.Consumer;
import com.taskdemo.demo.service.ConsumerService;


@Controller
public class ConsumerController {
	
	
	@Autowired
	private ConsumerService consumerService;
											    //display list of consumers
												//creating a method handler for home page to display a list of consumers
	@GetMapping("/")
	public String viewHomePage(Model model) {
		
	model.addAttribute("listConsumers", consumerService.getAllConsumers());
		                                        //return view name
		return "index";
		
	}
	
	@GetMapping("/showNewConsumerForm")
	public String showNewConsumerForm(Model model) {
		//create a model attribute to bind form data
		Consumer consumer=new Consumer();
		model.addAttribute("consumer", consumer);
		return "new_consumer";
		
		
	}
	@PostMapping("/saveConsumer")
	public String saveConsumer(@ModelAttribute("consumer") Consumer consumer) {          //we need to handle form data for that we are going
		    //save consumer to database                                                  //to use model attribute here so here is the consumer
		     consumerService.saveConsumer(consumer);
		     return "redirect:/";                                                                            //so all the form data will be binded to the consumer 
		                                                                                //get this consumer here 
	}
	
	@GetMapping("/showFormForUpdate/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") int consumer_id,Model model) {
		//get consumer from the service
		Consumer consumer=consumerService.getConsumerById(consumer_id);
		//set consumer as a model attribute to pre-populate the form
		
		model.addAttribute("consumer", consumer);
		return "update_consumer";
		
		
	}
	
	@GetMapping("/deleteConsumer/{id}")
	public String deleteConsumer(@PathVariable(value = "id") int consumer_id,Model model) {
		Consumer consumer=consumerService.getConsumerById(consumer_id);
		if(consumer.getIsActive().equals("Y")) {
			consumer.setIsActive("N");
			consumerService.saveConsumer(consumer);
		}
		
		return "redirect:/";
		
	}
	
	

	
	
}
