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
public class Produto {
    private int codproduto;
    private String descricaoproduto;
    private int stock;
    private String data;
    private int precounit;
    private int codfornecedor;

    public Produto(int codproduto, String descricaoproduto, int stock, String data, int precounit, int codfornecedor) {
        this.codproduto = codproduto;
        this.descricaoproduto = descricaoproduto;
        this.stock = stock;
        this.data = data;
        this.precounit = precounit;
        this.codfornecedor = codfornecedor;
    }

    public Produto() {
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
     * @return the descricaoproduto
     */
    public String getDescricaoproduto() {
        return descricaoproduto;
    }

    /**
     * @param descricaoproduto the descricaoproduto to set
     */
    public void setDescricaoproduto(String descricaoproduto) {
        this.descricaoproduto = descricaoproduto;
    }

    /**
     * @return the stock
     */
    public int getStock() {
        return stock;
    }

    /**
     * @param stock the stock to set
     */
    public void setStock(int stock) {
        this.stock = stock;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the precounit
     */
    public int getPrecounit() {
        return precounit;
    }

    /**
     * @param precounit the precounit to set
     */
    public void setPrecounit(int precounit) {
        this.precounit = precounit;
    }

    /**
     * @return the codfornecedor
     */
    public int getCodfornecedor() {
        return codfornecedor;
    }

    /**
     * @param codfornecedor the codfornecedor to set
     */
    public void setCodfornecedor(int codfornecedor) {
        this.codfornecedor = codfornecedor;
    }
}
