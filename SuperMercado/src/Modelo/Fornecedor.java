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
public class Fornecedor {
  private int codfornecedor;
  private String nomeforn;
  private String emailforn;
  private int telefoneforn;
  private String cidadeforn;

    public Fornecedor(int codfornecedor, String nomeforn, String emailforn, int telefoneforn, String cidadeforn) {
        this.codfornecedor = codfornecedor;
        this.nomeforn = nomeforn;
        this.emailforn = emailforn;
        this.telefoneforn = telefoneforn;
        this.cidadeforn = cidadeforn;
    }

    public Fornecedor() {
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

    /**
     * @return the nomeforn
     */
    public String getNomeforn() {
        return nomeforn;
    }

    /**
     * @param nomeforn the nomeforn to set
     */
    public void setNomeforn(String nomeforn) {
        this.nomeforn = nomeforn;
    }

    /**
     * @return the emailforn
     */
    public String getEmailforn() {
        return emailforn;
    }

    /**
     * @param emailforn the emailforn to set
     */
    public void setEmailforn(String emailforn) {
        this.emailforn = emailforn;
    }

    /**
     * @return the telefoneforn
     */
    public int getTelefoneforn() {
        return telefoneforn;
    }

    /**
     * @param telefoneforn the telefoneforn to set
     */
    public void setTelefoneforn(int telefoneforn) {
        this.telefoneforn = telefoneforn;
    }

    /**
     * @return the cidadeforn
     */
    public String getCidadeforn() {
        return cidadeforn;
    }

    /**
     * @param cidadeforn the cidadeforn to set
     */
    public void setCidadeforn(String cidadeforn) {
        this.cidadeforn = cidadeforn;
    }

    public String nomeforn() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
