package questao08;

import javax.swing.JOptionPane;

public class Questao08 {
    public static void main(String[] args) {
    //Elabore um algoritmo que calcule o que deve ser pago por um produto, 
    //considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
    //Leia o código e o valor do produto e efetue o cálculo adequado, mostre o resultado.

//Código	Condição de pagamento
//1	À vista em dinheiro ou cheque -> recebe 15% de desconto
//2	À vista no cartão de crédito -> recebe 10% de desconto
//3	Em duas vezes -> preço normal de etiqueta sem juros
//4	Em três vezes -> preço normal de etiqueta mais juros de 10%

        int codigo;
        double valorproduto, calculo;
        
        //entrada
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Código: "));
                
        //processamento
        
        if (codigo == 1 || codigo == 2 || codigo == 3 || codigo == 4){
            valorproduto = Double.parseDouble(JOptionPane.showInputDialog("Inserir valor do produto desejado: "));
                
                if (codigo == 1){
                calculo = valorproduto * 0.15;
                JOptionPane.showMessageDialog(null, "Desconto aplicado! Valor final: "+(valorproduto-calculo)+" reais.");
            }
            else if (codigo == 2){
                calculo = valorproduto * 0.10;
                JOptionPane.showMessageDialog(null, "Desconto aplicado! Valor final "+(valorproduto-calculo)+" reais.");
            }
            else if (codigo == 3){
                calculo = valorproduto/2;
                JOptionPane.showMessageDialog(null,"Produto parcelado em duas vezes de "+calculo+" reais sem juros.");
                    }
            else if (codigo == 4){
                calculo = valorproduto * 0.10;
                JOptionPane.showMessageDialog(null,"Produto parcelado em tres vezes de "+((calculo+valorproduto)/3)+" reais com juros de 10%.");
                    }
        } 
        else {
            JOptionPane.showMessageDialog(null, "Codigo incorreto! Digite novamente.");
        }
           
    }
    
}
