package com.mycompany.mavenproject1.Cenario1;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@IdClass(AlocacaoChave.class)
public class Alocacao implements Serializable{
    
    @Id
    @Column(name = "funcionario_id", insertable = false, updatable = false)
    private int funcionario_id;
    @Id
    @Column(name = "projeto_id", insertable = false, updatable = false)
    private int projeto_id;
    
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    private Funcionario funcionario;
    @ManyToOne
    @JoinColumn(name = "projeto_id")
    private Projeto projeto;
    
    @Temporal(TemporalType.DATE)
    private Date dataIngresso;
    private int quantHoras;

    public Alocacao() {
    }

    public Alocacao(Funcionario funcionario, Projeto projeto, Date dataIngresso, int quantHoras) {
        this.funcionario = funcionario;
        this.projeto = projeto;
        this.dataIngresso = dataIngresso;
        this.quantHoras = quantHoras;
    }

    public int getFuncionario_id() {
        return funcionario_id;
    }

    public void setFuncionario_id(int funcionario_id) {
        this.funcionario_id = funcionario_id;
    }

    public int getProjeto_id() {
        return projeto_id;
    }

    public void setProjeto_id(int projeto_id) {
        this.projeto_id = projeto_id;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public int getQuantHoras() {
        return quantHoras;
    }

    public void setQuantHoras(int quantHoras) {
        this.quantHoras = quantHoras;
    }
    
}
