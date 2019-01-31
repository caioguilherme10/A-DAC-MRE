package com.mycompany.mavenproject1.Cenario1;

import java.io.Serializable;
import javax.annotation.Generated;

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
    sprivate CPF cpf;
    
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
