/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import Modelo.Fornecedor;
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
public class FornecedorDados {

    Connection con = new Bdados().getConnection();
    private String sql;

    /**
     *
     * @param obj
     * @return
     * @throws SQLException
     */
    public boolean incluirFornecedor(Fornecedor obj) throws SQLException {
        String sql = " insert into fornecedor (nome, email, telefone, cidade) values(?,?,?,?) ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, obj.getNomeforn());
        ps.setString(2, obj.getEmailforn());
        ps.setInt(3, obj.getTelefoneforn());
        ps.setString(4, obj.getCidadeforn());

        int registros = ps.executeUpdate();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void Remover(Fornecedor obj){
         String sql = " DELETE FROM fornecedor WHERE codfornecedor= ? ";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setInt(1, obj.getCodfornecedor());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    
    public void Actualizar(Fornecedor obj){
         String sql = " UPDATE fornecedor SET nome=?, email=?, telefone = ?, cidade=? WHERE codfornecedor= ?";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, obj.getNomeforn());
                operacao.setString(2, obj.getEmailforn());
                operacao.setInt(3, obj.getTelefoneforn());
                operacao.setString(4, obj.getCidadeforn());
                operacao.setInt(5, obj.getCodfornecedor());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    
    public List<Fornecedor> mostrar() throws SQLException{
        List<Fornecedor> fornecedor = new ArrayList<>();
         String sql = " SELECT * FROM fornecedor order by codfornecedor; ";
      
                PreparedStatement operacao = con.prepareStatement(sql);
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Fornecedor func = new Fornecedor();
                    func.setCodfornecedor(resultado.getInt("codfornecedor"));
                    func.setNomeforn(resultado.getString("nome"));
                    func.setEmailforn(resultado.getString("email"));
                    func.setTelefoneforn(resultado.getInt("telefone"));
                    func.setCidadeforn(resultado.getString("cidade"));
                    fornecedor.add(func);
                }
                return fornecedor;
    }
    public List<Fornecedor> pesquisar(Fornecedor obj) throws SQLException{
        List<Fornecedor> fornecedor = new ArrayList<>();
         String sql = " SELECT * FROM fornecedor where nome like ? order by codfornecedor; ";
      
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, "%" + obj.getNomeforn() + "%");
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Fornecedor func = new Fornecedor();
                    func.setCodfornecedor(resultado.getInt("codfornecedor"));
                    func.setNomeforn(resultado.getString("nome"));
                    func.setEmailforn(resultado.getString("email"));
                    func.setTelefoneforn(resultado.getInt("telefone"));
                    func.setCidadeforn(resultado.getString("cidade"));
                    fornecedor.add(func);
                }
                return fornecedor;
    }

}
