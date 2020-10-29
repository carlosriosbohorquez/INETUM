package com.formato.api.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="ENTITYDOC")
public class EntityDoc {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDDOC", updatable = false, nullable = true)
	private Integer idDoc;

	@Column(name = "PATHDOC", nullable = false, length = 70)
	private String pathDoc;
	
	@Column(name = "DATECREATION", nullable = true)
	private Date dateCreation;
	
	@Column(name = "DATEMODIFICATION", nullable = true)
	private Date dateModification;
	
	@Column(name = "IDFORMAT")
	private Integer idFormat;

	public Integer getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}

	public String getPathDoc() {
		return pathDoc;
	}

	public void setPathDoc(String pathDoc) {
		this.pathDoc = pathDoc;
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

	public Integer getIdFormat() {
		return idFormat;
	}

	public void setIdFormat(Integer idFormat) {
		this.idFormat = idFormat;
	}
	
	
	
}
