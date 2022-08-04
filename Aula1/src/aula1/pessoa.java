/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

import java.util.Date;

/**
 *
 * @author leona
 */
public class pessoa {
    String nome;
    String cpf;
    String dataN;
    
    public pessoa(String nome, String cpf, String dataN){
        this.nome = nome;
        this.cpf = cpf;
        this.dataN= dataN;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getDataN() {
        return dataN;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setDataN(String dataN) {
        this.dataN = dataN;
    }
    
}
