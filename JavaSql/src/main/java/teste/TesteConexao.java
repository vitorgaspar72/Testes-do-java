/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import conexao.ConexaoFactory;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;


public class TesteConexao {
    public static void main(String[] args) throws SQLException  {
        
        
        Connection conexao = null;
       
        try {
            conexao = ConexaoFactory.conectar();
            JOptionPane.showMessageDialog(null, "Conexão efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Conexão mal sucedida! "+ex.getMessage());
        }
        
    }
}
