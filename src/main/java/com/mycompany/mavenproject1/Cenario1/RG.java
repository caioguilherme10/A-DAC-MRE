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
    
    private String rg;

    public RG(String numero) {
        this.rg = numero;
    }

    public RG() {
        this("");
    }

    public String numero() {
        return rg;
    }

    public String formatado() {
        return rg;
    }

    public boolean valido() {
        return true;
    }
}
