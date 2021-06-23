package com.appsala.app.entities;

import lombok.Data;
import java.util.List;
import java.io.Serializable;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@Table(name = "regionais")
@Data

public class Regional extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "nome")
    private String nome;

    @Column(name = "sigla")
    private String sigla;

    /* RELACIONAMENTOS */
    
    @OneToMany(mappedBy = "regional", fetch=FetchType.LAZY)
    private List<Unidade> unidades;
}