package exercicio_1_awt;
import java.awt.*;
import java.awt.event.*;


public class Cad_Fam extends Frame implements ActionListener {
	private TextField tmae, tpai, tfilho;
	private Label lmae, lpai, lfilho;
	private Button bcadastrar, bnovo;
	
	
	public Cad_Fam() {
	    setTitle("Cadastro de Família");
	    setResizable(true); 
	    setSize(500,400); 
	    setLocation(300,100);
	    setBackground(Color.gray);
	    addWindowListener(new Ouvidoria());
	    
	    lmae = new Label("Nome da Mãe:");
	    lpai = new Label("Nome do Pai:");
	    lfilho = new Label("Nome do Filho:");
	
	    tmae = new TextField(50);
	    tpai = new TextField(20);
	    tfilho = new TextField(20);
	 
	    lmae.setBounds(50, 50, 100, 30);
	    tmae.setBounds(160, 50, 200, 30);
	    lpai.setBounds(50, 90, 100, 30);
	    tpai.setBounds(160, 90, 200, 30);
	    lfilho.setBounds(50, 130, 100, 30);
	    tfilho.setBounds(160, 130, 200, 30);	    
	    
	    
	    bcadastrar = new Button("Salva");
	    bcadastrar.addActionListener(this);
	    bcadastrar.setBounds(100, 230, 100, 30);
	    bnovo = new Button("Novo");
	    bnovo.addActionListener(this);
	    bnovo.setBounds(200,230,100,30);
	    
	    add(lmae);
	    add(tmae);
	    add(lpai);
	    add(tpai);
	    add(lfilho);
	    add(tfilho);
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
		
		}
		
	
	
	public static void main (String[]args) {
		new Cad_Fam().setVisible(true);
		}

}
