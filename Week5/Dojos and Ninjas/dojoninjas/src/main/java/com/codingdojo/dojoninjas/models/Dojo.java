package com.codingdojo.dojoninjas.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="dojos")
public class Dojo {
 
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 // Table Variables Here
 private Long id;
 @NotBlank
 private String name;
 @Column(updatable=false)
 // create/updated at
 private Date createdAt;
 private Date updatedAt;
 @OneToMany(mappedBy="dojo", cascade=CascadeType.ALL, fetch = FetchType.LAZY)
 private List<Ninja> ninjas;

 
 
 
 public Dojo(String name, Date createdAt, Date updatedAt, List<Ninja> ninjas) {
	this.name = name;
	this.createdAt = createdAt;
	this.updatedAt = updatedAt;
	this.ninjas = ninjas;
}

 
 
 // Getters and Setters

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public Date getCreatedAt() {
	return createdAt;
}

public void setCreatedAt(Date createdAt) {
	this.createdAt = createdAt;
}

public Date getUpdatedAt() {
	return updatedAt;
}

public void setUpdatedAt(Date updatedAt) {
	this.updatedAt = updatedAt;
}

public List<Ninja> getNinjas() {
	return ninjas;
}

public void setNinjas(List<Ninja> ninjas) {
	this.ninjas = ninjas;
}
 

public Dojo() {
    
}
 

}