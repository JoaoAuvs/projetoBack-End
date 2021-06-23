package com.appsala.app.entities;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "unidades")
@Data

public class Unidade extends EntityBase implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Column(name = "nome_unidade")
	private String nome;
	
	@Column(name = "telefone")
	private String telefone;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "endereco")
	private String endereco;
	
	@ManyToOne()
	@JoinColumn(name = "regional_id")
	private Regional regional;
	
}