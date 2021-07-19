
package teste;

import dao.FabricanteDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Fabricante;


public class TesteNomeFabricante {

   
    public static void main(String[] args) {
        FabricanteDAO fab = new FabricanteDAO();
        
        
        try{
            Fabricante f1= new Fabricante();
            String nome = JOptionPane.showInputDialog(null, "Digite o nome do fabricante: ");
            f1=fab.nomeFabricante(nome);
            
            if(f1.getNome()==null){
                JOptionPane.showMessageDialog(null, "Fabricante não encontrado!");
                System.exit(0);
            }
            
            JOptionPane.showMessageDialog(null, "ID do fabricante: "+f1.getIdFabricante()+
                    "\nNome do Fabricante: "+f1.getNome());
        }catch(SQLException e){
           JOptionPane.showMessageDialog(null, "Erro de busca: erro no banco de dados");
        }catch(NumberFormatException number){
           JOptionPane.showMessageDialog(null, "Digite um nome no formato correto!");
       }
    }
    
}
