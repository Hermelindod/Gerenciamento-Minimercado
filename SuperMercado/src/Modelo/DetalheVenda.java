/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author pc
 */
public class DetalheVenda {
    private int codvenda;
    private int codproduto;
    private int quantidade;
    private int preco;
    private int quantidadeactualizada;

    public DetalheVenda(int codvenda, int codproduto, int quantidade, int preco, int quantidadeactualizada) {
        this.codvenda = codvenda;
        this.codproduto = codproduto;
        this.quantidade = quantidade;
        this.preco = preco;
        this.quantidadeactualizada = quantidadeactualizada;
    }

    public DetalheVenda() {
    }

    /**
     * @return the codvenda
     */
    public int getCodvenda() {
        return codvenda;
    }

    /**
     * @param codvenda the codvenda to set
     */
    public void setCodvenda(int codvenda) {
        this.codvenda = codvenda;
    }

    /**
     * @return the codproduto
     */
    public int getCodproduto() {
        return codproduto;
    }

    /**
     * @param codproduto the codproduto to set
     */
    public void setCodproduto(int codproduto) {
        this.codproduto = codproduto;
    }

    /**
     * @return the quantidade
     */
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * @param quantidade the quantidade to set
     */
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * @return the preco
     */
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public int getQuantidadeactualizada() {
        return quantidadeactualizada;
    }

    /**
     * @param quantidadeactualizada the preco to set
     */
    public void setQuantidadeactualizada(int quantidadeactualizada) {
        this.quantidadeactualizada = quantidadeactualizada;
    }

}
