package com.taskdemo.demo.repository;







import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;


import com.taskdemo.demo.model.Consumer;

@Repository


public interface ConsumerRepo extends JpaRepository<Consumer, Integer>{
	
	

	
		
	

	
}
