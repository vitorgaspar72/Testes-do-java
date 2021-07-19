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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Fabricante;

/**
 *
 * @author user
 */
public class FabricanteDAO {
    
    public FabricanteDAO(){
        
    }
    
    public void salvar(Fabricante f) throws SQLException{
        String sql="INSERT INTO fabricante(nome,telefone,email,endereco) VALUES (?,?,?,?)";
        Connection conexao= ConexaoFactory.conectar();
        
        PreparedStatement envio= conexao.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
        
        envio.setString(1, f.getNome());
        envio.setString(2, f.getTelefone());
        envio.setString(3, f.getEmail());
        envio.setString(4, f.getEndereco());
        envio.execute();
        
        
    }
    
    public void excluir(Fabricante f) throws SQLException{
        String sql="DELETE FROM fabricante WHERE idFabricante=?";
        Connection conexao = ConexaoFactory.conectar();
        PreparedStatement stmt= conexao.prepareStatement(sql);
        stmt.setInt(1, f.getIdFabricante());
        stmt.executeUpdate();
    }
    
    public void editar(Fabricante f) throws SQLException{
        String sql="UPDATE fabricante SET nome=?, SET telefone=?,SET email=?,SET endereco=? WHERE idFabricante=?";
        Connection conexao= ConexaoFactory.conectar();
        PreparedStatement stmt= conexao.prepareStatement(sql);
        stmt.setInt(5, f.getIdFabricante());
        stmt.setString(1, f.getNome());
        stmt.setString(2, f.getTelefone());
        stmt.setString(3, f.getEmail());
        stmt.setString(4, f.getEndereco());
        stmt.executeUpdate();
    }
    
    public ArrayList<Fabricante> listaFabricante() throws SQLException{
       
        String sql="SELECT idFabricante, nome, telefone, email, endereco FROM fabricante ";
        Connection conexao = ConexaoFactory.conectar();
        PreparedStatement stmt=conexao.prepareStatement(sql);
        ResultSet result = stmt.executeQuery();       
        ArrayList<Fabricante> fabricantes = new ArrayList<>();
        
        while(result.next()){
            Fabricante f = new Fabricante();
            f.setIdFabricante(result.getInt("idFabricante"));
            f.setNome(result.getString("nome"));
            f.setEmail(result.getString("email"));
            f.setTelefone(result.getString("telefone"));
            f.setEndereco(result.getString("endereco"));
            fabricantes.add(f);
        
        }
        return fabricantes;
    }
    
    public Fabricante idFabricante(int id) throws SQLException {
        String sql = "SELECT idFabricante, nome, telefone, email, endereco FROM fabricante WHERE idFabricante = ?";
        Connection conexao = ConexaoFactory.conectar();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setInt(1, id);
        ResultSet result = stmt.executeQuery();
        Fabricante f= new Fabricante();
        while(result.next()){
           
            f.setIdFabricante(result.getInt("idFabricante"));
            f.setNome(result.getString("nome"));
            f.setEmail(result.getString("email"));
            f.setEndereco(result.getString("endereco"));
            f.setTelefone(result.getString("telefone"));
        }
        
        return f;
    }
    
     public Fabricante nomeFabricante(String nome) throws SQLException {
        String sql = "SELECT idFabricante, nome, telefone, email, endereco FROM fabricante WHERE nome = ?";
        Connection conexao = ConexaoFactory.conectar();
        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, nome);
        ResultSet result = stmt.executeQuery();
        Fabricante f= new Fabricante();
        while(result.next()){
           
            f.setIdFabricante(result.getInt("idFabricante"));
            f.setNome(result.getString("nome"));
            f.setEmail(result.getString("email"));
            f.setEndereco(result.getString("endereco"));
            f.setTelefone(result.getString("telefone"));
        }
        
        return f;
    }
   
    
    
}
