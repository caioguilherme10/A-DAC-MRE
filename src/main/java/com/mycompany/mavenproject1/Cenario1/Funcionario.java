package com.mycompany.mavenproject1.Cenario1;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author IFPB
 */
@Entity
public class Funcionario implements Serializable{
    
    @Id
    @GeneratedValue
    private int id;
    private String nome;
    
    @Embedded
    private RG RG;
    
    @Embedded
    private CPF cpf;
    
    @OneToMany(mappedBy = "funcionario", targetEntity = Alocacao.class)
    @Basic
    private List<Alocacao> alocacoes;
    
    private float salario;

    public Funcionario() {
    }

    public Funcionario(String nome, RG RG, CPF cpf, float salario) {
        this.nome = nome;
        this.RG = RG;
        this.cpf = cpf;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RG getRG() {
        return RG;
    }

    public void setRG(RG RG) {
        this.RG = RG;
    }

    public CPF getCpf() {
        return cpf;
    }

    public void setCpf(CPF cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
      
}
