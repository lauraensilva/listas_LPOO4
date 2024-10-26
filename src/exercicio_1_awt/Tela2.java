package exercicio_1_awt;

import java.awt.*;
import java.awt.event.*;

public class Tela2 extends Tela1 {
	
	public Tela2() {
	
	setTitle("Segunda tela");
	setSize(400,300); 
	setLocation(100,100);
	Color verdeClaro = Color.green;
	setBackground(verdeClaro);
	
	}
	
	public static void main (String[]args) {
		
		new Tela2().setVisible(true);		
	}
}
