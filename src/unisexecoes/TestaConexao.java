/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unisexecoes;

/**
 *
 * @author alan
 */
public class TestaConexao {
    public static void main(String[] args) {
//        Conexoes conexoes = null; // Declarada como null fora do bloco try.
//        try{
//        conexoes = new Conexoes();// Inicializando o que era null.
//        conexoes.leDados();
//        conexoes.fecha();
//            
//        }catch(IllegalStateException e){
//            System.out.println("Erro ao conectar.");
//        }finally{
//            // Esse bloco sempre sera executado.
//            conexoes.fecha();
//        }
        // Forma mais simplificada de escrever código acima.Java 1.7
        // Iniciando a conexão no try
        // Precido implementar na classe Conexao AutoCloseable
        // Tudo o que foi feito em cima reduzido aqui, inclusive o finally
        try ( Conexoes conexoes = new Conexoes() ){
           conexoes.leDados();
        }catch(IllegalStateException e){
            System.out.println("Deu erro na conexao");
        }
        
        
        
    }
}
