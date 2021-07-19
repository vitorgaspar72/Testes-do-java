/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import dao.FabricanteDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Fabricante;
import java.lang.NumberFormatException;

/**
 *
 * @author Elisete
 */
public class TesteIdFabricante {

    public static void main(String[] args) {

        
       try{
             FabricanteDAO fab= new FabricanteDAO();
       
       String idfab = JOptionPane.showInputDialog(null, "Digite o id do fabricante");
       int id = Integer.parseInt(idfab);
           Fabricante f1 = fab.idFabricante(id);
           if(f1.getNome()==null){
               JOptionPane.showMessageDialog(null, "Fabricante não encontrado!");
               System.exit(0);
           }
           JOptionPane.showMessageDialog(null, "ID do fabricante: "+f1.getIdFabricante()+
                   "\nNome do fabricante: "+f1.getNome());
           
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de busca: erro no banco de dados");
       }catch(NumberFormatException number){
           JOptionPane.showMessageDialog(null, "Digite um id no formato correto!");
       }
    }
    
}
