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
public class ContaCorrente extends Conta {

    private double limite = 0;
    
    
    @Override
    public void saque(double val) {
        if (val > limite) {
            System.out.println("Valor superior ao limite permitido!");
            
            return;
        }  
        super.saque(val);
    }
    
    @Override
    public void transferencia(double val, Conta ct) {
        if (val > limite) {
            System.out.println("Valor superior ao limite permitido!");
            
            return;
        }  
        super.transferencia(val, ct);
    }  

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    
}
