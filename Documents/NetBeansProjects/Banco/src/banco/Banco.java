/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;


/**
 *
 * @author daiane
 */
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Conta Corrente 01
        ContaCorrente ct1 = new ContaCorrente();
        ct1.setAgencia(1330);
        ct1.setNumero(357524);
        ct1.setDigito(8);
        ct1.setLimite(1000.00);
        ct1.setSaldo(1000.00);
        
        //Conta Corrente 02
        ContaCorrente ct2 = new ContaCorrente();
        ct2.setAgencia(2365);
        ct2.setNumero(326589);
        ct2.setDigito(5);
        ct2.setLimite(1000.00);
        ct2.setSaldo(1000.00);
        
        //Conta Poupança 01
        ContaPoupança ct3 = new ContaPoupança();
        ct3.setAgencia(6231);
        ct3.setNumero(547821);
        ct3.setDigito(9);
        ct3.setSaldo(500.00);
        //ct3.rendimento(0.02);
        
        //Conta Poupança 02
        ContaPoupança ct4 = new ContaPoupança();
        ct4.setAgencia(7541);
        ct4.setNumero(200145);
        ct4.setDigito(2);
        ct4.setSaldo(500.00);
        //ct4.rendimento(0.02);
        
        System.out.println("--------------------------");
        System.out.println("Extrato Conta Corrente 01:");
        System.out.println("--------------------------");
        
        ct1.saldo();
        ct1.saque(1001);
        ct1.saldo();
        ct1.deposito(1000);
        ct1.saldo();
        ct1.transferencia(1001, ct4);
        ct1.saldo();
        System.out.println("Saldo transferido de Conta Corrente 01 para Conta Poupança 02:");
        ct4.saldo();
        
        System.out.println("--------------------------");
        System.out.println("Extrato Conta Corrente 02:");
        System.out.println("--------------------------");
                
        ct2.saldo();
        ct2.saque(1000);
        ct2.saldo();
        ct2.deposito(1000);
        ct2.saldo();
        ct2.transferencia(1004, ct1);
        ct2.saldo();
        System.out.println("Saldo transferido de Conta Corrente 02 para Conta Corrente 01:");
        ct1.saldo();
        
        System.out.println("--------------------------");
        System.out.println("Extrato Conta Poupança 01:");
        System.out.println("--------------------------");

        ct3.saldo();
        ct3.saque(500);
        ct3.saldo();
        ct3.deposito(500);
        ct3.saldo();
        ct3.transferencia(500, ct1);
        ct3.saldo();
        System.out.println("Saldo transferido de Conta Poupança 01 para Conta Corrente 01:");
        ct1.saldo();
        System.out.println("Rendimentos da Conta:");
        ct3.rendimento(0.02);
        ct3.saldo();
                
        System.out.println("--------------------------");
        System.out.println("Extrato Conta Poupança 02:");
        System.out.println("--------------------------");
        
        ct4.saldo();
        ct4.saque(501);
        ct4.saldo();
        ct4.deposito(500);
        ct4.saldo();
        ct4.transferencia(500, ct1);
        ct4.saldo();
        System.out.println("Saldo transferido de Conta Poupança 02 para Conta Corrente 01:");
        ct1.saldo();
        System.out.println("Rendimentos da Conta:");
        ct4.rendimento(0.02);
        ct4.saldo();
    }
}
 
