package exercicio_1_awt;
import java.awt.*;
import java.awt.event.*;


public class Cad_Carro extends Frame implements ActionListener {
	private TextField tmodelo, tmotor, tcor, tporta, tpessoas;
	private Label lmodelo, lmotor, lcor, lporta, lpessoas;
	private Button bcadastrar, bnovo;

	
	public Cad_Carro() {
	    setTitle("Cadastre o Carro dos Seus Sonhos!");
	    setResizable(true); 
	    setSize(500,600); 
	    setLocation(300,100);
	    setBackground(Color.gray);
	    addWindowListener(new Ouvidoria());
	    
	    lmodelo = new Label("Modelo:");
	    lmotor = new Label("Motor:");
	    lcor = new Label("Cor:");
	    lporta= new Label("Quantidade de Portas:");
	    lpessoas = new Label("Quantidade de Pessoas:");
	    

	    tmodelo = new TextField(50);
	    tmotor = new TextField(20);
	    tcor = new TextField(20);
	    tporta = new TextField(20);
	    tpessoas = new TextField(20);
	
	    
	    lmodelo.setBounds(50, 50, 150, 30);
	    tmodelo.setBounds(200, 50, 200, 30);
	    lmotor.setBounds(50, 90, 150, 30);
	    tmotor.setBounds(200, 90, 200, 30);
	    lcor.setBounds(50, 130, 150, 30);
	    tcor.setBounds(200, 130, 200, 30);
	    lporta.setBounds(50, 170, 150, 30);
	    tporta.setBounds(200, 170, 200, 30);
	    lpessoas.setBounds(50, 210, 150, 30);
	    tpessoas.setBounds(200, 210, 200, 30);
	    
	    
	
	    bcadastrar = new Button("Salva");
	    bcadastrar.addActionListener(this);
	    bcadastrar.setBounds(100, 330, 100, 30);
	    bnovo = new Button("Novo");
	    bnovo.addActionListener(this);
	    bnovo.setBounds(200,330,100,30);
	    
	    add(lmodelo);
	    add(tmodelo);
	    add(lmotor);
	    add(tmotor);
	    add(lcor);
	    add(tcor);
	    add(lporta);
	    add(tporta);
	    add(lpessoas);
	    add(tpessoas);
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
		new Cad_Carro().setVisible(true);
		}

}
