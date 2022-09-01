/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

import Modelo.DetalheVenda;
import Modelo.Produto;
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
public class DetalheDados {
    Connection con = new Bdados().getConnection();
    private String sql;

    /**
     *
     * @param obj
     * @return
     * @throws SQLException
     */
    public boolean incluirDetalhe(DetalheVenda obj) throws SQLException {
        String sql = " insert into detalhevenda values(?,?,?,?) ";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, obj.getCodvenda());
        ps.setInt(2, obj.getCodproduto());
        ps.setInt(3, obj.getQuantidade());
        ps.setInt(4, (obj.getPreco() * obj.getQuantidade()));
    
        int registros = ps.executeUpdate();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void actualizarDetalhe(DetalheVenda obj) throws SQLException {
      
        String sql = " UPDATE detalhevenda SET quantidade=?, preco=? WHERE (codvenda = ? and codproduto= ?)";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getQuantidade());
            ps.setInt(2, (obj.getPreco() * obj.getQuantidade()));
            ps.setInt(3, obj.getCodvenda());
            ps.setInt(4, obj.getCodproduto());
            ps.execute();
       } catch (SQLException ex) {
            Logger.getLogger(DetalheDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    public void ActualizarStock(DetalheVenda obj){
         String sql = " UPDATE produto SET stock = (stock - ?) WHERE codproduto= ?";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setInt(1, obj.getQuantidade());
                operacao.setInt(2, obj.getCodproduto());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    public void VoltarStock(DetalheVenda obj){
         String sql = " UPDATE produto SET stock = (stock + ?) WHERE codproduto= ?";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setInt(1, obj.getQuantidade());
                operacao.setInt(2, obj.getCodproduto());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    public void VoltarStock2(DetalheVenda obj){
         String sql = " UPDATE produto SET stock = (stock + ?) WHERE codproduto= ?";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setInt(1, obj.getQuantidadeactualizada());
                operacao.setInt(2, obj.getCodproduto());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
     public void eliminarDetalhe(DetalheVenda obj) throws SQLException {
      
        String sql = " Delete from detalhevenda WHERE (codvenda = ? and codproduto= ?)";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getCodvenda());
            ps.setInt(2, obj.getCodproduto());
            ps.execute();
       } catch (SQLException ex) {
            Logger.getLogger(DetalheDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    public void cancelarDetalhe(DetalheVenda obj) throws SQLException {
      
        String sql = " Delete from detalhevenda WHERE (codvenda = ?)";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, obj.getCodvenda());
            ps.execute();
       } catch (SQLException ex) {
            Logger.getLogger(DetalheDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
}