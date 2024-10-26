package exercicio_1_awt;

import java.awt.*;
import java.awt.event.*;

public class Tela3 extends Tela1 {
	
	public Tela3() {
	
	setTitle("Terceira tela");
	setSize(500,500); 
	setLocation(300,300);
	Color rosa = Color.pink;
	setBackground(rosa);
	
	}
	
	
	public static void main (String[]args) {
		new Tela3().setVisible(true);		
	}
}
