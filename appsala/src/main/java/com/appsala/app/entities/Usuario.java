package com.appsala.app.entities;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
@Table(name = "usuarios")
@Data
public class Usuario extends EntityBase implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "nome")
	private String nome;

	@Column(name = "email")
	private String email;

	@Column(name = "celular")
	private String celular;

	@Column(name = "password")
	private String password;

	@Column(name = "token")
	private String token;

	@Column(name = "codigo_rfid")
	private String codeRFID;

	@Column(name = "operador")
	private String operador;

}