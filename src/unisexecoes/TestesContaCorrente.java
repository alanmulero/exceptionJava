/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package unisexecoes;

/**
 *
 * @author alan
 */
public class TestesContaCorrente {
    
    public static void main(String[] args) {
        
        ContaCorrente cc = new ContaCorrente();
       // cc.setSaldo(110.0);
        System.out.println(cc.getSaldo());
        cc.saca(1.0);
        System.out.println(cc.getSaldo());
        cc.saca(201.0);
        System.out.println(cc.getSaldo());
        
        
    }
    
}
