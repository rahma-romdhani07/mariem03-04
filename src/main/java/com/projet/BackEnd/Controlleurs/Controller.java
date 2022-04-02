package com.projet.BackEnd.Controlleurs;

import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projet.BackEnd.Dao.ProduitRepository;
import com.projet.BackEnd.Entity.Produit;
import com.projet.BackEnd.Services.IGestion;

@CrossOrigin ("http://localhost:4200/")
@RestController
@RequestMapping("/api")
public class Controller {
 
	@Autowired IGestion gestion  ; 
	@Autowired ProduitRepository pr ;
	
	@GetMapping("/produits")
	public List<Produit> getAllProducts(){
		return  gestion.getAllProducts();
	}
	
	@PostMapping("/produits")
	public void  addProduct(@RequestBody Produit p) {
		gestion.addProduct(p);
	}
	@DeleteMapping("/produits/{id}")	
	public void  deleteProduit(@PathVariable ("id") int idProduit) {
		gestion.delete(idProduit);
	}
	@GetMapping("/produits/{mc}")
	public List<Produit> getProduitByMC(@PathVariable ("mc") String mot){
		return gestion.getProduitPMC(mot) ; 
	}
	@GetMapping("/produit/{id}")
	public Produit getProduit(@PathVariable("id") int id ) {
		return  pr.findById(id);
	}
	@PutMapping("/produit/{id}")
	public void update(@RequestBody Produit p , @PathVariable ("id") int idProduit) {
		 gestion.updateProduit(p, idProduit);
	}
	@GetMapping(path="/getImage/{id}" , produces=MediaType.IMAGE_JPEG_VALUE)
	public byte[] getImage(@PathVariable("id") int id) throws IOException{
		return gestion.getImage(id) ;
	}
}
