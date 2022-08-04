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
public class pessoaJuridica extends pessoa{
    
    private String cnpj;
            
    public pessoaJuridica(String nome, String cpf, String dataN, String cnpj) {
        super(nome, cpf, dataN);
        this.cnpj = cnpj;
    }
    
    public static void main(String[] args){
        pessoaJuridica fulano = new pessoaJuridica("Fulano", "933829348", "28/07/1999", "94342049");
        System.out.println(fulano.nome);
        fulano.setNome("Beltrano");
        System.out.println(fulano.getNome());
    }
}
