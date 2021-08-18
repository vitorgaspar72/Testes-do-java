
package ListSetMap;

import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.showMessageDialog;


public class MAP {

    /**
     * Map é tipo de lista que guarda dois tipos de parametros no mesmo local de memoria
     * Map não mantém a ordem
     * 
     */
    public static void main(String[] args) {
       Map usuarios = new HashMap<String, Integer>();
       
       usuarios.put("Vitor", 213123);  // O primeiro parametro é a chave, ou seja, identificaçao... o segundo é um valor atrelado a essa chave
       usuarios.put("Leni", null);
       usuarios.put("Orso", 789213);
       usuarios.put("Paulo", 123);
       usuarios.put("Diego", 3123211);
       
       saberSenha("Orso",usuarios);
       lerMapa(usuarios);
       
       String nome = JOptionPane.showInputDialog(null, "Digite o nome do novo usuário");
       String senha = JOptionPane.showInputDialog(null, "Digite a senha");
       int pass = Integer.parseInt(senha);
       cadastrarSenha(nome,pass,usuarios);
       
    }
    
    
    public static void lerMapa(Map<String,Integer> mapa){
        mapa.forEach((nome,senha)->{
            System.out.println("Nome do usuário :"+nome+"\nSenha: "+senha);  
        });
    }
    
    public static void saberSenha(String nome,Map<String, Integer> senhas){
        if(!senhas.containsKey(nome)){ // Verifica se a chave colocada é falsa
            System.out.println("Usuário não encontrado!\n-------------------");
            
        }else{
        System.out.println("Senha do usuário "+nome+ ": "+senhas.get(nome));
        System.out.println("---------------------------");}
    }
    
    public static void cadastrarSenha(String nome, Integer senha,Map<String,Integer> mapa){
        mapa.put(nome, senha);
        
        System.out.println("--------------------");
        System.out.println("Usuário cadastrado:\n Nome: "+nome+"\n Senha: "+senha);
    }
    
}
