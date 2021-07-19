/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import conexao.ConexaoFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Fabricante;
import modelo.Produto;

/**
 *
 * @author Elisete
 */
public class ProdutoDAO {
     
    
    
    public ProdutoDAO(){
        
    }
    
    public void cadastraProduto(Produto prod) throws SQLException{
        Connection conexao = ConexaoFactory.conectar();
       
        String sql = "INSERT INTO produto(idProduto, nome, qtd, preco, idFabricante) VALUES (?,?,?,?,?)";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1,prod.getIdProduto());
        stmt.setString(2,prod.getNomeProduto());
        stmt.setInt(3, prod.getQuantidade());
        stmt.setDouble(4, prod.getValor());
        stmt.setInt(5, prod.getFabricante().getIdFabricante());
        
        stmt.executeUpdate();
    }
    
    public void excluiProduto(Produto prod)throws SQLException{
         Connection conexao = ConexaoFactory.conectar();
         String sql= "DELETE FROM produto WHERE nome=?";
         PreparedStatement stmt = conexao.prepareStatement(sql);
         stmt.setString(1, prod.getNomeProduto());
         stmt.executeUpdate();
    }
    
    public void editaProduto(Produto prod) throws SQLException{
        Connection conexao = ConexaoFactory.conectar();
        String sql= "UPDATE produto SET nome=?,qtd=?,preco=?,idFabricante=? WHERE idProduto=?";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, prod.getNomeProduto());
        stmt.setInt(2,prod.getQuantidade());
        stmt.setDouble(3, prod.getValor());
        stmt.setInt(4,prod.getFabricante().getIdFabricante());
        stmt.setInt(5, prod.getIdProduto());
        stmt.executeUpdate();
    }
    
    public ArrayList<Produto> listaProduto() throws SQLException{
        Connection conexao = ConexaoFactory.conectar();
        String sql="SELECT p.idProduto, p.nome, p.qtd, p.preco, f.idFabricante, f.nome FROM produto p INNER JOIN fabricante f ON f.idFabricante = p.idFabricante";
        PreparedStatement stmt = conexao.prepareStatement(sql);
        
        ResultSet result = stmt.executeQuery();
        ArrayList<Produto> produtos = new ArrayList<>();
        ArrayList<Fabricante> fabricantes = new ArrayList<>();
        
        while(result.next()){
            Produto p1 = new Produto();
            Fabricante f1 = new Fabricante();
            p1.setIdProduto(result.getInt("p.idProduto"));
            p1.setNomeProduto(result.getString("p.nome"));
            p1.setQuantidade(result.getInt("p.qtd"));
            p1.setValor(result.getDouble("p.preco"));
            f1.setIdFabricante(result.getInt("f.idFabricante"));
            f1.setNome(result.getString("f.nome"));
            p1.setFabricante(f1);
           
            
            produtos.add(p1);
        }
        
        return produtos;
    }
}
