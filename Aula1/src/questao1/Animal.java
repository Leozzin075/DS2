/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao1;

/**
 *
 * @author leona
 */
public class Animal {
    String nome;
    String raca;
    
    public Animal(){
        this.nome = "";
        this.raca = "";
    }
    public Animal(String nome){
        this.nome = nome;
        this.raca = "";
    }
    public String caminha(){
        return "andei";
    }
}
