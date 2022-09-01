/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import Modelo.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc
 */
public class FuncionarioDados {
   Connection con = new Bdados().getConnection();
    private String sql;

    /**
     *
     * @param obj
     * @return
     * @throws SQLException
     */
    public boolean incluirFuncionario(Funcionario obj) throws SQLException {
        String sql = " insert into funcionario(nome,bi, email, telefone, senha,codtipo) values(?,?,?,?,?,?) ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, obj.getNomefunc());
        ps.setString(2, obj.getBifunc());
        ps.setString(3, obj.getEmailfunc());
        ps.setInt(4, obj.getTelefonefunc());
        ps.setString(5, obj.getSenhafunc());
        ps.setInt(6, obj.getCodtipo());

        int registros = ps.executeUpdate();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void Remover(Funcionario obj){
         String sql = " DELETE FROM funcionario WHERE codfuncionario= ? ";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setInt(1, obj.getCodfunc());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    
    public void Actualizar(Funcionario obj){
         String sql = " UPDATE funcionario SET nome=?, bi=?, email=?, telefone = ?, senha=?, codtipo=? WHERE codfuncionario= ?";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, obj.getNomefunc());
                operacao.setString(2, obj.getBifunc());
                operacao.setString(3, obj.getEmailfunc());
                operacao.setInt(4, obj.getTelefonefunc());
                operacao.setString(5, obj.getSenhafunc());
                operacao.setInt(6, obj.getCodtipo());
                operacao.setInt(7, obj.getCodfunc());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    
    public List<Funcionario> mostrar() throws SQLException{
        List<Funcionario> funcionario = new ArrayList<>();
         String sql = " SELECT * FROM funcionario order by codfuncionario; ";
      
                PreparedStatement operacao = con.prepareStatement(sql);
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Funcionario func = new Funcionario();
                    func.setCodfunc(resultado.getInt("codfuncionario"));
                    func.setNomefunc(resultado.getString("nome"));
                    func.setBifunc(resultado.getString("bi"));
                    func.setEmailfunc(resultado.getString("email"));
                    func.setTelefonefunc(resultado.getInt("telefone"));
                    func.setSenhafunc(resultado.getString("senha"));
                    func.setCodtipo(resultado.getInt("codtipo"));
                    funcionario.add(func);
                }
                return funcionario;
    } 
    public List<Funcionario> pesquisar(Funcionario obj) throws SQLException{
        List<Funcionario> funcionario = new ArrayList<>();
         String sql = " SELECT * FROM funcionario where nome like ? order by codfuncionario; ";
      
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, "%" + obj.getNomefunc() + "%");
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Funcionario func = new Funcionario();
                    func.setCodfunc(resultado.getInt("codfuncionario"));
                    func.setNomefunc(resultado.getString("nome"));
                    func.setBifunc(resultado.getString("bi"));
                    func.setEmailfunc(resultado.getString("email"));
                    func.setTelefonefunc(resultado.getInt("telefone"));
                    func.setSenhafunc(resultado.getString("senha"));
                    func.setCodtipo(resultado.getInt("codtipo"));
                    funcionario.add(func);
                }
                return funcionario;
    } 
    public Funcionario consultar(Funcionario obj){
        Funcionario func = null;
        String sql = " SELECT * FROM funcionario WHERE nome=?; ";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, obj.getNomefunc());
                
                ResultSet resultado = operacao.executeQuery();
                 while (resultado.next()) {
                    func = new Funcionario();
                    func.setCodfunc(resultado.getInt("codfuncionario"));
                    func.setNomefunc(resultado.getString("nome"));
                    func.setTipofunc(resultado.getInt("codtipo"));
                }
        } catch (SQLException ex) {
            Logger.getLogger(FuncionarioDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
        
        
        return func;
    }
}
