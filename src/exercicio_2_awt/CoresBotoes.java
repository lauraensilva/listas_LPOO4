package exercicio_2_awt;

import java.awt.*;
import java.awt.event.*;

public class CoresBotoes extends Frame implements ActionListener {
	public Label L1;
    public Button B_sair, B_vermelho, B_voltar, B_azul, B_amarelo;
    public TextField Tx;
    public Dimension dim;
    
    public CoresBotoes() {
        dim = Toolkit.getDefaultToolkit().getScreenSize();
        setSize(dim);
        setLocation(0,0);
        setTitle("A interface \"Action Listner\"" );
        
        setBackground(new Color(250,250,200));
        setLayout(null);    

        L1 = new Label("Aperte o botão :");
        L1.setLocation(50,50);
        L1.setBackground(new Color(250,250,200));
        L1.setSize(150,20);

        B_sair = new Button("Sair");
        B_sair.setSize(60,20);
        B_sair.setLocation(50,150);
        B_sair.setBackground(new Color(200,220,200));
        B_sair.addActionListener(this);

        B_vermelho = new Button ("Vermelho");
        B_vermelho.setSize(60,20);
        B_vermelho.setLocation(200,150);
        B_vermelho.setBackground(new Color(200,220,200));
        B_vermelho.addActionListener(this);

        B_voltar = new Button("Voltar");
        B_voltar.setSize(60,20);
        B_voltar.setLocation(200,200);
        B_voltar.setBackground(new Color(200,220,200));
        B_voltar.addActionListener(this);
        
        B_azul = new Button("Azul");
        B_azul.setSize(60,20);
        B_azul.setLocation(200,250);
        B_azul.setBackground(new Color(200,220,200));
        B_azul.addActionListener(this);
        
        B_amarelo = new Button("Amarelo");
        B_amarelo.setSize(60,20);
        B_amarelo.setLocation(200,300);
        B_amarelo.setBackground(new Color(200,220,200));
        B_amarelo.addActionListener(this);

        add(L1);
        add(B_sair);
        add(B_vermelho);
        add(B_voltar);
        add(B_azul);
        add(B_amarelo);
        
        addWindowListener(new FechaJanela());       
    }
    
    
    public void actionPerformed(ActionEvent e){
    
        if ( e.getSource( ) == B_sair ) 
            System.exit ( 0 )  ;
        

        if ( e.getSource( ) == B_vermelho ){
            setBackground ( Color.red ) ;
            L1.setBackground(Color.red);
        }
        if ( e.getSource( ) == B_voltar ){
            setBackground (new Color(250,250,200)) ;
            L1.setBackground(new Color(250,250,200));    
        } 
        if ( e.getSource( ) == B_azul ){
        	if(!getBackground().equals(Color.blue)) {
        		setBackground ( Color.blue ) ;
                L1.setBackground(Color.blue); 
        	}else {
        		setBackground ( new Color (170,170,170)) ;
                L1.setBackground(new Color (170,170,170));
        	}
             
        }
        
        if ( e.getSource( ) == B_amarelo ){
        	if(!getBackground().equals(Color.yellow)) {
        		setBackground ( Color.yellow) ;
                L1.setBackground(Color.yellow); 
        	}else {
        		setBackground ( new Color (110,200,80)) ;
                L1.setBackground(new Color (110,200,80));
        	}
        }
    }
    public static void main(String arg[]){
        //new j2exe8().show();
        new CoresBotoes().setVisible(true);
    }
}


