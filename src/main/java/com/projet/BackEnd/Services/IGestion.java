package com.projet.BackEnd.Services;

import java.io.IOException;
import java.util.List;

import com.projet.BackEnd.Entity.*;

public interface IGestion {
	public void addProduct(Produit p);
	public List<Produit> getAllProducts();
	public List<Produit> getProduitPMC(String mc);
	public void delete(int id);
	public void updateProduit(Produit produit  , int id  );
	public Produit getProduitById(int id );
	public byte[] getImage(int idProduit)   throws IOException;
}
