package com.projet.BackEnd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import com.projet.BackEnd.Entity.Produit;

@SpringBootApplication
public class BackEndApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(BackEndApplication.class, args);
	}
	
	@Autowired 
	RepositoryRestConfiguration r ; 
		@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
			r.exposeIdsFor(Produit.class) ; 
	}

}
