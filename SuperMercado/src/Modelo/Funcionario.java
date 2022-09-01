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
public class Funcionario {
    private int codfunc;
    private String nomefunc;
    private String bifunc;
    private String emailfunc;
    private int telefonefunc;
    private int tipofunc;
    private String senhafunc;
    private int codtipo;
    private String descricaofunc;
    
    public Funcionario(int codfunc, String nomefunc, String bifunc, String emailfunc, int telefonefunc, int tipofunc, String senhafunc, int codtipo, String descricaofunc) {
        this.codfunc = codfunc;
        this.nomefunc = nomefunc;
        this.bifunc = bifunc;
        this.emailfunc = emailfunc;
        this.telefonefunc = telefonefunc;
        this.tipofunc = tipofunc;
        this.senhafunc = senhafunc;
        this.codtipo = codtipo;
        this.descricaofunc = descricaofunc;
    }

    public Funcionario() {
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
     * @return the nomefunc
     */
    public String getNomefunc() {
        return nomefunc;
    }

    /**
     * @param nomefunc the nomefunc to set
     */
    public void setNomefunc(String nomefunc) {
        this.nomefunc = nomefunc;
    }

    /**
     * @return the bifunc
     */
    public String getBifunc() {
        return bifunc;
    }

    /**
     * @param bifunc the bifunc to set
     */
    public void setBifunc(String bifunc) {
        this.bifunc = bifunc;
    }

    /**
     * @return the emailfunc
     */
    public String getEmailfunc() {
        return emailfunc;
    }

    /**
     * @param emailfunc the emailfunc to set
     */
    public void setEmailfunc(String emailfunc) {
        this.emailfunc = emailfunc;
    }

    /**
     * @return the telefonefunc
     */
    public int getTelefonefunc() {
        return telefonefunc;
    }

    /**
     * @param telefonefunc the telefonefunc to set
     */
    public void setTelefonefunc(int telefonefunc) {
        this.telefonefunc = telefonefunc;
    }

    /**
     * @return the tipofunc
     */
    public int getTipofunc() {
        return tipofunc;
    }

    /**
     * @param tipofunc the tipofunc to set
     */
    public void setTipofunc(int tipofunc) {
        this.tipofunc = tipofunc;
    }

    /**
     * @return the senhafunc
     */
    public String getSenhafunc() {
        return senhafunc;
    }

    /**
     * @param senhafunc the senhafunc to set
     */
    public void setSenhafunc(String senhafunc) {
        this.senhafunc = senhafunc;
    }

    /**
     * @return the codtipo
     */
    public int getCodtipo() {
        return codtipo;
    }

    /**
     * @param codtipo the codtipo to set
     */
    public void setCodtipo(int codtipo) {
        this.codtipo = codtipo;
    }

    /**
     * @return the descricaofunc
     */
    public String getDescricaofunc() {
        return descricaofunc;
    }

    /**
     * @param descricaofunc the descricaofunc to set
     */
    public void setDescricaofunc(String descricaofunc) {
        this.descricaofunc = descricaofunc;
    }
}
  