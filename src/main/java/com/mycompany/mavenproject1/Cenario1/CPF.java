/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mavenproject1.Cenario1;

import java.io.Serializable;
import javax.persistence.Embeddable;

/**
 *
 * @author IFPB
 */
@Embeddable
public class CPF implements Serializable{
    
    private String cpf;

    public CPF(String numero) {
        this.cpf = numero;
    }

    public CPF() {
        this("");
    }

    public String numero() {
        return cpf;
    }

    public String formatado() {
        return cpf;
    }

    public boolean valido() {
        return true;
    }
    
}
