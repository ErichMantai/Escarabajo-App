/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.escarabajo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author erichmantai
 */
@Entity
public class Lanche {

    @Id
    private Long id;

    private String descricao;

    private Double valor;

    public Lanche() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
    

}
