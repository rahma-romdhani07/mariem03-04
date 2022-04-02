package com.projet.BackEnd.Services;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.projet.BackEnd.Dao.ProduitRepository;
import com.projet.BackEnd.Entity.Produit;

@Service
public class ProduitImp implements IGestion{
	//injection de dependa,ces soit par Autowired
@Autowired
ProduitRepository pr ;
/*public public ProduitImp() {
	// TODO Auto-generated constructor stub
}*/

	@Override
	public void addProduct(Produit p) {
		// TODO Auto-generated method stub
		pr.save(p) ;
	}

	@Override
	public List<Produit> getAllProducts() {
		// TODO Auto-generated method stub
		return pr.findAll();
	}

	@Override
	public List<Produit> getProduitPMC(String mc) {
		// TODO Auto-generated method stub
		return pr.findByNomContains(mc);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		pr.deleteById(id);
	}

	@Override
	public void updateProduit(Produit produit , int id  ) {
		// TODO Auto-generated method stub
		produit.setId(id);
		pr.save(produit) ; 
	}

	@Override
	public Produit getProduitById(int id) {
		// TODO Auto-generated method stub
		return pr.findById(id);
	}
	@Override
public byte[] getImage(int idProduit) throws IOException{
	String photo=getProduitById(idProduit).getNom() ;
	File f  = new File(System.getProperty("user.home")) ;
	Path p  =Paths.get(f+"/images/"+photo+".jpg") ;
	return Files.readAllBytes(p) ;
	
}
}
