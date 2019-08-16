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
        ContaCorrente ct1 = new ContaCorrente();
        ct1.setAgencia(1330);
        ct1.setNumero(357524);
        ct1.setDigito(8);
        ct1.setLimite(700.00);
        ct1.setSaldo(500.00);
        
        ct1.saldo();
        
        
        ContaCorrente ct2 = new ContaCorrente();
        ct2.setAgencia(2365);
        ct2.setNumero(326589);
        ct2.setDigito(5);
        ct2.setLimite(700.00);
        ct2.setSaldo(81.00);
        
        ct2.saldo();
        ct2.saque(2);
        ct2.saldo();
        ct2.deposito(1);
        ct2.saldo();
        ct2.transferencia(50, ct1);
        ct2.saldo();
        
        ct1.saldo();
        
    }
}
 
