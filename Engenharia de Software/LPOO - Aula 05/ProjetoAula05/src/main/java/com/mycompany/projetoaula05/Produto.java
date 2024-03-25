package com.mycompany.projetoaula05;

public class Produto {
    String nome;
    double preco;
    int qtEstoque;
    
    public void aumentarPreco(double percAumento){
        double aumento = (preco * percAumento) / 100;
        preco += aumento;
    }
    
    public void inserirEstoque(int qtInserir){
        qtEstoque += qtInserir;
    }
    
    public boolean retirarEstoque(int qtRetirar){
        if (qtEstoque >= qtRetirar){
            qtEstoque -= qtRetirar;
            return true;
        }
        return false;
    }
    
    public String getNome(){
        return nome;
    }
    
}
