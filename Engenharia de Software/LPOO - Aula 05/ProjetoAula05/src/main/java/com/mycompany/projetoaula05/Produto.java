package com.mycompany.projetoaula05;

public class Produto {
    String nome;
    double preco;
    int qtEstoque;
    
    public Produto(){}
    
    public Produto(String nome, double preco, int qtEstoque){
        this.nome = nome;
        this.preco = preco;
        this.qtEstoque = qtEstoque;
    }
    
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
    
    public void setNome(String nome){
        this.nome = nome;
    }    
}
