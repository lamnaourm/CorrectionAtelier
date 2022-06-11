package com.etab.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Table
@Entity
public class Etablissement {

	@Id
	@GeneratedValue
	@Column(name="code_etab")
	@JsonProperty("code_etablissement")
	private int code;
	
	@Column(name="nom_etab")
	@JsonProperty("nom_etablissement")
	private String nom;
	
	@Column(name="adresse_etab")
	@JsonProperty("adresse_etablissement")
	private String adresse;
	
	@Column(name="tel_etab")
	@JsonProperty("tel_etablissement")
	private String tel;

	public Etablissement() {

	}

	public Etablissement(int code, String nom, String adresse, String tel) {
		super();
		this.code = code;
		this.nom = nom;
		this.adresse = adresse;
		this.tel = tel;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}
