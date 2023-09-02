/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicio;

/**
 *
 * @author autologon
 */
public class Exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario user1 = new Usuario("Renan Saran", "1234567");
        Produto product1 = new Produto("Capa Para Celular", 20);
        
        System.out.println(user1.formatoString());
        user1.formatoSystemOut();
        
        product1.formatoString();
        product1.formatoSystemOut();
    }
    
}
