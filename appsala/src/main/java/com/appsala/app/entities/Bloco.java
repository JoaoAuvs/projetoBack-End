package com.appsala.app.entities;

import lombok.Data;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "blocos")
@Data

public class Bloco extends EntityBase implements Serializable{
	
    private static final long serialVersionUID = 1L;
    
    @Column(name = "andar_bloco")
    private String andar;
    
    @Column(name = "nome_bloco")
    private String nome;
    
    @ManyToOne
    @JoinColumn(name = "unidade_id")
    private Unidade unidade;
  
}