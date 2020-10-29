package com.formato.api.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ENTITYCUTOUT")
public class EntityCutOut {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDCUTOUT")
	private Integer idCutOut;

	@Column(name = "PATHCUTOUT", nullable = false, length = 70)
	private String pathCutOut;

	@Column(name = "DATECREATION", nullable = true)
	private Date dateCreation;

	@Column(name = "DATEMODIFICATION", nullable = true)
	private Date dateModification;

	@Column(name = "IDDOC")
	private Integer idDoc;

	public Integer getIdCutOut() {
		return idCutOut;
	}

	public void setIdCutOut(Integer idCutOut) {
		this.idCutOut = idCutOut;
	}

	public String getPathCutOut() {
		return pathCutOut;
	}

	public void setPathCutOut(String pathCutOut) {
		this.pathCutOut = pathCutOut;
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

	public Integer getIdDoc() {
		return idDoc;
	}

	public void setIdDoc(Integer idDoc) {
		this.idDoc = idDoc;
	}

	
}
