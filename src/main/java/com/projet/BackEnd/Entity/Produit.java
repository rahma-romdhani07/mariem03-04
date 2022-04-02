package com.projet.BackEnd.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @AllArgsConstructor @NoArgsConstructor
@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "nomProduit")
	@Size (min =2 ,max =10 , message = "Le nom doit etre compris entre 3 et 10 caratéres")
	private String nom;
	private double prix;
	  //@DecimalMin("10")
	 // @DecimalMax("300")
	@DecimalMin(value="10")
	@DecimalMax(value="500")
	private int quantite;
	
}
