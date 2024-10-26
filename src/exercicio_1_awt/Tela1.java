package exercicio_1_awt;

import java.awt.*;
import java.awt.event.*;

public class Tela1 extends Frame {
	
	public Tela1() {
	
	setTitle("Primeira tela");
	setResizable(true); 
	setSize(600,500); 
	setLocation(300,100);
	setBackground(Color.white);
	addWindowListener(new Ouvidoria());
	
	}
	
	class Ouvidoria implements WindowListener {
		public void windowOpened(WindowEvent e) { }
	    public void windowClosing(WindowEvent e)  { System.exit(0); }
	    public void windowClosed(WindowEvent e) { } // fecha
	    public void windowIconified(WindowEvent e) { } 
	    public void windowDeiconified(WindowEvent e) { }
	    public void windowActivated(WindowEvent e) { }
	    public void windowDeactivated(WindowEvent e) { }
	}
	public static void main (String[]args) {
		new Tela1().setVisible(true);		
	}
}
