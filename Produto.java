/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author autologon
 */
public class Produto implements  Iseguranca, Iimprimivel {
    private String descricao;
    private int quantidade;

    public Produto(String descricao, int quantidade) {
        this.descricao = descricao;
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    
    
   
    @Override
   public String formatoString(){
       
       return "Descrição:" + getDescricao() + nLin + "Quantidade: " + getQuantidade() + " Formato String" ;
}
   
    @Override
  public void formatoSystemOut(){
       System.out.println( "Descrição:" + getDescricao() + nLin + "Quantidade: " + getQuantidade()+ " Formato Sout");
   }
   
    @Override
  public boolean validar(){
       return true;
   }
    
}

