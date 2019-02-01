package com.mycompany.mavenproject1.Cenario1;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author murillo
 */
@Entity
public class Projeto implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    
    private String descricao;
    private String area;
    
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    
    @Temporal(TemporalType.DATE)
    private Date dataConclusao;

    @OneToMany(mappedBy = "projeto", targetEntity = Alocacao.class)
    @Basic
    private List<Alocacao> alocacoes;
    
    public Projeto() {
    }

    public Projeto(String descricao, String area, Date dataInicio, Date dataConclusao) {
        this.descricao = descricao;
        this.area = area;
        this.dataInicio = dataInicio;
        this.dataConclusao = dataConclusao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(Date dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public List<Alocacao> getAlocacoes() {
        return alocacoes;
    }

    public void setAlocacoes(List<Alocacao> alocacoes) {
        this.alocacoes = alocacoes;
    }

}