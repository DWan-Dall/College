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
public class Conta {

    protected int agencia = 0;
    protected int numero = 0;
    protected int digito = 0;
    protected double saldo = 0;
    
    public void saque(double val) {
        if (val > saldo) {
            System.out.println("Seu saldo não é suficiente para completar a operação!");
            
            return;
        }       
        
        saldo = saldo - val;
        System.out.println("Saque realizado no valor de: " + val);
        
    }
    
    public void deposito(double val) {
        saldo = saldo + val;
        System.out.println("Depósito realizado no valor de: " + val);
    }
    
    public void transferencia(double val, Conta ct) {
        if (val > saldo) {
            System.out.println("Seu saldo não é suficiente para completar a operação!");
            
            return;
        }
            
        saldo = saldo - val;
        ct.saldo = ct.saldo + val;
        System.out.println("Transferência realizado no valor de: " + val);
    }
    
    public void saldo() {
        System.out.println("Agência: " + agencia + " Número: " + numero +
                " Digito: " + digito + " SALDO: " + saldo);
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDigito() {
        return digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
