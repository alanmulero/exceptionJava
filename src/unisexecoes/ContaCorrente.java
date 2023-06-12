/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unisexecoes;

/**
 *
 * @author alan
 */
public class ContaCorrente {
    
    private double saldo = 200.0;
    private String nome;
    public double getSaldo(){
        return saldo;
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void saca(double valor){
        if(this.saldo < valor){
        throw new SaldoInsuficienteException("Saldo insuficiente em conta.");
        }else{
            this.saldo -= valor;
            System.out.println("Saldo depois do saque: "+ getSaldo());
           
        }
            
    }
    
    
}
