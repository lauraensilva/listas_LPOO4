package exercicio_1_awt;
import java.awt.*;
import java.awt.event.*;


public class Cad_Usuários extends Frame implements ActionListener {
	private TextField tusuario, tsenha, temail, ttelefone, tnome;
	private Label lusuario, lsenha, lemail, ltelefone, lnome;
	private Button bcadastrar, bnovo;

	
	public Cad_Usuários() {
	    setTitle("Cadastro de Usuários");
	    setResizable(true); 
	    setSize(500,600); 
	    setLocation(300,100);
	    setBackground(Color.gray);
	    addWindowListener(new Ouvidoria());
	    
	    lusuario = new Label("Usuário:");
	    lsenha = new Label("Senha:");
	    lemail = new Label("Email:");
	    ltelefone = new Label("Telefone:");
	    lnome = new Label("Nome:");
	    
	  
	    
	    tusuario = new TextField(50);
	    tsenha = new TextField(20);
	    temail = new TextField(20);
	    ttelefone = new TextField(20);
	    tnome = new TextField(20);
	    

	 
	    lusuario.setBounds(50, 50, 100, 30);
	    tusuario.setBounds(160, 50, 200, 30);
	    lsenha.setBounds(50, 90, 100, 30);
	    tsenha.setBounds(160, 90, 200, 30);
	    lemail.setBounds(50, 130, 100, 30);
	    temail.setBounds(160, 130, 200, 30);
	    ltelefone.setBounds(50, 170, 100, 30);
	    ttelefone.setBounds(160, 170, 200, 30);
	    lnome.setBounds(50, 210, 100, 30);
	    tnome.setBounds(160, 210, 200, 30);
	    
	    

	    
	    bcadastrar = new Button("Salva");
	    bcadastrar.addActionListener(this);
	    bcadastrar.setBounds(100, 330, 100, 30);
	    bnovo = new Button("Novo");
	    bnovo.addActionListener(this);
	    bnovo.setBounds(200,330,100,30);
	    
	    add(lusuario);
	    add(tusuario);
	    add(lsenha);
	    add(tsenha);
	    add(lemail);
	    add(temail);
	    add(ltelefone);
	    add(ttelefone);
	    add(lnome);
	    add(tnome);
	    add(lemail);
	    add(temail);
	    add(bcadastrar);
	    add(bnovo);
	    
	    setLayout(null);
	    setVisible(true);
	}
	
	class Ouvidoria implements WindowListener {
		public void windowOpened(WindowEvent e) { }
	    public void windowClosing(WindowEvent e)  { System.exit(0); }
	    public void windowClosed(WindowEvent e) { }
	    public void windowIconified(WindowEvent e) { }
	    public void windowDeiconified(WindowEvent e) { }
	    public void windowActivated(WindowEvent e) { }
	    public void windowDeactivated(WindowEvent e) { }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main (String[]args) {
		new Cad_Usuários().setVisible(true);
		}

}
