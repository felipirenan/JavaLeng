/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio;

/**
 *
 * @author autologon
 */
public class Usuario implements Iseguranca, Iimprimivel{
    private String nomeUsuario;
    private String senha;
    
       public Usuario(){
        //vazio
    }

    public Usuario(String nomeUsuario, String senha) {
        this.nomeUsuario = nomeUsuario;
        setSenha(senha);
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
        if (validar()){
            this.senha = senha;
        }else{
            System.out.println("Senha invalida, digite mais de 8 caractres");
        }
    }
    
    @Override
    public String formatoString(){
        return "Usuário:" + getNomeUsuario() + nLin + "Senha: " + getSenha() + " Formato String"; 
    }
    
    @Override
    public void formatoSystemOut(){
        System.out.println("Usuário:" + getNomeUsuario() + nLin + "Senha: " + getSenha() + " Formato Sout");
    }
    
    @Override
    public boolean validar(){
        if (this.senha.length() < 8){
            return false;
        }else{
            return true;
        }
    }
       
       
}
