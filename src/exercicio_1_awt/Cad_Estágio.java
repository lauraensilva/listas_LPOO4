package exercicio_1_awt;
import java.awt.*;
import java.awt.event.*;

public class Cad_Estágio extends Cadastro_Alunos {
	
	TextField tqualidades;
	Label lqualidades;
	
	public Cad_Estágio() {
		
		setTitle("Cadastro Estágio");
		lqualidades = new Label("Principais Qualidades:");
		tqualidades = new TextField(50);
		tqualidades.setBounds(160, 330, 200, 30);
	    lqualidades.setBounds(50,330,100,30);
	    
	    add(lqualidades);
	    add(tqualidades);
	}
	public static void main(String[]args) {
		new Cad_Estágio().setVisible(true);
	}
}
