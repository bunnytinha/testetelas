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

public class Tela extends JFrame implements ActionListener{
   private JButton botao1;
   private JButton botao2;
   private JButton botao3;
   
   public Tela(){
      super("Kime Dachi - Menu");
      botao1 = new JButton("Alunos");
      botao2 = new JButton("Perguntas");
      botao3 = new JButton("Dojo");
      
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
         new PaginaAluno();
         System.out.println("Alunos");
      }
   }
}
