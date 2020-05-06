import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.JPanel;

public class PaginaAluno extends JFrame implements ActionListener{
   private JButton botao1;
   private JButton botao2;
   private JButton botao3;
   public PaginaAluno paginaAluno;
   
   
   public PaginaAluno(){
      super("Kime Dachi - Alunos");
      botao1 = new JButton(" Lista de Alunos");
      botao2 = new JButton("Notas Alunos");
      botao3 = new JButton("Alterar Cadastro");
      
      
      Container caixa = getContentPane();
      
      caixa.setLayout(new FlowLayout());
      JPanel painel = new JPanel(new GridLayout(1,3));
      painel.add(botao1);
      painel.add(botao2);
      painel.add(botao3);
      caixa.add(painel);

      botao1.addActionListener(this);
   
   
      setSize(400,100);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setVisible(true);
      this.setLocationRelativeTo(null);
      
   }
   
   public void actionPerformed(ActionEvent a){
      if(a.getSource() == botao1){
         PaginaAluno paginaAluno = new PaginaAluno();
         System.out.println("Alunos");
      }
   }
}