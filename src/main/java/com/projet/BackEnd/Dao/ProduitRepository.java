package com.projet.BackEnd.Dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import com.projet.BackEnd.Entity.Produit;

@Repository
//@RepositoryRestResource 
public interface ProduitRepository extends JpaRepository<Produit, Integer> {
@RestResource(path="rahma")
	//public List<Produit> findByNomContains(String mc);

	public List<Produit> findByNomContains(@Param("nom")String mc);
	public Produit findById(int id);

}
