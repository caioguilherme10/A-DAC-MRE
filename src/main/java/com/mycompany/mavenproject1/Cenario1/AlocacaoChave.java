package com.mycompany.mavenproject1.Cenario1;

import java.io.Serializable;

public class AlocacaoChave implements Serializable{
    
    private int funcionario_id;
    private int projeto_id;

    public AlocacaoChave() {
    }

    public AlocacaoChave(int funcionario_id, int projeto_id) {
        this.funcionario_id = funcionario_id;
        this.projeto_id = projeto_id;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + this.funcionario_id;
        hash = 83 * hash + this.projeto_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AlocacaoChave other = (AlocacaoChave) obj;
        if (this.funcionario_id != other.funcionario_id) {
            return false;
        }
        if (this.projeto_id != other.projeto_id) {
            return false;
        }
        return true;
    }
    
}
