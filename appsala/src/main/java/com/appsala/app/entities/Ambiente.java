package com.appsala.app.entities;

import lombok.Data;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
@Table(name="ambientes")
@Data

public class Ambiente extends EntityBase implements Serializable{

    private static final long serialVersionUID = 1L;

    @Column(name = "capacidade")
    private String capacidade;

    @Column(name = "descricao")
    private String descricao;

    @Column(name = "ip_camera")
    private String ipCamera;

    @Column(name = "nome_ambiente")
    private String nomeAmbiente;

    @Column(name = "tipo_ambiente")
    private String tipoAmbiente;

    @OneToMany
    @JoinColumn(name = "bloco_id")
    private List<Bloco> blocoList = new ArrayList<Bloco>();
}