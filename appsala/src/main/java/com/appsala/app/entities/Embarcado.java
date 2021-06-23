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
@Table(name = "embarcados")
@Data
public class Embarcado extends EntityBase implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(name = "capacidade")
    private String capacidade;

    @Column(name = "descricao_embarcado")
    private String descricaoEmbarcado;

    @Column(name = "ip_embarcado")
    private String ipEmbarcado;

    @Column(name = "ip_gateway")
    private String ipGateway;

    @Column(name = "mac")
    private String mac;

    @Column(name = "masc")
    private String mascara;

    @Column(name = "password_wifi")
    private String passwordWifi;

    @Column(name = "ssid")
    private String ssid;

    @Column(name = "status")
    private String status;

    @Column(name = "tipo_rede")
    private String tipoRede;

    @Column(name = "ambiente_id")
    private String ambienteId;

    @OneToMany
    @JoinColumn(name = "ambiente_id")
    private List<Ambiente> ambienteList = new ArrayList<Ambiente>();
}