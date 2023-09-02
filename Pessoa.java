/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author autologon
 */
public abstract class  Pessoa  {
    protected String nomecompleto;
    protected int idade;

    public Pessoa(){
        //vazio
    }
    
    public Pessoa(String nomecompleto, int idade) {
        this.nomecompleto = nomecompleto;
        this.idade = idade;
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
