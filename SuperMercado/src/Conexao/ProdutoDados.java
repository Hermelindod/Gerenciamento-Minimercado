/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;


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
public class ProdutoDados {
    
    Connection con = new Bdados().getConnection();
    private String sql;

    /**
     *
     * @param obj
     * @return
     * @throws SQLException
     */
    public boolean incluirProduto(Produto obj) throws SQLException {
        String sql = "insert into produto(descricao, precounit, stock, data, codfornecedor) values(?,?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, obj.getDescricaoproduto());
        ps.setInt(2, obj.getPrecounit());
        ps.setInt(3, obj.getStock());
        ps.setString(4, obj.getData());
        ps.setInt(5, obj.getCodfornecedor());

        int registros = ps.executeUpdate();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void Remover(Produto obj){
         String sql = " DELETE FROM produto WHERE codproduto = ? ";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setInt(1, obj.getCodproduto());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
      
    public void Actualizar(Produto obj){
         String sql = " UPDATE produto SET descricao=?, precounit=?, stock = ?, data=?, codfornecedor=? WHERE codproduto= ?";
                
        try {
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, obj.getDescricaoproduto());
                operacao.setInt(2, obj.getPrecounit());
                operacao.setInt(3, obj.getStock());
                operacao.setString(4, obj.getData());
                operacao.setInt(5, obj.getCodfornecedor());
                operacao.setInt(6, obj.getCodproduto());
                operacao.execute();
                          
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
    public List<Produto> mostrar() throws SQLException{
        List<Produto> produto = new ArrayList<>();
         String sql = " SELECT * FROM produto order by codproduto; ";
      
                PreparedStatement operacao = con.prepareStatement(sql);
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Produto func = new Produto();
                    func.setCodproduto(resultado.getInt("codproduto"));
                    func.setDescricaoproduto(resultado.getString("descricao"));
                    func.setPrecounit(resultado.getInt("precounit"));
                    func.setStock(resultado.getInt("stock"));
                    func.setData(resultado.getString("Data"));
                    func.setCodfornecedor(resultado.getInt("codfornecedor"));
                    produto.add(func);
                }
                return produto;
    }
    public List<Produto> pesquisar(Produto obj) throws SQLException{
        List<Produto> produto = new ArrayList<>();
         String sql = " SELECT * FROM produto where descricao like ? order by codproduto; ";
      
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, "%" + obj.getDescricaoproduto() + "%");
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Produto func = new Produto();
                    func.setCodproduto(resultado.getInt("codproduto"));
                    func.setDescricaoproduto(resultado.getString("descricao"));
                    func.setPrecounit(resultado.getInt("precounit"));
                    func.setStock(resultado.getInt("stock"));
                    func.setData(resultado.getString("Data"));
                    func.setCodfornecedor(resultado.getInt("codfornecedor"));
                    produto.add(func);
                }
                return produto;
    }
    
}
