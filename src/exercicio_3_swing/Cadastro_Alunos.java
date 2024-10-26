package exercicio_3_swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Cadastro_Alunos extends ClasseJFrame implements ActionListener {
    public static JLabel Lmatricula, lsenha1, lsenha2;
    public static JTextField tmatricula;
    public static JPasswordField tsenha1, tsenha2;
    public static JButton bsalvar, blimpar;
    public static Font F;

    Cadastro_Alunos() {
        super();
        setTitle("Alteração de Senha - Portal do Aluno");
        setBounds(200, 150, 500, 300);
        Font F = new Font("Sans Serif", Font.PLAIN, 16);
        this.F = F;
        getContentPane().setLayout(null);


     
        JLabel Lmatricula = new JLabel();
        this.Lmatricula = Lmatricula;
        Lmatricula.setText("Matrícula:");
        Lmatricula.setSize(200, 15);
        Lmatricula.setFont(F);
        Lmatricula.setLocation(105, 5);
        Lmatricula.setForeground(Color.blue);
        getContentPane().add(Lmatricula);

        
        tmatricula = new JTextField();
        this.tmatricula = tmatricula;
        tmatricula.setSize(150, 20);
        tmatricula.setLocation(250, 5);
        getContentPane().add(tmatricula);

       
        lsenha1 = new JLabel();
        this.lsenha1 = lsenha1;
        lsenha1.setText("Digite a Senha:");
        lsenha1.setSize(200, 15);
        lsenha1.setFont(F);
        lsenha1.setLocation(105, 30);
        lsenha1.setForeground(Color.blue);
        getContentPane().add(lsenha1);

        tsenha1 = new JPasswordField();
        this.tsenha1 = tsenha1;
        tsenha1.setSize(150, 20);
        tsenha1.setLocation(250, 30);
        getContentPane().add(tsenha1);

        
        lsenha2 = new JLabel();
        this.lsenha2 = lsenha2;
        lsenha2.setText("Confirme a Senha:");
        lsenha2.setSize(200, 15);
        lsenha2.setFont(F);
        lsenha2.setLocation(105, 55); 
        lsenha2.setForeground(Color.blue);
        getContentPane().add(lsenha2);

        tsenha2 = new JPasswordField();
        this.tsenha2 = tsenha2;
        tsenha2.setSize(150, 20);
        tsenha2.setLocation(250, 55); 
        getContentPane().add(tsenha2);
    

        
        bsalvar = new JButton("Salvar");
        bsalvar.setSize(80, 25);
        bsalvar.setLocation(105, 100); 
        getContentPane().add(bsalvar);

        // Botão Limpar
        blimpar = new JButton("Limpar");
        blimpar.setSize(80, 25);
        blimpar.setLocation(200, 100); 
        getContentPane().add(blimpar);
        
        
    }
    
    
    public void actionPerformed(ActionEvent e){
        if ( e.getSource( ) == blimpar ) {
        	
        	tmatricula.setText(null);
        	tsenha1.setText("");
        	tsenha2.setText("");
        }
            

        if ( e.getSource( ) == bsalvar ){
        	String matricula = tmatricula.getText();
        	String senha1 = tsenha1.getText();
        	String senha2 = tsenha2.getText();
            if (matricula.isEmpty()|| senha1.isEmpty()||senha2.isEmpty()) {
            	JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
            }
            if (!senha1.equals(senha2)) {
            	JOptionPane.showMessageDialog(null, "As senhas não correspondem!");
            }else {
            	JOptionPane.showMessageDialog(null, "Salvo com sucesso");
            }
        }
       
    }
    


    public static void main(String[] args) {
        Cadastro_Alunos Ex = new Cadastro_Alunos();
        Ex.show();
    }
}