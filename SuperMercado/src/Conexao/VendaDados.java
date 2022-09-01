/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexao;

/**
 *
 * @author pc
 */

import Modelo.Venda;
import Modelo.Produto;
import Modelo.DetalheVenda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VendaDados {
    Connection con = new Bdados().getConnection();
    private String sql;
    
     /**
     *
     * @param obj
     * @return
     * @throws SQLException
     */
    
    public boolean incluirVenda(Venda obj) throws SQLException {
        String sql = "insert into venda(nomecliente, datavenda) values(?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setString(1, obj.getNomecliente());
        ps.setString(2, obj.getDatavenda());
     
        int registros = ps.executeUpdate();
        if (registros > 0) {
            return true;
        } else {
            return false;
        }
    }
    public List<Venda> pegarultimo(Venda obj) throws SQLException{
        List<Venda> venda = new ArrayList<>();
         String sql = " SELECT codvenda, nomecliente from venda where nomecliente = ?";
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setString(1, obj.getNomecliente());
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Venda func = new Venda();
                    func.setCodvenda(resultado.getInt("codvenda"));
                    func.setNomecliente(resultado.getString("nomecliente"));
                    venda.add(func);
                }
                return venda;
    }
    public List<Venda> mostrar(Venda obj) throws SQLException{
        List<Venda> venda = new ArrayList<>();
         String sql = " SELECT produto.codproduto, produto.descricao,produto.precounit, detalhevenda.quantidade, detalhevenda.preco "
                 + " FROM produto, detalhevenda, venda Where ( (produto.codproduto = detalhevenda.codproduto)"
                 + " and (detalhevenda.codvenda = venda.codvenda)) and venda.codvenda = ?";
      
                PreparedStatement operacao = con.prepareStatement(sql);
                operacao.setInt(1, obj.getCodvenda());
                ResultSet resultado = operacao.executeQuery();
                
                while (resultado.next()) {
                    Venda func = new Venda();
                    func.setCproduto(resultado.getInt("produto.codproduto"));
                    func.setDescproduto(resultado.getString("produto.descricao"));
                    func.setTotal(resultado.getInt("produto.precounit"));
                    func.setQuant(resultado.getInt("detalhevenda.quantidade"));
                    func.setPreco(resultado.getInt("detalhevenda.preco"));
                    venda.add(func);
                }
                return venda;
    }
    public void actualizarVenda(Venda obj) throws SQLException {
      
        String sql = " UPDATE venda SET nomecliente=?, datavenda=?, precototal=?, codfuncionario=? WHERE codvenda = ?";
       try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, obj.getNomecliente());
            ps.setString(2, obj.getDatavenda());
            ps.setInt(3, obj.getPrecototal());
            ps.setInt(4, obj.getCodfunc());
            ps.setInt(5, obj.getCodvenda());
            ps.execute();
       } catch (SQLException ex) {
            Logger.getLogger(VendaDados.class.getName()).log(Level.SEVERE, null, ex);
        }  
    
    }
}
