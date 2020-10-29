package com.formato.api.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ENTITYFORMAT")
public class EntityFormat {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDFORMAT" , updatable = false, nullable = true)
	private Integer idformat;

	@Column(name = "NAMEDOC", nullable = false, length = 70)
	private String nameDoc;
	
	@Column(name = "DESCDOC", nullable = false, length = 70)
	private String descDoc;

	@Column(name = "DATECREATION", nullable = true)
	private Date dateCreation;
	
	@Column(name = "DATEMODIFICATION", nullable = true)
	private Date dateModification;
	
	public Integer getIdformat() {
		return idformat;
	}
	public void setIdformat(Integer idformat) {
		this.idformat = idformat;
	}
	public String getNameDoc() {
		return nameDoc;
	}
	public void setNameDoc(String nameDoc) {
		this.nameDoc = nameDoc;
	}
	public String getDescDoc() {
		return descDoc;
	}
	public void setDescDoc(String descDoc) {
		this.descDoc = descDoc;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Date getDateModification() {
		return dateModification;
	}
	public void setDateModification(Date dateModification) {
		this.dateModification = dateModification;
	}
	
}
