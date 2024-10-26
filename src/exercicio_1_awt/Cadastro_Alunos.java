package exercicio_1_awt;
import java.awt.*;
import java.awt.event.*;


public class Cadastro_Alunos extends Frame implements ActionListener {
	TextField tnome, trg, tcpf, ttitulo, tnaturalidade, temail;
	Label lnome, lrg, lcpf, ltitulo, lnaturalidade, lsexo, lemail;
	Button bsalvar, bnovo;
	CheckboxGroup cbgSexo;
	Checkbox masculino, feminino;
	
	public Cadastro_Alunos() {
	    setTitle("Cadastro de Alunos");
	    setResizable(true); 
	    setSize(500,600); 
	    setLocation(300,100);
	    setBackground(Color.gray);
	    addWindowListener(new Ouvidoria());
	    
	    lnome = new Label("Nome:");
	    lrg = new Label("RG:");
	    lcpf = new Label("CPF:");
	    ltitulo = new Label("Título de Eleitor:");
	    lnaturalidade = new Label("Naturalidade:");
	    lemail = new Label("Email:");
	    lsexo = new Label("Sexo:");
	    
	    tnome = new TextField(50);
	    trg = new TextField(20);
	    tcpf = new TextField(20);
	    ttitulo = new TextField(20);
	    tnaturalidade = new TextField(20);
	    temail = new TextField(20);

	 
	    lnome.setBounds(50, 50, 100, 30);
	    tnome.setBounds(160, 50, 200, 30);
	    lrg.setBounds(50, 90, 100, 30);
	    trg.setBounds(160, 90, 200, 30);
	    lcpf.setBounds(50, 130, 100, 30);
	    tcpf.setBounds(160, 130, 200, 30);
	    ltitulo.setBounds(50, 170, 100, 30);
	    ttitulo.setBounds(160, 170, 200, 30);
	    lnaturalidade.setBounds(50, 210, 100, 30);
	    tnaturalidade.setBounds(160, 210, 200, 30);
	    lemail.setBounds(50, 250, 100, 30);
	    temail.setBounds(160, 250, 200, 30);
	    lsexo.setBounds(50,290,100,30);
	    
	    cbgSexo = new CheckboxGroup();
	    masculino = new Checkbox("Masculino", false, cbgSexo);
	    feminino = new Checkbox("Feminino", false, cbgSexo);
	    masculino.setBounds(160, 290, 90, 30);
	    feminino.setBounds(260, 290, 90, 30);
	    
	    bsalvar = new Button("Salva");
	    bsalvar.addActionListener(this);
	    bsalvar.setBounds(100, 530, 100, 30);
	    bnovo = new Button("Novo");
	    bnovo.addActionListener(this);
	    bnovo.setBounds(200,530,100,30);
	    
	    add(lnome);
	    add(tnome);
	    add(lrg);
	    add(trg);
	    add(lcpf);
	    add(tcpf);
	    add(ltitulo);
	    add(ttitulo);
	    add(lnaturalidade);
	    add(tnaturalidade);
	    add(lemail);
	    add(temail);
	    add(lsexo);
	    add(masculino);
	    add(feminino);
	    add(bsalvar);
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
		new Cadastro_Alunos().setVisible(true);
		}

}
