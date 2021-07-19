
package teste;

import dao.FabricanteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Fabricante;


public class TesteListarFabricante {

   
    public static void main(String[] args)  {
       FabricanteDAO fab= new FabricanteDAO();
       
       String idfab = JOptionPane.showInputDialog(null, "Digite o id do fabricante");
       int id = Integer.parseInt(idfab);
        
       try{
           Fabricante f1 = fab.idFabricante(id);
           JOptionPane.showMessageDialog(null, "ID do fabricante: "+f1.getIdFabricante()+
                   "\nNome do fabricante: "+f1.getNome());
           
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de busca: Fabricante não encontrado ou erro no banco de dados");
       }
       
       try{
         ArrayList fabricantes = fab.listaFabricante();
         for(int i=0;i<fabricantes.size();i++){
             System.out.println(fabricantes.get(i).toString());
         }
        }catch(SQLException e){
         JOptionPane.showMessageDialog(null,"Não foi possível listar os fabricantes"+e.getMessage());
     }   
    }
    
}
