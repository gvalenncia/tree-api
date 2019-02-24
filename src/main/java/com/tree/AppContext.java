package com.tree;

import com.tree.service.domain.BinaryTree;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AppContext {

	@Bean
	public BinaryTree getBinaryTree(){
		return new BinaryTree();
	}

	public static void main(String[] args) {
		SpringApplication.run(AppContext.class, args);
	}

}
