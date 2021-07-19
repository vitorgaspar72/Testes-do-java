
package teste.Produto;

import dao.ProdutoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Fabricante;
import modelo.Produto;


public class EditaProduto {

    public static void main(String[] args) {
        ProdutoDAO prod = new ProdutoDAO();
        
        Produto prod1 = new Produto();
        Fabricante f1 = new Fabricante();
        
        
        try{ 
            prod1.setNomeProduto("Pepsi");
            prod1.setQuantidade(900);
            prod1.setValor(2.99);
            f1.setIdFabricante(6);
            prod1.setFabricante(f1);
            prod1.setIdProduto(5);
            prod.editaProduto(prod1);
            
            
            JOptionPane.showMessageDialog(null, "Produto alterado com sucesso!");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Erro de alteração do produto"+e.getMessage());
        }
    }
    
}
