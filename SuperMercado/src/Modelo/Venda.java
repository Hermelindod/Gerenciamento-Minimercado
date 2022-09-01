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
public class Venda {
  private int codvenda;
  private int codfunc;
  private String nomecliente;
  private String datavenda;
  private int precototal;
  private String descproduto;
  private int quant;
  private int preco;
  private int cproduto;
  private int total;

    public Venda(int codvenda, int codfunc, String nomecliente, String datavenda, int precototal, String descproduto, int quant, int preco, int cproduto, int total ) {
        this.codvenda = codvenda;
        this.codfunc = codfunc;
        this.nomecliente = nomecliente;
        this.datavenda = datavenda;
        this.precototal = precototal;
        this.descproduto = descproduto;
        this.quant = quant;
        this.preco = preco;
         this.cproduto = cproduto;
        this.total = total;
        
    }

    public Venda() {
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
     * @return the codfunc
     */
    public int getCodfunc() {
        return codfunc;
    }

    /**
     * @param codfunc the codfunc to set
     */
    public void setCodfunc(int codfunc) {
        this.codfunc = codfunc;
    }

    /**
     * @return the nomecliente
     */
    public String getNomecliente() {
        return nomecliente;
    }

    /**
     * @param nomecliente the nomecliente to set
     */
    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }

    /**
     * @return the datavenda
     */
    public String getDatavenda() {
        return datavenda;
    }

    /**
     * @param datavenda the datavenda to set
     */
    public void setDatavenda(String datavenda) {
        this.datavenda = datavenda;
    }

    /**
     * @return the precototal
     */
    public int getPrecototal() {
        return precototal;
    }

    /**
     * @param precototal the precototal to set
     */
    public void setPrecototal(int precototal) {
        this.precototal = precototal;
    }
    public String getDescproduto() {
        return descproduto;
    }

    /**
     * @param descproduto the datavenda to set
     */
    public void setDescproduto(String descproduto) {
        this.descproduto = descproduto;
    }
     public int getQuant() {
        return quant;
    }

    /**
     * @param quant the precototal to set
     */
    public void setQuant(int quant) {
        this.quant = quant;
    }
    public int getPreco() {
        return preco;
    }

    /**
     * @param preco the precototal to set
     */
    public void setPreco(int preco) {
        this.preco = preco;
    }
     public int getCproduto() {
        return cproduto;
    }

    /**
     * @param cproduto the cproduto to set
     */
    public void setCproduto(int cproduto) {
        this.cproduto = cproduto;
    }
     public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
    
}
