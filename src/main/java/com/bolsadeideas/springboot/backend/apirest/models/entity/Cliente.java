package com.bolsadeideas.springboot.backend.apirest.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
// Buenas prácticas es indicar las tablas de base de datos en minusculas y en plurarl.
@Table(name= "clientes")
public class Cliente implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	
	private String nombre;
	private String apellido;
	private String email;
	
	@Column(name = "create_at")
	/* Temporal-> Indica la transformacíon o el equivalente en la Base de Datos.*/
	@Temporal(TemporalType.DATE)
	private Date createAt;
	
	/* De forma automática cuando se cree un cliente, se creara con la fecha automática del día.  */
	@PrePersist
	public void prePersist() {
		createAt = new Date();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	private static final long serialVersionUID = 1L;
	
}
