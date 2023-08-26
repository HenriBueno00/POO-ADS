package org.me.Produto;
public class Produto {
    //atributos
    private String descricao;
    private int qtde;
    private double preco;
    
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    public String getDescricao(){
        return descricao;
    }
    
    public void setQtde(int qtde){
        this.qtde = qtde;
    }
    public int getQtde(){
        return qtde;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return qtde;
    }
    
    public double desconto (double preco){
        if (preco >= 100.000)
            return preco * 0.10;
        else
            return preco * 0.05;
    }
}
