package exercicio_1_awt;
import java.awt.*;
import java.awt.event.*;


public class Cad_Despesas extends Frame implements ActionListener {
	private TextField tnome, tvalor, tdata;
	private Label lnome, lvalor, ldata;
	private Button bcadastrar, bnovo;
	CheckboxGroup cbgTipo;
	Checkbox entrada, saída;
	

	
	public Cad_Despesas() {
	    setTitle("Controle de Despesas");
	    setResizable(true); 
	    setSize(500,600); 
	    setLocation(300,100);
	    setBackground(Color.gray);
	    addWindowListener(new Ouvidoria());
	    
	    lnome = new Label("Nome:");
	    lvalor = new Label("Valor:");
	    ldata = new Label("Data:");
	    
	    tnome = new TextField(50);
	    tvalor = new TextField(20);
	    tdata = new TextField(20);
	 
	    lnome.setBounds(50, 50, 150, 30);
	    tnome.setBounds(200, 50, 200, 30);
	    lvalor.setBounds(50, 90, 150, 30);
	    tvalor.setBounds(200, 90, 200, 30);
	    ldata.setBounds(50, 130, 150, 30);
	    tdata.setBounds(200, 130, 200, 30);
	    
	    cbgTipo = new CheckboxGroup();
	    entrada = new Checkbox("Entrada", false, cbgTipo);
	    entrada = new Checkbox("Saída", false, cbgTipo);
	    saída.setBounds(160, 290, 90, 30);
	    saída.setBounds(260, 290, 90, 30);
	    
	
	    bcadastrar = new Button("Salva");
	    bcadastrar.addActionListener(this);
	    bcadastrar.setBounds(100, 330, 100, 30);
	    bnovo = new Button("Novo");
	    bnovo.addActionListener(this);
	    bnovo.setBounds(200,330,100,30);
	    
	  
	    add(lnome);
	    add(tnome);
	    add(lvalor);
	    add(tvalor);
	    add(ldata);
	    add(tdata);
	    add(bcadastrar);
	    add(bnovo);
	    add(entrada);
	    add(saída);
	    
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
		new Cad_Despesas().setVisible(true);
		}

}
