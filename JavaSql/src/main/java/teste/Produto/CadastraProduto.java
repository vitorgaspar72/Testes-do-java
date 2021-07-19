
package teste.Produto;

import dao.ProdutoDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Fabricante;
import modelo.Produto;


public class CadastraProduto {

  
    public static void main(String[] args) {
       ProdutoDAO dao = new ProdutoDAO();
       Produto prod1 = new Produto();
       Produto prod2 = new Produto();
       Produto prod3 = new Produto();
       Produto prod4 = new Produto();
        
       Fabricante f1 = new Fabricante();
       Fabricante f2 = new Fabricante();
       Fabricante f3 = new Fabricante();
       
       f1.setIdFabricante(4);
       f2.setIdFabricante(5);
       f3.setIdFabricante(6);
       
       prod1.setFabricante(f1);
       prod1.setNomeProduto("Alpino");
       prod1.setQuantidade(89);
       prod1.setValor(5.90);
       
       prod2.setFabricante(f1);
       prod2.setNomeProduto("Leite Moça");
       prod2.setQuantidade(240);
       prod2.setValor(3.90);
       
       prod3.setFabricante(f2);
       prod3.setNomeProduto("Bis");
       prod3.setQuantidade(489);
       prod3.setValor(4.90);
       
       prod4.setFabricante(f3);
       prod4.setNomeProduto("Doritos");
       prod4.setQuantidade(4890);
       prod4.setValor(8.90);
       
       
       try{
       dao.cadastraProduto(prod1);
       dao.cadastraProduto(prod2);
       dao.cadastraProduto(prod3);
       dao.cadastraProduto(prod4);
       JOptionPane.showMessageDialog(null, "Produtos cadastrados com sucesso!");
       }catch(SQLException e){
           JOptionPane.showMessageDialog(null,"Erro ao cadastrar produto"+e.getMessage());
       }
    }
}
