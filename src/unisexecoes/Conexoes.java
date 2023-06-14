package unisexecoes;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author alan
 */
public class Conexoes implements AutoCloseable {

    public Conexoes() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException();
    }
// Usano a simplificação no Java 1.7, já vem um metodo close
//    public void fecha() {
//        System.out.println("Fechando conexao");
//    }

    @Override
    public void close()  {
        System.out.println("Usando o metodo close");
    }
}
