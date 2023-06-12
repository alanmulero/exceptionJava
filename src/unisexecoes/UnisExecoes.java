/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package unisexecoes;

/**
 *
 * @author alan toledo Ciclo atividade 4 grupo Unis Exeções em Java Prof.
 * Alberane
 */
public class UnisExecoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Testando exeções

        System.out.println("Inicio do main");
        try {
            metodo1();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Inicio do metodo1");

        metodo2();
        System.out.println("Fim do metodo 1");
    }

    private static void metodo2() {
        System.out.println("Inicio do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
            //int a = i / 0;

            //Conta conta = null;
            // try{
            //conta.pepino();//;}
            //catch(NullPointerException e){
            //System.out.println("Null pelpino "+ e.getMessage() );
            //}
        }
        metodo3();
        System.out.println("Fim do metodo2");

    }

    private static void metodo3() {
        System.out.println("Inicio do método 3.");
        
       try{
        metodo4();}
       catch(Exception e){
           System.out.println("Tratando o metodo 4 com MinhaExecoes.");
       }
        System.out.println("Fim do método 3.");
        
    }
    
    private static void metodo4(){
        System.out.println("Inicio do método 4.");
        throw new  MinhasExecoes("Erro da minha classe para ContaNull");
        //ContaNull contaNull = null;
        //contaNull.metodoVazio();
        
        //System.out.println("Fim do metodo 4.");
    }
}
