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
public class RG implements Serializable{
    
    private String numero;

    public RG(String numero) {
        this.numero = numero;
    }

    public RG() {
        this("");
    }

    public String numero() {
        return numero;
    }

    public String formatado() {
        return numero;
    }

    public boolean valido() {
        return true;
    }
}
